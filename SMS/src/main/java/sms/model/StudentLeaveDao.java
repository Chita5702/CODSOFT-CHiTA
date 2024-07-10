/**
 * 
 */
package sms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import sms.db.Provider;
import sms.db.Student;
import sms.db.StudentLeave;
import sms.db.TeacherLeave;

public class StudentLeaveDao {

	public static int registerLeave(StudentLeave sl) 
	{
		int status=0;
		
		try
		{
			Connection con=Provider.getConnection();
			String sql="insert into studentleave(regdno,emailid,t,f,message) values(?,?,?,?,?) ";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, sl.getRegdno());
			pst.setString(2,sl.getEmailid());
			pst.setString(3,sl.getTo());
			pst.setString(4,sl.getFrom());
			pst.setString(5,sl.getMessage());
			status = pst.executeUpdate();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static ArrayList<StudentLeave> fetchStudentLeave()
	{
		ArrayList<StudentLeave> all = new ArrayList<StudentLeave>();
		try
		{
			Connection con=Provider.getConnection();
			String sql="select * from studentleave";
			PreparedStatement pst=con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				StudentLeave s1 = new StudentLeave();
				s1.setRegdno(rs.getString("regdno"));
				s1.setEmailid(rs.getString("emailid"));
				s1.setTo(rs.getString("t"));
				s1.setFrom(rs.getString("f"));
				s1.setMessage(rs.getString("message"));
				s1.setStatus(rs.getString("status"));
				all.add(s1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return all;
		
	}

	public static int doApprove(StudentLeave sl) 
	{
		int status=0;
		
		try
		{
			Connection con=Provider.getConnection();
			String sql="update studentleave set status=? where emailid=? and t=? ";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, sl.getStatus());
			pst.setString(2,sl.getEmailid());
			pst.setString(3,sl.getTo());
			status = pst.executeUpdate();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}


}
