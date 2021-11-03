package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	String driver = "conn";
	String path = "jdbc:mysql://localhost:3306/git";
	String user = "root";
	String pwd = "1111";
	
	Connection conn;
	
	public DBConn() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(path, user, pwd);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		return conn;
	}
}
