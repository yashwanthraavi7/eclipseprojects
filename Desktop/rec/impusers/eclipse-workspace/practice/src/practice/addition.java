package practice;


public class addition {
	static int a,b,c;
	
	
	public static void main(String[] args) {
		
		a=0;
		b=a+1;
		c=b+2;
		
		System.out.println(c+"the additionn is completed"+b+value());
		
		while(c>=0) {
			System.out.println(c);
			c=c-1;
		}
		
		name();
		
	}

	public static int value() {
		int h;
		h=a+b+c;
		return h;
	}
	public static void name() {
		
		String string= "true";
		boolean b= Boolean.parseBoolean(string);
		
		//int k=(Integer)b;
		
		System.out.println("bollean conversion works "+b);
		System.out.print(b);
		
	}
	
}
