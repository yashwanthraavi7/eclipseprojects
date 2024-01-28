package practice;

import java.util.Arrays;

public class tricky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] num= {1,2,3,4};
		int [] res=new int[num.length];
		int [] tot = new int[num.length];
		
		for(int i=0;i<num.length;i++) {
			int sum =1;
			for(int j=0;j<num.length;j++) {
				if(i ==j) {continue;}
					System.out.println(" j value is"+j);
					
					sum= sum*num[j];
					System.out.println("sum is  "+sum);
					res[i]= sum;
				
				
				
				
			}
				
		}
		
		Arrays.sort(res);
		
		System.out.println("max num = "+res[res.length-1]);
		
		int se=12;
		int k=Arrays.binarySearch(res, se);
		
		System.out.println("index value of 12 is= "+k);
		
		
		for(int i:res) {
			System.out.println(i);
		}
		

	}
	

}
