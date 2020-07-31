package sandeep.com;
import java.util.*;
public class TestCollection31 {

	public static void main (String args[]){
		
		LinkedHashMap<Integer, String> lh = new LinkedHashMap<Integer, String>();
		
		lh.put(1, "One");
		lh.put(2, "Two");
		lh.put(3, "Three");
		lh.put(4, "Four");
		
		
		for (Map.Entry m : lh.entrySet()){
			
			System.out.println(m.getKey() + " " + m.getValue() );
		}
		
		lh.remove(3);
		System.out.println("************* Values After Removal *************");
		
		for(Map.Entry m: lh.entrySet() ){
			System.out.println(m.getKey() + " " + m.getValue()   );
		}
		
	}
	
	
}
