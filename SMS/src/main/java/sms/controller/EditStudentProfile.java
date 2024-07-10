package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.Student;
import sms.model.StudentDao;


@WebServlet("/sms.controller.EditStudentProfile")
public class EditStudentProfile extends HttpServlet 
{
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			Student s=new Student();
			
			s.setName(request.getParameter("name"));
			s.setFname(request.getParameter("fname"));
	        s.setBranch(request.getParameter("branch"));
	        s.setMobileno(request.getParameter("mobileno"));
	        s.setDob(request.getParameter("dob"));
	        s.setGender(request.getParameter("gender"));
	        s.setEmailid(request.getParameter("emailid"));
	        s.setPermanent_country(request.getParameter("permanent_country"));
	        s.setPermanent_district(request.getParameter("permanent_district"));
	        s.setPermanent_landmark(request.getParameter("permanent_landmark"));
	        s.setPresent_country(request.getParameter("present_country"));
	        s.setPresent_district(request.getParameter("present_district"));
	        s.setPresent_landmark(request.getParameter("present_landmark"));
	        s.setRegdno(request.getParameter("regdno"));
	        s.setMname(request.getParameter("mname"));
	        s.setSemester(request.getParameter("semester"));
	        s.setAdhaarno(request.getParameter("adhaarno"));
	        s.setBloodgroup(request.getParameter("bloodgroup"));
	        s.setSession(request.getParameter("session"));
	        s.setPermanent_state(request.getParameter("permanent_state"));
	        s.setPermanent_city(request.getParameter("permanent_city"));
	        s.setPermanent_pincode(request.getParameter("permanent_pincode"));
	        s.setPresent_state(request.getParameter("present_state"));
	        s.setPresent_city(request.getParameter("present_city"));
	        s.setPresent_pincode(request.getParameter("present_pincode"));
	        
	        
	        int status = StudentDao.updateStudent(s);
	        if(status>0)
	        	response.sendRedirect("editStudentProfile.jsp?msg=Updated successful ");
	        else
	        	response.sendRedirect("editStudentProfile.jsp?msg=Updated Failed ");
	    }

}
