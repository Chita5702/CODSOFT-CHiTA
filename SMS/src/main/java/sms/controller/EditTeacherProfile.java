package sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sms.db.Teacher;
import sms.model.StudentDao;
import sms.model.TeacherDao;

/**
 * Servlet implementation class AddTeacher
 */
@WebServlet("/sms.controller.EditTeacherProfile")
public class EditTeacherProfile extends HttpServlet 
{
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
			{
				
		     Teacher s=new Teacher();
		     
		        s.setName(request.getParameter("name"));
		        s.setFname(request.getParameter("fname"));
		        s.setMname(request.getParameter("mname"));
		        s.setDepartment(request.getParameter("department"));
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
		        s.setQualification(request.getParameter("qualification"));
		        s.setAdhaarno(request.getParameter("adhaarno"));
		        s.setBloodgroup(request.getParameter("bloodgroup"));
		        s.setJoindate(request.getParameter("joindate"));
		        s.setPermanent_state(request.getParameter("permanent_state"));
		        s.setPermanent_city(request.getParameter("permanent_city"));
		        s.setPermanent_pincode(request.getParameter("permanent_pincode"));
		        s.setPresent_state(request.getParameter("present_state"));
		        s.setPresent_city(request.getParameter("present_city"));
		        s.setPresent_pincode(request.getParameter("present_pincode"));
		        
		        
		        int status = TeacherDao.updateprofile(s);
		        if(status>0)
		        	response.sendRedirect("editTeacherProfile.jsp?msg=Updated successful ");
		        else
		        	response.sendRedirect("editTeacherProfile.jsp?msg=Updated Failed ");
			}

	}

	


