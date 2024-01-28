package practice;

public class RevString {
	public static void main(String[] args) {
		
		String str="yashwanth";
		
		 String fin="";
	     
	     int size=str.length();
	     for(int i=size-1;i>=0;i--){
	       fin +=str.charAt(i);

	     }


	    System.out.println(fin);
	    System.out.println("---------------------------------------------------------");
	    String a= "abc";
	    String b="bbc";
	    String c=a+b;
	    
		System.out.println(a+b);
	}

}
