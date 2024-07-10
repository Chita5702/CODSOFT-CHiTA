package sms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import sms.db.Provider;
import sms.db.Student;
import sms.db.Teacher;
import sms.service.SendPassword;

public class TeacherDao {

	public static int addTeacher(Teacher s) 
	{
		int status = 0;
		SendPassword p = new SendPassword();
		String password=p.sendTeacherPassword(s);
		
		try 
		{
			Connection con = Provider.getConnection();
			
			String sql = "insert into teacher(name,fname,department,mobileno,dob,gender,emailid,permanent_country,permanent_district,permanent_landmark,present_country,present_district,present_landmark,regdno,mname,qualification,adhaarno,bloodgroup,joindate,permanent_state,permanent_city,permanent_pincode,present_state,present_city,present_pincode,password) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1,s.getName());
			pst.setString(2, s.getFname());
			pst.setString(3, s.getDepartment());
			pst.setString(4, s.getMobileno());
			pst.setString(5, s.getDob());
			pst.setString(6, s.getGender());
			pst.setString(7, s.getEmailid());
			pst.setString(8, s.getPermanent_country());
			pst.setString(9, s.getPermanent_district());
			pst.setString(10, s.getPermanent_landmark());
			pst.setString(11, s.getPresent_country());
			pst.setString(12, s.getPresent_district());
			pst.setString(13, s.getPresent_landmark());
			pst.setString(14, s.getRegdno());
			pst.setString(15, s.getMname());
			pst.setString(16, s.getQualification());
			pst.setString(17, s.getAdhaarno());
			pst.setString(18, s.getBloodgroup());
			pst.setString(19, s.getJoindate());
			pst.setString(20, s.getPermanent_state());
			pst.setString(21, s.getPermanent_city());
			pst.setString(22, s.getPermanent_pincode());
			pst.setString(23, s.getPresent_state());
			pst.setString(24, s.getPresent_city());
			pst.setString(25, s.getPresent_pincode());
			pst.setString(26, password);
			status = pst.executeUpdate();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return status;
	}

	public static int validate(Teacher s) 
	{
		int status=0;
		
		try {
			
			Connection con=Provider.getConnection();
			String sql="select * from teacher where emailid=? and password=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,s.getEmailid());
			pst.setString(2,s.getPassword());
			
			ResultSet rs=pst.executeQuery();
			if(rs.next())
				status=1;
				
				
				
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
				
		return status;
	}

	public static int setOtp(Teacher a) 
	{
int status=0;
		
		try
		{
			Connection con=Provider.getConnection();
			String sql="update teacher set otp=? where emailid=? ";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, a.getOtp());
			pst.setString(2,a.getEmailid());
			status = pst.executeUpdate();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static Teacher getOtpAndPassword(String emailid) 
	{
		Teacher t = new Teacher();
		try
		{
			Connection con=Provider.getConnection();
			String sql="select password,otp from student where emailid=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,emailid);
			
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				t.setPassword(rs.getString(1));
				t.setOtp(rs.getString(2));
			}		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return t;
	
	}

	public static int updatePassword(Teacher a)
	{
		int status=0;
		try
		{
			Connection con=Provider.getConnection();
			String sql="update teacher set password=? where emailid=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, a.getPassword());
			pst.setString(2, a.getEmailid());
			status=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		}
	
	public static Teacher getDetails(String emailid)
	{
		Teacher s = new Teacher();
		try
		{
			Connection con=Provider.getConnection();
			String sql="select * from teacher where emailid=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,emailid);
			
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				s.setEmailid(rs.getString("emailid"));
				s.setName(rs.getString("name"));
				s.setRegdno(rs.getString("regdno"));
				s.setJoindate(rs.getString("joindate"));
				s.setDob(rs.getString("dob"));
				s.setGender(rs.getString("gender"));
				s.setBloodgroup(rs.getString("bloodgroup"));
				s.setMobileno(rs.getString("mobileno"));
				s.setAdhaarno(rs.getString("adhaarno"));
				s.setDepartment(rs.getString("department"));
				s.setQualification(rs.getString("qualification"));
				s.setPermanent_landmark(rs.getString("permanent_landmark"));
				s.setPermanent_city(rs.getString("permanent_city"));
				s.setPermanent_district(rs.getString("permanent_district"));
				s.setPermanent_state(rs.getString("permanent_state"));
				s.setPermanent_pincode(rs.getString("permanent_pincode"));
				s.setPermanent_country(rs.getString("permanent_country"));
				s.setPresent_city(rs.getString("present_city"));
				s.setPresent_country(rs.getString("present_country"));
				s.setPresent_district(rs.getString("present_district"));
				s.setPresent_landmark(rs.getString("present_landmark"));
				s.setPresent_pincode(rs.getString("present_pincode"));
				s.setPresent_state(rs.getString("present_state"));
				s.setFname(rs.getString("fname"));
				s.setMname(rs.getString("mname"));
				s.setPhoto(rs.getString("photo"));
			}		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	public static int updateprofile(Teacher s)
	{
		int status = 0;
		
		try 
		{
			Connection con = Provider.getConnection();
			
			String sql = "update teacher set name=?,fname=?,department=?,mobileno=?,dob=?,gender=?,permanent_country=?,permanent_district=?,permanent_landmark=?,present_country=?,Present_district=?,Present_landmark=?,regdno=?,mname=?,qualification=?,adhaarno=?,bloodgroup=?,joindate=?,permanent_state=?,permanent_city=?,Permanent_pincode=?,present_state=?,present_city=?,Present_pincode=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1,s.getName());
			pst.setString(2, s.getFname());
			pst.setString(3, s.getDepartment());
			pst.setString(4, s.getMobileno());
			pst.setString(5, s.getDob());
			pst.setString(6, s.getGender());
			pst.setString(7, s.getPermanent_country());
			pst.setString(8, s.getPermanent_district());
			pst.setString(9, s.getPermanent_landmark());
			pst.setString(10, s.getPresent_country());
			pst.setString(11, s.getPresent_district());
			pst.setString(12, s.getPresent_landmark());
			pst.setString(13, s.getRegdno());
			pst.setString(14, s.getMname());
			pst.setString(15, s.getQualification());
			pst.setString(16, s.getAdhaarno());
			pst.setString(17, s.getBloodgroup());
			pst.setString(18, s.getJoindate());
			pst.setString(19, s.getPermanent_state());
			pst.setString(20, s.getPermanent_city());
			pst.setString(21, s.getPermanent_pincode());
			pst.setString(22, s.getPresent_state());
			pst.setString(23, s.getPresent_city());
			pst.setString(24, s.getPresent_pincode());
			pst.setString(25,s.getEmailid());
			status = pst.executeUpdate();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return status;
	}
		public static ArrayList<Teacher> fetchTeacher()
		{
			ArrayList<Teacher> all = new ArrayList<Teacher>();
			try
			{
				Connection con=Provider.getConnection();
				String sql="select * from teacher";
				PreparedStatement pst=con.prepareStatement(sql);
				
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					Teacher t1 = new Teacher();
					t1.setName(rs.getString("name"));
					t1.setRegdno(rs.getString("regdno"));
					t1.setEmailid(rs.getString("emailid"));
					t1.setPhoto(rs.getString("photo"));
					all.add(t1);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return all;
			
		}

		public static int deleteTeacher(String emailid)
		{
					
			int status=0;
			try
			{
				Connection con=Provider.getConnection();
				String sql="delete from teacher where emailid=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1, emailid);
				status=pst.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return status;
		}

		public static int setStatus(String emailid) {
			int status = 0;
			try
			{
				Connection con=Provider.getConnection();
				String sql="update teacher set status=null where emailid=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1,emailid);
				
				status = pst.executeUpdate();	
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}

		public static int setStatus1(String emailid) {
			int status = 0;
			try
			{
				Connection con=Provider.getConnection();
				String sql="update teacher set status='1' where emailid=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1,emailid);
				
				status = pst.executeUpdate();	
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}
		public static int updatePhoto(Teacher u, String file_name) 
		{
			int status=0;
			try{
				Connection con=Provider.getConnection();
				String sql="update teacher set photo=? where emailid=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1, u.getPhoto());
				pst.setString(2, u.getEmailid());
				status=pst.executeUpdate();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			return status;
		}
	}


