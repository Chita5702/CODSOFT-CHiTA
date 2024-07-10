package sms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import sms.db.FeedbackStudent;
import sms.db.FeedbackTeacher;
import sms.db.Provider;

public class TeacherFeedbackDao 
{

	public static int registerFeedback(FeedbackTeacher fs) 
	{
		int status=0;
		
		try
		{
			Connection con=Provider.getConnection();
			String sql="insert into teacherfeedback values(?,?,?)";
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
	
	public static ArrayList<FeedbackTeacher> fetchTeacherFeedback()
	{
		ArrayList<FeedbackTeacher> all = new ArrayList<FeedbackTeacher>();
		try
		{
			Connection con=Provider.getConnection();
			String sql="select * from teacherfeedback";
			PreparedStatement pst=con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				FeedbackTeacher ft = new FeedbackTeacher();
				ft.setRegdno(rs.getString("regdno"));
				ft.setEmailid(rs.getString("emailid"));
				ft.setMessage(rs.getString("message"));
				all.add(ft);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return all;
		
	}
}
