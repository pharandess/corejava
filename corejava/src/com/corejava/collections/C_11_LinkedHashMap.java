/**
 * LinkedHashMap is a Hash table and linked list implementation of the Map interface, with 
 * predictable iteration order. This implementation differs from HashMap in that it 
 * maintains a doubly-linked list running through all of its entries. This linked list 
 * defines the iteration ordering, which is normally the order in which keys were 
 * inserted into the map (insertion-order). In last few tutorials we have discussed about 
 * HashMap and TreeMap. This class is different from both of them:

 * HashMap doesn’t maintain any order.
 * TreeMap sort the entries in ascending order of keys.
 * LinkedHashMap maintains the insertion order.
 * 
 */
package com.corejava.collections;
import java.util.*;
import java.util.LinkedHashMap;

public class C_11_LinkedHashMap {
	
	public static void main (String args[]) {
		
		LinkedHashMap<String, String> hm = new LinkedHashMap<>();
		
		hm.put("TR", "Treee");
		hm.put("ST", "Stand");
		hm.put("MK", "Main K");
		hm.put("AB", "ABCD");
		
		System.out.println(hm);
		
		Set set = hm.entrySet();
		
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			
			Map.Entry<String, String> e = (Map.Entry) it.next();
			System.out.println("Key is " + e.getKey() + " and value is " + e.getValue() );
			
		}
		
	}

}

