package sandeep.com;
import java.util.*;
public class TestCollection15 {

	public static void main (String args[]){
		
		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("Sandeep");
		pq.add("Ajit");
		pq.add("Zebra");
		pq.add("Quilt");
		pq.add("Bird");
		pq.add("Telcom");
		
		for(String s:pq){
			
			System.out.println(s);			
			
		}
		
		pq.remove();
		pq.poll();
		
		System.out.println(" *** Printing Again *** ");
		
		for(String s:pq){
			
			System.out.println(s);			
			
		}
		
		
	}
	
}
