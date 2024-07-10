package sms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import sms.controller.StudentFeedback;
import sms.db.FeedbackStudent;
import sms.db.Provider;
import sms.db.Student;

public class StudentFeedbackDao {

	public static int registerFeedback(FeedbackStudent fs) 
	{
		int status=0;
		
		try
		{
			Connection con=Provider.getConnection();
			String sql="insert into studentfeedback values(?,?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,fs.getRegdno() );
			pst.setString(2,fs.getEmailid());
			pst.setString(3,fs.getMessage());
			status = pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static ArrayList<FeedbackStudent> fetchStudentFeedback()
	{
		ArrayList<FeedbackStudent> all = new ArrayList<FeedbackStudent>();
		try
		{
			Connection con=Provider.getConnection();
			String sql="select * from studentfeedback";
			PreparedStatement pst=con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				FeedbackStudent fs = new FeedbackStudent();
				fs.setRegdno(rs.getString("regdno"));
				fs.setEmailid(rs.getString("emailid"));
				fs.setMessage(rs.getString("message"));
				all.add(fs);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return all;
		
	}

}
