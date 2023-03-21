package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnect {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			String connectionUrl = "jdbc:sqlserver://DESKTOP-PLKGNUH\\SQLEXPRESS:1433;"
					+ "databaseName=QUANLITHUVIEN;user=sa;password=123";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(connectionUrl);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
