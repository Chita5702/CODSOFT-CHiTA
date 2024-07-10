package sms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import sms.db.Admin;
import sms.db.Provider;
import sms.db.Student;
import sms.db.Subject;

public class AdminDao {

	public static int validate(Admin a) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "select * from admin where emailid=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getEmailid());
			pst.setString(2, a.getPassword());

			ResultSet rs = pst.executeQuery();
			if (rs.next())
				status = 1;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public static int setOtp(Admin a) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "update admin set otp=? where emailid=? ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getOtp());
			pst.setString(2, a.getEmailid());
			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static Admin getOtpAndPassword(String emailid) {
		Admin a = new Admin();
		try {
			Connection con = Provider.getConnection();
			String sql = "select password,otp from admin where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				a.setPassword(rs.getString(1));
				a.setOtp(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;

	}

	public static int updatePassword(Admin a) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "update admin set password=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getPassword());
			pst.setString(2, a.getEmailid());
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static int addSubject(Subject sub) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "insert into subject values(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, sub.getSubjectid());
			pst.setString(2, sub.getSubjectname());
			pst.setString(3, sub.getTeacherregdno());
			pst.setString(4, sub.getSemester());
			pst.setString(5, sub.getBranch());
			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static ArrayList<Subject> fetchSubject() {
		ArrayList<Subject> all = new ArrayList<Subject>();
		try {
			Connection con = Provider.getConnection();
			String sql = "select * from subject";
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Subject s1 = new Subject();
				s1.setSubjectid(rs.getString("subjectid"));
				s1.setSubjectname(rs.getString("subjectname"));
				s1.setTeacherregdno(rs.getString("teacherregdno"));
				s1.setSemester(rs.getString("semester"));
				s1.setBranch(rs.getString("branch"));
				all.add(s1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;

	}

	public static int deleteSubject(String subjectid) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "delete from subject where subjectid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, subjectid);
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
