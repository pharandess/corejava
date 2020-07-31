/**
 * TreeSet is similar to HashSet except that it sorts the elements in the ascending order 
 * while HashSet doesn’t maintain any order. TreeSet does not allow null element HashSet allows null element 
 * it doesn’t allow. Like most of the other collection classes this class is also not 
 * synchronized, however it can be synchronized explicitly like this: 
 * SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
 * 
 * 
 * 
 */
package com.corejava.collections;

import java.util.TreeSet;

public class C_06_TreeSet {
	
	public static void main (String args[]) {
		
		TreeSet<String> s1 = new TreeSet<String>();
		TreeSet<Integer> i1 = new TreeSet<Integer>();
		
		s1.add("Simba");
		s1.add("Tiger");
		s1.add("Rambo");
		s1.add("Azim");
		
		// null elements are not allowed in the TreeSet 
		//s1.add(null);
		
		i1.add(45);
		i1.add(8);
		i1.add(90);
		i1.add(1);
		
		System.out.println(s1);
		System.out.println(i1);
		
	}

}
