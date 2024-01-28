package practice;

import java.util.ArrayList;
import java.util.Collections;

public class Cocubes {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		int sum=0;
		int[ ] arr = {4,10,40,28,16};
		for( int i:arr) {
			al.add(i);
			
		}
		
		
		for(int k=1;k<=Collections.max(al);k++) {
			
			if(arr[0]%k == arr[arr.length-1]%k && arr[1]%k == arr[arr.length-2]%k && arr[2]%k == arr[arr.length-3]%k) {
				
				sum=sum+k;
			}
				
		}
		System.out.println(sum);
		
		
	}

}
