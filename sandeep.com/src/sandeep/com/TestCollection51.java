package sandeep.com;
import java.util.*;

public class TestCollection51 {

	public static void main (String args[]){
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(2, "Second");
		map.put(1, "First");
		map.put(3, "Third");
		
		for (Map.Entry<Integer, String> M : map.entrySet()){
			
			System.out.println("Key="+ M.getKey() + " " + M.getValue());
			
		}
		
		map.remove("First");
		
		for (Map.Entry<Integer, String> M : map.entrySet()){
			
			System.out.println("Key="+ M.getKey() + " " + M.getValue());
			
		}
	}
}
