package pracmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class MapsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,List<String> > at = new HashMap<Integer,List<String> >();
		
		ArrayList<String> arrayList = new ArrayList<String>(); 
		
        arrayList.add("yash");
        
        arrayList.add("xys");
        arrayList.add("abc");
        
        at.put(1, arrayList);
		
		System.out.println(at);
	
		for (Entry<Integer, List<String>>  ar : at.entrySet()) {
			
		int a=	ar.getKey();
		System.out.println(a);
		
		ArrayList<String> new1	= (ArrayList<String>) ar.getValue();
		
		for (String string : arrayList) {
			System.out.println(string);
		}
		
		
		
System.out.println(new1);

System.out.println(ar.getValue());
		
			
		}
	}

}
