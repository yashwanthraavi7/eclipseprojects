package practice;

import java.util.Scanner;

public class strings {
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		
		  Scanner in = new Scanner(System.in);
		  
		  System.out.println("Enter the first string: "); String string1 =
		  in.nextLine();
		  
		  System.out.println("Enter the second string :"); String string2 =
		  in.nextLine();
		  
		  System.out.println("\nAre both strings same: "); in.close();
		  
		  //System.out.println(string1.compareTo(string2));
		  
		  
		  if (string1.equals(string2)) { System.out.println("Yes"); } else {
		  System.out.println("No"); }
		 
		 
		 Boolean g=false;
		 System.out.println(g);
		 
	}

}
