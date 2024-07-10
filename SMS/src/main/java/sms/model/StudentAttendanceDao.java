package sms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import sms.db.Provider;
import sms.db.Student;
import sms.db.StudentAttendance;

public class StudentAttendanceDao {

	public static int takeAttendance(StudentAttendance sa) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "insert into studentattendance values(?,?,?,?,?,?,?,?) ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, sa.getAttendancedate());
			pst.setString(2, sa.getBranch());
			pst.setString(3, sa.getSemester());
			pst.setString(4, sa.getSubject());

			pst.setString(5, sa.getEmailid());
			pst.setString(6, sa.getRegdno());
			pst.setString(7, sa.getStatus());
			pst.setString(8, sa.getName());
			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static String getStatus(String emailid, String branch, String subject, String semester,
			String attendancedate) {
		String status = null;

		try {
			System.out.println("=============================");
			System.out.println(emailid);
			System.out.println(branch);
			System.out.println(subject);
			System.out.println(semester);
			System.out.println(attendancedate);
			System.out.println("======");

			Connection con = Provider.getConnection();
			String sql = "select status from studentattendance where emailid=? and branch=? and attendancedate=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);
			pst.setString(2, branch);
			pst.setString(3, attendancedate);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				status = rs.getString("status");
				System.out.println(status + "=================");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static ArrayList<StudentAttendance> fetchStudentAttendence(String emailid) {
		ArrayList<StudentAttendance> all = new ArrayList<StudentAttendance>();
		try {

			Connection con = Provider.getConnection();
			String sql = "select * from studentattendance where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				StudentAttendance sa = new StudentAttendance();
				sa.setSubject(rs.getString("subject"));
				sa.setAttendancedate(rs.getString("attendancedate"));
				sa.setStatus(rs.getString("status"));
				all.add(sa);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;

	}

}
