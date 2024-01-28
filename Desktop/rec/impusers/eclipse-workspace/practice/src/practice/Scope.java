package practice;

public class Scope {
	public 	int privatevar=1;
	
	public  void mains() {
		int privatevar=8;
		
		System.out.println(this.privatevar);
	}
	
	public static void main(String[] args) {
		Scope h=new Scope();
		
		h.mains();
	}

}
