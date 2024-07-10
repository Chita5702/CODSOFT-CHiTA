package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.FeedbackStudent;
import sms.db.FeedbackTeacher;
import sms.model.StudentFeedbackDao;
import sms.model.TeacherFeedbackDao;

/**
 * Servlet implementation class TeacherFeedback
 */
@WebServlet("/sms.controller.TeacherFeedback")
public class TeacherFeedback extends HttpServlet 
{
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			String regdno = request.getParameter("regdno");
			String emailid = request.getParameter("emailid");
			String message = request.getParameter("message");
			
			FeedbackTeacher fs = new FeedbackTeacher();
			fs.setRegdno(regdno);
			fs.setEmailid(emailid);
			fs.setMessage(message);
			
			int status = TeacherFeedbackDao.registerFeedback(fs);
			if(status>0)
			{
				response.sendRedirect("teacherFeedback.jsp?msg=Feedback Registered");
			}
			else
				response.sendRedirect("teacherFeedback.jsp?msg=Error in Sending");
			
			
			

	}

}
