package practice;

public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "yashwanth, raavi ,yash ,you";
		System.out.println(str.equals("yashwanth"));

		
		
		if(str=="yashwanth") {
			System.out.println("yes it is");
		}
		
		System.out.println("compate to  = "+str.equals("yashwanth"));
		if(str.compareTo("yashwanth")==0) {
			System.out.println("yaaa");
		}
		
		String st[]=str.split(" ");
		
		for(String s:st) {
			System.out.println(s);
		}
		
		int index=str.indexOf(" ");
		
		//System.out.println(str.substring(index+1));
		
	}

}
