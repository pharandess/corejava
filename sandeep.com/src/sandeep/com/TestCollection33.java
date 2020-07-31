package sandeep.com;
import java.util.*;

public class TestCollection33 {
	
	public static void main (String args[]){
		
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		
		t.put(1, "Rajesh");
		t.put(2, "Suresh");
		t.put(3, "Ganesh");
		t.put(4, "Ramesh");
		
		for(Map.Entry m: t.entrySet()){
			
			System.out.println(m.getKey() + " " + m.getValue());
		}
	
		t.remove(3);
		
		System.out.println("********* After Removal ****************");
		
		for(Map.Entry m: t.entrySet()){
			
			System.out.println(m.getKey() + " " + m.getValue());
		}	
		
	}
	


}
