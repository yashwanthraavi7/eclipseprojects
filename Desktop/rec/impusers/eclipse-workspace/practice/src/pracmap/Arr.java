package pracmap;

import java.util.Iterator;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int ar[] = new int[10];
		
		ar[0]=76;
		
		ar[2]=76;
		ar[1]=12;
		
		int[]  hrf = {3,54,2};
		
		for(int i: hrf) {
			for(int j : ar) {
				
				System.out.println(i+j);
			}
			
		}
		
	}

}
