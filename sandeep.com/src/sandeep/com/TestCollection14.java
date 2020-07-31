package sandeep.com;
import java.util.*;

public class TestCollection14 {
	
	public static void main(String args[]){
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Vijay");
		ts.add("Amit");
		ts.add("Ajay");
		ts.add("Bijay");
		ts.add("Xyz");
		ts.add("abc");
		
		for(String s:ts){
			System.out.println(s);
		}
		
	}
}
