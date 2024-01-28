package jdbc;
import java.sql.*;
import java.util.Scanner;

public class JDBC_Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		createConnection();

	}

	public static void createConnection() throws ClassNotFoundException, SQLException {
		// Driver Info
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Connection Establishment
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/C05", "root", "8978510820");
		// Query Execution
		Statement stmt = con.createStatement();

		getOption(stmt);

	}

	public static void getOption(Statement stmt) throws SQLException {

		Scanner sc = new Scanner(System.in);
		boolean cont = false;
		do {
			System.out.println("Menu\n1.CreateTable\n2.InsertRow\n3.DeleteRow\n4.UpdateRow\n5ResultSet");
			System.out.println("Enter the Option : ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				createTable(stmt);
				break;

			case 2:
				insertRow(stmt);
				break;
			case 3:
				deleteRow(stmt);
				break;
			case 4:
				updateRow(stmt);
				break;

			case 5:
				getResults(stmt);
				break;

			default:
				System.out.println("Invalid Option");
			}
			System.out.println("Do you want to continue (true / false)?");
			cont = sc.nextBoolean();

		} while (cont == true);

	}

	private static void createTable(Statement stmt) {
		// TODO Auto-generated method stub

	}

	public static void insertRow(Statement stmt) throws SQLException {
		String query = "insert into Student(id,Name,Dept,sub1,sub2,sub3,sub4,sub5) values (08,'Varun','Mech',82,74,85,76,74)";
		stmt.execute(query);

	}

	public static void getResults(Statement stmt) throws SQLException {
		ResultSet result = stmt.executeQuery("select * from Student");
		while (result.next()) {
			System.out.print(result.getInt(1) + "\t" + result.getString(2) + "\t\t" + result.getString(3) + "\t");
			System.out.print(result.getInt(4) + "\t" + result.getInt(5) + "\t" + result.getInt(6) + "\t"
					+ result.getInt(7) + "\t" + result.getInt(8) + "\t");
			System.out.println(result.getInt(9) + "\t" + result.getFloat(10));
		}
	}

	public static void updateRow(Statement stmt) throws SQLException {
		stmt.execute("update Student set Total = (sub1+sub2+sub3+sub4+sub5), Percentage = (Total)/5 where id = 6");
	}

	public static void deleteRow(Statement stmt) throws SQLException {
		stmt.execute("delete from Student where Name = 'Kiran'");
	}

}
