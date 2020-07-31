/**
 * This class implements the Set interface, backed by a hash table (actually a HashMap 
 * instance). It makes no guarantees as to the iteration order of the set; in particular, 
 * it does not guarantee that the order will remain constant over time. 
 * This class permits the null element. This class is not synchronized. However 
 * it can be synchronized explicitly like this: 
 * Set s = Collections.synchronizedSet(new HashSet(...));
 * 
 * Points to Note about HashSet:
 * 
 * 1.	HashSet doesn’t maintain any order, the elements would be returned in any 
 * 		random order.
 * 2.	HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, 
 * 		the old value would be overwritten.
 * 3.	HashSet allows null values however if you insert more than one nulls it would still 
 * 		return only one null value.
 * 4. 	HashSet is non-synchronized.
 * 5.	The iterator returned by this class is fail-fast which means iterator would throw 
 * 		ConcurrentModificationException if HashSet has been modified after creation of iterator, 
 * 		by any means except iterator’s own remove method.
 */
package com.corejava.collections;

import java.util.HashSet;

public class C_05_HashSet {
	
	public static void main (String args[]) {
		
		HashSet<String> hset = new HashSet<String>();
		
		  hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      
	      hset.add(null);
		
	      System.out.println(hset);
	      System.out.println(hset);
	      
	      //boolean add(Element  e): It adds the element e to the list.
	      //void clear(): It removes all the elements from the list.
	      //Object clone(): This method returns a shallow copy of the HashSet.
	      //boolean contains(Object o): It checks whether the specified Object o is present in the 
	      //list or not. If the object has been found it returns true else false.
	      //boolean isEmpty(): Returns true if there is no element present in the Set.
	      //int size(): It gives the number of elements of a Set.
	      //boolean(Object o): It removes the specified Object o from the Set.
	      
	      
	}

}
