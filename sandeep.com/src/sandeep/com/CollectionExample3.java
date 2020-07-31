package sandeep.com;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample3 {
	
	public static void main(String args[]){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(106);
		al.add(56);
		al.add(78);
		al.add(1);
		
		for (Integer i:al){
			System.out.println(i);
		}
		
		Collections.sort(al);

		System.out.println("After Sorting");
		
		for (Integer i:al){
			System.out.println(i);
		}		
	}

}
