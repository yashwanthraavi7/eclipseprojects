package HelloServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class VotingEligibility
 */
@WebServlet("/VotingEligibility")
public class VotingEligibilityCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VotingEligibilityCheck() {
        super();
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("userName");
		
		int age=Integer.parseInt(request.getParameter("age"));
		
		request.setAttribute("district", "hyderabad");
		request.setAttribute("state", "Telangana");
		//above code stores the data in the form of key and value same as MAPs
		
		
		RequestDispatcher rd;
        
        if (age>=18) {
        	rd=request.getRequestDispatcher("CanVote");
			
		}else {
			rd=request.getRequestDispatcher("CannotVote");
			
		}
        rd.forward(request, response);
        		   		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
