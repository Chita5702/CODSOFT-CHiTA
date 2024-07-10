package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.Admin;
import sms.db.Student;
import sms.db.Teacher;
import sms.model.AdminDao;
import sms.model.StudentDao;
import sms.model.TeacherDao;
import sms.service.SendPassword;

/**
 * Servlet implementation class VerifyStudentOTP
 */
@WebServlet( "/sms.controller.VerifyTeacherOTP" )
public class VerifyTeacherOTP extends HttpServlet 
{
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			String otp = request.getParameter("otp");
			String emailid = request.getParameter("emailid");
			System.out.println("Hello");
			Teacher db = TeacherDao.getOtpAndPassword(emailid);
			
			if(otp.equals(db.getOtp()))
			{
				db.setEmailid(emailid);
				SendPassword.sendTeacherLoginPassword(db);
				response.sendRedirect("index.jsp?msg=Password Sent");
				
			}
			else
				response.sendRedirect("teacherVerify.jsp?msg=Invalid OTP");
			
			

	}

}
