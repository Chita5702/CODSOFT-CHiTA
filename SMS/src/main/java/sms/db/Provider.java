package sms.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Provider {
	public static Connection getConnection() {
		Connection con = null;

		try {
			if (con == null) {
				Class.forName("oracle.jdbc.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sms", "sms");
			} else
				return con;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
