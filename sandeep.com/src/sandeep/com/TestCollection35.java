package sandeep.com;
import 	java.util.*;

public class TestCollection35 {
	
	public static void main(String args[]){
		
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		
		h.put(101, "Amit");
		h.put(102, "Ravi");
		h.put(103, "Vijay");
		h.put(104, "Rahul");
		
		for (Map.Entry m : h.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		h.remove(103);
		
		System.out.println("****** After Removal ******** ");
		
		for (Map.Entry m : h.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}		
	
	}
}
