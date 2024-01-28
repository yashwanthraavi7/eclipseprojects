package HelloServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CannotVote
 */
@WebServlet("/CannotVote")
public class CannotVote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CannotVote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		String name=request.getParameter("userName");
		
		int age=Integer.parseInt(request.getParameter("age"));
		out.write("<html><body>");
		out.write("<p>Hello "+name+"</p> <br>");
        
     String district = (String)request.getAttribute("district");
		
		String state = (String)request.getAttribute("state");
		
		
        out.write("<p> you cannot vote.Try after"+(18-age)+" years.<p>");
        
        out.write("<p> District: "+district+" </p>");
        out.write("<p> state: "+state+"</p>");
        
        out.write("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
