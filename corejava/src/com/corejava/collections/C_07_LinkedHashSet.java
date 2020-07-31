/**
 * Earlier we have shared tutorials on HashSet and TreeSet. LinkedHashSet is also an 
 * implementation of Set interface, it is similar to the HashSet and TreeSet except the 
 * below mentioned differences:
 * HashSet doesn’t maintain any kind of order of its elements.
 * TreeSet sorts the elements in ascending order.
 * LinkedHashSet maintains the insertion order. 
 * Elements gets sorted in the same sequence in which they have been added to the Set.
 * 
 * 
 * 
 */
package com.corejava.collections;

import java.util.LinkedHashSet;
import java.util.concurrent.LinkedTransferQueue;

public class C_07_LinkedHashSet {
	
	public static void main (String args[]) {
		
		LinkedHashSet<String> l1 = new LinkedHashSet<String>();
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		
		l1.add("Zeta");
		l1.add("Pita");
		l1.add("Hexa");
		l1.add("Peta");
		l1.add("Zeta");
		
		System.out.println(l1);
		
		l2.add(90);
		l2.add(78);
		l2.add(10);
		l2.add(66);
		
		System.out.println(l2);
	
	}

}
