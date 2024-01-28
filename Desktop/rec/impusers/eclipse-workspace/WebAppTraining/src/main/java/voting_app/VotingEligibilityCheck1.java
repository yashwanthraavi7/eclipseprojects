package voting_app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class VotingEligibilityCheck1
 */
@WebServlet("/VotingEligibilityCheck1")
public class VotingEligibilityCheck1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public VotingEligibilityCheck1() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("userName");
		Voter voter = dbConnect(name);
         System.out.println(voter);
		request.setAttribute("voter", voter);
		RequestDispatcher rd;
		if (voter.getAge() >= 18) {
			rd = request.getRequestDispatcher("Canvote");
		}

		else {
			rd = request.getRequestDispatcher("Cannotvote");
		}
		
		rd.forward(request, response);
		 
	 
	}

	public static Voter dbConnect(String name) {
		Voter voter=null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election", "root", "8978510820");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election", "root", "8978510820");
			
			PreparedStatement ps = con.prepareStatement("select * from vote where name = ?");
			
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			
			
			voter = new Voter();
			
			voter.setVoter_id(rs.getInt(1));
			voter.setName(rs.getString(2));
			voter.setAge(rs.getInt(3));
			voter.setDistrict(rs.getString(4));
			voter.setState(rs.getString(5));
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return voter;
	}

	
		
		
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
