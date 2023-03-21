package dao;
import java.sql.*;

public class MYSQLConnect {
public static Connection getConnection() {
	Connection cons=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		cons=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return cons;
}

}
