package pract2;

import java.util.*;

public class MapsPrac {
	
	public static void main(String[] args) {
		
		Map<Integer,String> ar = new HashMap<Integer,String>();
		
		ar.put(1, "yash");
		ar.put(2, "gopi");
		
		for(java.util.Map.Entry<Integer, String> a :ar.entrySet()) {
			
			System.out.println(a.getValue());
		}
		
		int b =5;
		int c=1;
		for(int i=0; i<=5; i++) {
			 c *=c ;
			 
			 System.out.println(c);
		}
	 c +=c;
	}

}
