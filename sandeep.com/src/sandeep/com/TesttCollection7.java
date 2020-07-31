package sandeep.com;
import  java.util.*;

public class TesttCollection7 {

	public static void main(String args[]){
		
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("Sandeep");
		ls.add("Sujit");
		ls.add("Saish");
		
		ls.addFirst("Sundar");
		ls.addFirst("Baliram");
		ls.addLast("Family");
		ls.add("Shraddha");
		
		
		
		for (String s:ls){
			System.out.println(s);
		}
		
		ls.remove();
		ls.remove();
		
		System.out.println("Number of element in collection = " + ls.size() );
		
		Iterator it = ls.iterator();
		
		String s1;
		
		while (it.hasNext()){
		s1 = (String)it.next();
		
		System.out.println(s1);
		}
		
	}
	
}
