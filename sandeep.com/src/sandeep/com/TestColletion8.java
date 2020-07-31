package sandeep.com;
import java.util.*;

public class TestColletion8 {

	public static void main(String args[]){
		
	LinkedList<String> al = new LinkedList<String>();
	
	al.add("Amit");
	al.add("Vijay");
	al.add("Kumar");
	
	System.out.println("Print List");	
	
	for(String s:al){
		System.out.println(s);
	}
	
	al.add(1,"xyz");
	al.set(1,"Sachin");
	
	al.add(1,"Test");
	
	System.out.println(" **** Print List Again ***");
	
	for(String s:al){
		System.out.println(s);
	}
	
	
	}	
}
