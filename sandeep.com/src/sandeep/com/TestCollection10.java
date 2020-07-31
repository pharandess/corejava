package sandeep.com;
import  java.util.*;
public class TestCollection10 {

	public static void main(String args[]){
		
	HashSet<String> hs = new HashSet<String>();
	
	hs.add("Sandeep");
	hs.add("Sujit");
	hs.add("Saish");
	hs.add("Supash");
	hs.add("Sujit");
	
	for(String s:hs){
		
		System.out.println(s);
	}
	
	System.out.println(hs.contains("Sandeep"));
	
	}
	
}
