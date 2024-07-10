package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.Admin;
import sms.db.Student;
import sms.model.AdminDao;
import sms.model.StudentDao;
import sms.service.GenerateOtp;
import sms.service.SendPassword;

/**
 * Servlet implementation class StudentForgotPassword
 */
@WebServlet("/sms.controller.StudentForgotPassword")
public class StudentForgotPassword extends HttpServlet
{
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String emailid = request.getParameter("emailid");
			Student a = new Student();
			a.setEmailid(emailid);
			
			char[] otp = GenerateOtp.adminForgotPassword(5);
			String otp1 = String.valueOf(otp);
			a.setOtp(otp1);
			SendPassword p = new SendPassword();
			p.sendStudentForgotOtp(a);
			
			int status = StudentDao.setOtp(a);
			
			response.sendRedirect("studentVerify.jsp?emailid="+emailid);
			
	}

}
