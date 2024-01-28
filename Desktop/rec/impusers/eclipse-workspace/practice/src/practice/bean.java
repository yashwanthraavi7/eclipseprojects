package practice;

import java.util.*;







public class bean {
private	int id ;
 private int sal;
 
 	public  void name() {
 		List<Integer> hi=new ArrayList<Integer>();
 		Set<Integer>  s1=new LinkedHashSet<Integer>();
 		 
 		 hi.add(100);
 		 hi.add(565);
 		 hi.add(5);
 		 hi.add(5675);
 		
 		 hi.remove(1);
 		 Integer[]arr= (Integer[]) hi.toArray(new Integer[hi.size()]);
 		 for (Integer num : arr) {
			System.out.println(num);
			s1.add(num);
		}
 		 
 		 s1.addAll(hi);
 		 
 		 System.out.println("arraylist to linked hashset is done  : "+hi);
 		 
 		 System.out.println(hi.get(2));
	}
 
 	public static void main(String[] args) {
		
 	//	bean y=new bean(6,7);
 		//y.name();
 		
 		bean k=new bean();
	}
 

	
public bean() {
	this.sal = 0;
	bean y=new bean(6,7);
	y.name();
	System.out.println("default constructor is called");
	
};
	
 
 
 
public bean(int id, int sal) {
	
	this();
	System.out.println("paramiterised constructor is called");

this.id = id;
this.sal = sal;
}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	this.id=1666;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	
	
}
