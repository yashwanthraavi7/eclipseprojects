 package practice;

import java.util.Arrays;
import java.util.HashSet;

//import com.sun.tools.javac.util.UnsharedNameTable;

public class Minimum {
	public static void main(String[] args) {
		
		int h= 6;
		float c=0.4f;
		int ts=800;
	char k=	ClassifyGivenStell(h,c,ts);
	System.out.println(k);
		
	}
	
	static char ClassifyGivenStell(int h,float c, int ts) {
			
		
		if(h>60 && c>0.8 && ts>5700) {
			return 'A';
		}
		
		else if (h>60 && c>0.8) 
		{
			return 'B';
			
		}
		else if (h>60 && ts>5700) 
		{
			return 'C';
			
		}
		
		else if (c>0.8 && ts>5700) 
		{
			return 'D';
			
		}
		
		else if (h>60 || ts>5700|| c>0.8) 
		{
			return 'E';
			
		}
		
		else {
			return 'F';
		}
		
	
		
		
	}
	

}
