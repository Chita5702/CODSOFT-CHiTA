package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.Admin;
import sms.model.AdminDao;
import sms.service.SendPassword;

/**
 * Servlet implementation class VerifyAdminOTP
 */
@WebServlet("/sms.controller.VerifyAdminOTP")
public class VerifyAdminOTP extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String otp = request.getParameter("otp");
		String emailid = request.getParameter("emailid");
		System.out.println("Hello");
		Admin db = AdminDao.getOtpAndPassword(emailid);
		
		if(otp.equals(db.getOtp()))
		{
			db.setEmailid(emailid);
			SendPassword.sendAdminLoginPassword(db);
			response.sendRedirect("index.jsp?msg=Password Sent");
			
		}
		else
			response.sendRedirect("adminVerify.jsp?msg=Invalid OTP");
		
		
	}

}
