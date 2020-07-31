package sandeep.com;
import java.util.*;

public class TestCollection3 {

	public static void main(String args[]){
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Sandeep");
		al.add("Shraddha");
		al.add("Shraddha");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Sundar");
		al2.add("Surekha");
		
		al.addAll(al2);
		System.out.println("After adding two collections");
		for (String s:al){
			System.out.println(s);
		}
		
		
	}
	
}
