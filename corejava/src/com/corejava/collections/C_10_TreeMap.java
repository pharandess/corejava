/**
 * TreeMap is Red-Black tree based NavigableMap implementation. It is sorted according 
 * to the natural ordering of its keys.
 * TreeMap class implements Map interface similar to HashMap class. The main difference 
 * between them is that HashMap is an unordered collection while TreeMap is sorted in 
 * the ascending order of its keys. TreeMap is unsynchronized collection class 
 * which means it is not suitable for thread-safe operations until unless synchronized 
 * explicitly.
 */

package com.corejava.collections;

import java.util.TreeMap;

public class C_10_TreeMap {

	public static void main (String args[]) {

		
		TreeMap<String, String> t = new TreeMap<String, String>();
		
		t.put("W", "Warna");
		t.put("G", "Godavari");
		t.put("K", "Kaveri");
		t.put("P", "Panchaganga");
		
		// Entries are stored in natual order of th keys
		System.out.println(t);
		
		
		TreeMap<Integer, String> i = new TreeMap<Integer, String>();
		
		i.put(789, "Rahul NHS");
		i.put(555, "Dwarka Wonders");
		i.put(455, "Dwarka gold");
		i.put(1, "Laxmi");
		i.put(888, "Popular Nagar");
		
		System.out.println(i.entrySet());
		
	}
	
}
