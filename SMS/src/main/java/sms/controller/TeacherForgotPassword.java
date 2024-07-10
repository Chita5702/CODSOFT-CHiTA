package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.Student;
import sms.db.Teacher;
import sms.model.StudentDao;
import sms.model.TeacherDao;
import sms.service.GenerateOtp;
import sms.service.SendPassword;

/**
 * Servlet implementation class TeacherForgotPassword
 */
@WebServlet("/sms.controller.TeacherForgotPassword")
public class TeacherForgotPassword extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		Teacher a = new Teacher();
		a.setEmailid(emailid);
		
		char[] otp = GenerateOtp.adminForgotPassword(5);
		String otp1 = String.valueOf(otp);
		a.setOtp(otp1);
		SendPassword p = new SendPassword();
		p.sendTeacherForgotOtp(a);
		
		int status = TeacherDao.setOtp(a);
		
		response.sendRedirect("teacherVerify.jsp?emailid="+emailid);
		

			}

}
