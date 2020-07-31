package sandeep.com;
import java.util.*;

public class TestCollection1 {

	public static void main(String args[]){
		
		  
		ArrayList <String> list = new ArrayList<String>();
		
		list.add("Sandeep");
		list.add("Sundar");
		list.add("Surekha");
		list.add("Shraddha");
		
		Iterator itr=list.iterator();  
		
		System.out.println("Print using first method *** ");
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  
		  System.out.println("Print using Second method *** ");
		  
		  for (String ob:list){
			  System.out.println(ob);
		  }
		  
	}
}