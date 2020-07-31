package sandeep.com;
import java.util.*;

public class TestCollection22 {

	public static void main (String args[]){
		
		HashMap<Integer , String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "First");
		hm.put(2, "Second");
		hm.put(3, "Third");
		
		for (Map.Entry m: hm.entrySet()){
			
			System.out.println(m.getKey() + "  "  + m.getValue());
			
		}
		
		
		hm.remove(2);
		
		System.out.println("************ Print Again **************");
		
		for (Map.Entry m: hm.entrySet()){
			
			System.out.println(m.getKey() + "  "  + m.getValue());
			
		}	
		  
				
	}
	
}
