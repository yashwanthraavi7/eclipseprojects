package practice;

import java.util.Scanner;

public class Geometric {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int r= sc.nextInt();
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.println("avalue="+a);
			sum+= a;
			a=a*r;
			System.out.println("sumvalue= "+sum);
		}
		
		System.out.println("finalvalue"+sum);
		sc.close();
	}

}
