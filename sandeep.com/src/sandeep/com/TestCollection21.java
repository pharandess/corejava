package sandeep.com;
import java.util.*;
public class TestCollection21 {

	public static void main(String args[]){
		
	Map<Integer,String> m = new HashMap<Integer, String>();
	
	m.put(1, "Sandeep");
	m.put(2, "Sujit");
	m.put(3, "Garbeg");
	m.put(4, "Saish");
	m.put(5, "Supash");

	/*for(Map.Entry me:m.entrySet()){
		
		System.out.println(me.getKey() + " "+ me.getValue());
	}*/
	
	System.out.println(m);
	m.remove(3);
	System.out.println(m);
	
	
	
	}
	
}
