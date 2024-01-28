package jdbc;

import java.sql.*;
public class sql{
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl2019   ","root","8978510820");
		
		Statement stmt =con.createStatement();
		
		ResultSet result =stmt.executeQuery("show tables");
		while (result.next()) {
		System.out.println(result.getString(1));
		
		}
		
		
		
		
		
	}
}