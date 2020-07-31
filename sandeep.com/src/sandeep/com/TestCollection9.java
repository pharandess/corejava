package sandeep.com;
import  java.util.*;


public class TestCollection9 {

	public static void main(String args[]){
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add(1, "Sachin");

		System.out.println("List in order");
		
		for(String s:al){
			System.out.println(s);
		}
					
		ListIterator<String> i = al.listIterator(al.size());
		
		System.out.println("List in reverse order");
		
		while (i.hasPrevious()){
			System.out.println(i.previous());
		}
		
	}
	
}
