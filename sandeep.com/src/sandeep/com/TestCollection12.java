package sandeep.com;
import java.util.*;

public class TestCollection12 {

	public static void main(String args[]){
		
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		ls.add("Sandeep");
		ls.add("Sujit");
		ls.add("Amit");
		ls.add("Amit");
		
		for (String s:ls){
			System.out.println(s);
		}
		
	}
	
}
