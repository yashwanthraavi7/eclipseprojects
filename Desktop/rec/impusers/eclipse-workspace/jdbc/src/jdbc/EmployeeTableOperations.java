 package jdbc;

import java.sql.*;
import java.util.*;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

public class EmployeeTableOperations {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/C05", "root", "8978510820");
	//Connection con =DriverManager.getConnection("jdbc:mysql//localhost:3306/c05","root","8978510820");
	 
	Statement stmt= con.createStatement();
	//stmt.execute("create table Employee(id int,name varchar(34),salary int)");
	//String query=;
	stmt.execute("insert into employee values(1,'gopi',25000)");
	
	Statement stm= con.createStatement();
	ResultSet result = stm.executeQuery("select * from employee");
	while (result.next()) {
		System.out.print(result.getInt(1) + "\t" + result.getString(2) + "\t\t" + result.getInt(3) + "\t"+"hello");
		
		
		
	}
	
	/*
	 * ResultSet result = stmt.executeQuery("select * from Student"); while
	 * (result.next()) { System.out.print(result.getInt(1) + "\t" +
	 * result.getString(2) + "\t\t" + result.getString(3) + "\t");
	 * System.out.print(result.getInt(4) + "\t" + result.getInt(5) + "\t" +
	 * result.getInt(6) + "\t" + result.getInt(7) + "\t" + result.getInt(8) + "\t");
	 * System.out.println(result.getInt(9) + "\t" + result.getFloat(10));
	 */
	
	
	
}

}

