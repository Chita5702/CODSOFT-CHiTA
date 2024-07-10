package sms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import sms.db.Contact;
import sms.db.Provider;

public class ContactDao {

	public static int register(Contact c) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "insert into contact values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, c.getName());
			pst.setString(2, c.getEmailid());
			pst.setString(3, c.getMessage());
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
