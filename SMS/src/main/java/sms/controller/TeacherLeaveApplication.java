package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.StudentLeave;
import sms.db.TeacherLeave;
import sms.model.StudentLeaveDao;
import sms.model.TeacherLeaveDao;


@WebServlet("/sms.controller.TeacherLeaveApplication")
public class TeacherLeaveApplication extends HttpServlet 
{
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				String regdno=request.getParameter("regdno");
				String emailid=request.getParameter("emailid");
				String to=request.getParameter("to");
				String from=request.getParameter("from");
				String message=request.getParameter("message");
				
				TeacherLeave tl= new TeacherLeave();
				tl.setRegdno(regdno);
				tl.setEmailid(emailid);
				tl.setTo(to);
				tl.setFrom(from);
				tl.setMessage(message);
				
				int status=TeacherLeaveDao.registerLeave(tl);
				
				if(status>0)
				{
					response.sendRedirect("teacherLeaveApplication.jsp?msg=Applied");
				}
				else
					response.sendRedirect("teacherLeaveApplication.jsp?msg=Error");
				
				
	}

}
