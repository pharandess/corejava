package sandeep.com;
import java.util.*;

public class TestCollection4 {

	public static void main (String args[]){
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Aijay");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Ravi");
		al2.add("Hanumant");

		
		al.removeAll(al2);
		
		System.out.println("After Removing");
		for(String s:al){
			System.out.println(s);
		}
	}
	
}
