package sms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import sms.db.Admin;
import sms.db.Provider;
import sms.db.Student;
import sms.service.SendPassword;

public class StudentDao {

	public static int addStudent(Student s) {
		int status = 0;
		SendPassword p = new SendPassword();
		String password = p.sendStudentPassword(s);
		try {
			Connection con = Provider.getConnection();

			String sql = "insert into student(name,fname,branch,mobileno,dob,gender,emailid,permanent_country,permanent_district,permanent_landmark,present_country,present_district,present_landmark,regdno,mname,semester,adhaarno,bloodgroup,ssession,permanent_state,permanent_city,permanent_pincode,present_state,present_city,present_pincode,password) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getFname());
			pst.setString(3, s.getBranch());
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
			pst.setString(16, s.getSemester());
			pst.setString(17, s.getAdhaarno());
			pst.setString(18, s.getBloodgroup());
			pst.setString(19, s.getSession());
			pst.setString(20, s.getPermanent_state());
			pst.setString(21, s.getPermanent_city());
			pst.setString(22, s.getPermanent_pincode());
			pst.setString(23, s.getPresent_state());
			pst.setString(24, s.getPermanent_city());
			pst.setString(25, s.getPresent_pincode());
			pst.setString(26, password);

			status = pst.executeUpdate();

			/*
			 * String sql1 =
			 * "Insert into ChatStudent (name,emailid,password) values (?,?,?)";
			 * PreparedStatement pst1 = con.prepareStatement(sql1);
			 * pst1.setString(1,s.getName()); pst1.setString(2,s.getEmailid());
			 * pst1.setString(3, s.getPassword()); pst1.executeUpdate();
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static int validate(Student s) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "select * from student where emailid=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getEmailid());
			pst.setString(2, s.getPassword());

			ResultSet rs = pst.executeQuery();
			if (rs.next())
				status = 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return status;
	}

	public static int setOtp(Student a) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "update student set otp=? where emailid=? ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getOtp());
			pst.setString(2, a.getEmailid());
			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public static Student getOtpAndPassword(String emailid) {
		Student a = new Student();
		try {
			Connection con = Provider.getConnection();
			String sql = "select password,otp from student where emailid=?";
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

	public static int updatePassword(Student a) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "update student set password=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getPassword());
			pst.setString(2, a.getEmailid());
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static Student getDetails(String emailid) {
		Student s = new Student();
		try {
			Connection con = Provider.getConnection();
			String sql = "select * from student where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				s.setEmailid(rs.getString("emailid"));
				s.setName(rs.getString("name"));
				s.setRegdno(rs.getString("regdno"));
				s.setBranch(rs.getString("branch"));
				s.setDob(rs.getString("dob"));
				s.setGender(rs.getString("gender"));
				s.setBloodgroup(rs.getString("bloodgroup"));
				s.setMobileno(rs.getString("mobileno"));
				s.setAdhaarno(rs.getString("adhaarno"));
				s.setSession(rs.getString("ssession"));
				s.setSemester(rs.getString("semester"));
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	public static int updateStudent(Student s) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();

			String sql = "update student set name=?,fname=?,branch=?,mobileno=?,dob=?,gender=?,permanent_country=?,permanent_district=?,permanent_landmark=?,present_country=?,Present_district=?,Present_landmark=?,regdno=?,mname=?,semester=?,adhaarno=?,bloodgroup=?,ssession=?,permanent_state=?,permanent_city=?,Permanent_pincode=?,present_state=?,present_city=?,Present_pincode=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getFname());
			pst.setString(3, s.getBranch());
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
			pst.setString(15, s.getSemester());
			pst.setString(16, s.getAdhaarno());
			pst.setString(17, s.getBloodgroup());
			pst.setString(18, s.getSession());
			pst.setString(19, s.getPermanent_state());
			pst.setString(20, s.getPermanent_city());
			pst.setString(21, s.getPermanent_pincode());
			pst.setString(22, s.getPresent_state());
			pst.setString(23, s.getPermanent_city());
			pst.setString(24, s.getPresent_pincode());
			pst.setString(25, s.getEmailid());

			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static ArrayList<Student> fetchStudent() {
		ArrayList<Student> all = new ArrayList<Student>();
		try {
			Connection con = Provider.getConnection();
			String sql = "select * from student";
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Student s1 = new Student();
				s1.setName(rs.getString("name"));
				s1.setRegdno(rs.getString("regdno"));
				s1.setEmailid(rs.getString("emailid"));
				s1.setPhoto(rs.getString("photo"));
				all.add(s1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;

	}

	public static int deleteStudent(String emailid) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "delete from student where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static ArrayList<Student> fetchStudentAttendence(String branch, String semester) {
		ArrayList<Student> all = new ArrayList<Student>();
		try {
			System.out.println(branch);
			System.out.println(semester);
			Connection con = Provider.getConnection();
			String sql = "select * from student where branch=? and semester=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, branch);
			pst.setString(2, semester);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Student s1 = new Student();
				s1.setName(rs.getString("name"));
				s1.setRegdno(rs.getString("regdno"));
				s1.setEmailid(rs.getString("emailid"));
				all.add(s1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;

	}

	public static int setStatus(String emailid) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "update student set status=null where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);

			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static int setStatus1(String emailid) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "update student set status='1' where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);

			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static int updatePhoto(Student s, String file_name) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "update student set photo=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getPhoto());
			pst.setString(2, s.getEmailid());
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
