package practice;


import java.util.Iterator;



public class array {

	
	public static void main(String[] args) {
		int sum=0;
		int m=0;
		
	int[ ] arr = {4,10,40,28,16};
	int k= 0;
	int sun[]=new int[1000];
	for(int l:arr) {
		if(l>k) {
			k=l;
		}
	}
	
	System.out.println("k value"+k);
	int z=0;
	for(int j=2;j<=k;j++) {
			
		for(int i=0;i<arr.length;i++) {
			int count=0;
			sun[i]=arr[i]%j;
			 
			System.out.println("sun[i] value"+sun[i]);
				m=sun[0];
			System.out.println("m vsalue "+m);
				for(int b=0;b<sun.length;b++) {
					if(sun[b]==m) {
						count++;
						
					}
					
			}
				System.out.println(" count valu  = "+count);
				if(count<=arr.length&& count>3 ) {
					sum=sum+z;
				}
			 		
		}
		
		System.out.println("end of loop");
		
	
	
		
					
			
	}
	
				
		System.out.println(sum);
			
	}
	
	
}
