package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.StudentLeave;
import sms.model.StudentLeaveDao;

/**
 * Servlet implementation class StudentLeaveApplication
 */
@WebServlet("/sms.controller.StudentLeaveApplication")
public class StudentLeaveApplication extends HttpServlet 
{
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				String regdno=request.getParameter("regdno");
				String emailid=request.getParameter("emailid");
				String to=request.getParameter("to");
				String from=request.getParameter("from");
				String message=request.getParameter("message");
				
				StudentLeave sl= new StudentLeave();
				sl.setRegdno(regdno);
				sl.setEmailid(emailid);
				sl.setTo(to);
				sl.setFrom(from);
				sl.setMessage(message);
				
				int status=StudentLeaveDao.registerLeave(sl);
				
				if(status>0)
				{
					response.sendRedirect("studentLeaveApplication.jsp?msg=Applied");
				}
				else
					response.sendRedirect("studentLeaveApplication.jsp?msg=Error");
				
				
	}

}
