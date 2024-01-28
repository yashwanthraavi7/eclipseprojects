package pract2;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		int b=a ;
		System.out.println(b);
		 b= 5;
			System.out.println(b);
			
			String str1 = "me";
			
			String str2 = str1;
			System.out.println(str2);
			
			str2 = "gfh";
			System.out.println(str2);
	}

}
