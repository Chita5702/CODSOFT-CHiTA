package sms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sms.db.Admin;
import sms.db.Student;
import sms.model.AdminDao;
import sms.model.StudentDao;

/**
 * Servlet implementation class AdminChangePassword
 */
@WebServlet("/sms.controller.StudentChangePassword")
public class StudentChangePassword extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
	     PrintWriter out=response.getWriter();
	     response.setContentType("text/html");
	     
	     //get data from presentation
	     String oldpassword=request.getParameter("oldpassword");
	     String newpassword=request.getParameter("newpassword");
	     String  confirmpassword=request.getParameter("confirmpassword");
	     
	     HttpSession session=request.getSession();
	     String emailid=(String)session.getAttribute("emailid");
	     
	     //Set data to POJO class
	     Student a= new Student();
	     a.setEmailid(emailid);
	     a.setPassword(oldpassword);
	     int status=StudentDao.validate(a);
	     if(status>0)
	     {
	    	 if(newpassword.equals(confirmpassword))
	    	 {
	    		 a.setPassword(newpassword);
	    		 int result=StudentDao.updatePassword(a);
	    		 response.sendRedirect("studentWelcome.jsp?msg=Password Changed Sucessfully");
	    		 
	    	 }
	    	 else
	    		 response.sendRedirect("studentWelcome.jsp?msg=New Password or Confirm Password mismatch");
	     }
	     else
	    	 response.sendRedirect("studentWelcome.jsp?msg=Invalid Old Password Entered");
	}
}
