package HelloServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InaccessibleObjectException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeNumbercheak
 */
@WebServlet("/PrimeNumbercheak")
public class PrimeNumbercheak extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeNumbercheak() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				

		PrintWriter out=response.getWriter();
		String number =request.getParameter("number");
		int num =Integer.parseInt(number);
		
		
		out.write("<html><body>");
		
		if(isPrime(num)) {
			out.write("<p> given number "+num+" is prime</p>");
		}
	    else {
			out.write("<p> given number "+num+" is not prime</p>");
		}	
	
	} 
  public static boolean isPrime(int num) {
	  
	  if (num==1) {
		return false;
	}
	   for(int i=2; i<=Math.sqrt(num);i++)
	   {
		   if(num%i==0) {
			   return false;
		   }
		   
		  
	}
	   return true;
    
  }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
