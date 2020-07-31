package sandeep.com;
import java.util.*;

public class CollectionExample1 {

	public static void main(String args[]){
		
		List <String> l = new ArrayList<String>();
		
		l.add("C");
		l.add("Core Java");
		l.add("Advanced Java");
		
		System.out.println("Initial Collection Values " + l);
		
		Collections.addAll(l, "Servlet","Jsp");
		
		System.out.println("After Adding elements to collections " + l);
		
		String[] str = {"C#",".Net"};
		
		Collections.addAll(l, str);
		
		System.out.println("After Adding Array to collections " + l);
		
		
		System.out.println(Collections.max(l));
		System.out.println(Collections.min(l));
		
		Collections.sort(l);
		
		System.out.println("After Sorting " + l);
		
	}
}
