package pract2;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class lists {
	
	public static void main(String[] args) {
	sum();
	}
	public static void sum() {
		
	
		 TreeMap<Integer,String> len = new TreeMap<Integer,String>();
		 String string = "gdhcbd";
		 
		 len.put(5,string );
		 len.put(2,"yash");
		 len.remove(2);
		 
		 
		 
		 
		 for(Entry<Integer, String> en: len.entrySet() ) 
		 {
			 ArrayList<Integer> arrayList =new ArrayList<Integer>();
			 
			 arrayList.add(en.getKey());
			 
			System.out.println(en.getKey()); 
			int[] a = new int[5] ;
			
			a[0]=en.getKey();
			
			System.out.println(arrayList);
			
		System.out.println(arrayList.size()); 
		System.out.println(a[0]+ "length ? "+ a.length);
			
			
		 }
		 
			 
		 
		 
		 
		 
		
		
	}

}
