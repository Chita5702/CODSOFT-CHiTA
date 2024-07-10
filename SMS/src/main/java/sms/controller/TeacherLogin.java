package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sms.db.Teacher;
import sms.model.TeacherDao;

/**
 * Servlet implementation class TeacherLogin
 */
@WebServlet("/sms.controller.TeacherLogin")
public class TeacherLogin extends HttpServlet 
{
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String emailid=request.getParameter("emailid");
			String password=request.getParameter("password");
			
			Teacher s=new Teacher();
			s.setEmailid(emailid);
			s.setPassword(password);
			
			int status=TeacherDao.validate(s);
		    if(status>0)
		    {
				HttpSession session = request.getSession();
				session.setAttribute("emailid", emailid);
				int result = TeacherDao.setStatus1(emailid);
				if(result>0)
				response.sendRedirect("teacherWelcome.jsp?msg=Login Success");
			}
			else
				response.sendRedirect("index.jsp?msg=Login Failed");
				
				
		

			
					
	}

}
