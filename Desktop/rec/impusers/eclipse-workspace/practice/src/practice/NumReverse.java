package practice;

//import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class NumReverse {	
	
	public static void main(String[] args) {
	
int n=9;
ArrayList<Integer> ar=new ArrayList<Integer>();
ar.add(10);
ar.add(20);
ar.add(20);
ar.add(10);
ar.add(10);
ar.add(30);
ar.add(50);
ar.add(10);
ar.add(20);

sockMerchant(n, ar);

		
		
	}
	
	 public static int sockMerchant(int n, List<Integer> ar) {
		    // Write your code here
		 int sum=0;
		    int size=ar.size();
		    System.out.println(size);
		    List<Integer> inter= new ArrayList<Integer>();
		    for(int i=0;i<size;i++){
		        int count=0;
		        for(int j=0;j<size;j++){
		            
		            if(ar.get(i)==ar.get(j)){
		                count++;
		            }
		            
		        }
		        inter.add(count);
		    }
		    for(int i=0;i<size;i++){
		        if(inter.get(i)>1){
		        if(inter.get(i)%2!=0){
		            int tem=inter.get(i)-1;
		            
		            inter.add(tem);
		            
		        }
		        
		        }
		    }
		    System.out.println(inter);
		    for(int i=1;i<size;i++){
		        int temp=0;
		        if(inter.get(i)>1){
		            temp=temp+(inter.get(i)/2);
		            sum+=temp;
		        }
		    }
		    
		    System.out.println(sum);
			return sum;

		    }
	

}
