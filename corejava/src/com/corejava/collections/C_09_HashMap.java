/**
 * HashMap is a Map based collection class that is used for storing Key & value pairs, 
 * it is denoted as HashMap<Key, Value> or HashMap<K, V>. This class makes no guarantees 
 * as to the order of the map. It is similar to the Hashtable class except that it is 
 * unsynchronized and permits nulls(null values and null key).
 * 
 * It is not an ordered collection which means it does not return the keys and values 
 * in the same order in which they have been inserted into the HashMap. It does not sort 
 * the stored keys and Values. You must need to import java.util.HashMap or its super 
 * class in order to use the HashMap class and methods. 
 * 
 */
package com.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C_09_HashMap {
	
	public static void main (String args[]) {
		
		HashMap<Integer , String> m1 = new HashMap<Integer,String>();
		
		m1.put(100, "Kingkong");
		m1.put(60, "Fronzen");
		m1.put(90, "Allice");
		m1.put(10, "Lion King");
		m1.put(20, "Cars");
		m1.put(160, "Togo");
		
		System.out.println("Map content");
		System.out.println(m1);
		System.out.println("Map keys");
		System.out.println(m1.keySet());
		System.out.println("Map values");
		System.out.println(m1.values());
		
		
		System.out.println("Iterate using key set");
		
		for (int i: m1.keySet()) {
			
			System.out.println(m1.get(i));
		}
		
		
		System.out.println("Get entry set from the Map");

		System.out.println(m1.entrySet());
		
		System.out.println("Iterate using iterator");
		
		// Get entry set from gthe Map
		Set s = m1.entrySet();
		
		// Get iterator of the map
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			// convert set into Map entry
			
			Map.Entry mentry = (Map.Entry)it.next();
			
			// print key and  value from entry
			System.out.println(mentry.getKey());
			System.out.println(mentry.getValue());
			
		}
				
		System.out.println("****");
		// get value based on Key
		System.out.println(m1.get(160));
		
		/* Remove values based on key*/
		System.out.println("Remove Key 160");
		m1.remove(160);
		System.out.println("HashMap after removing key");
		System.out.println(m1);
		
		
		//void clear(): It removes all the key and value pairs from the specified Map.
		//Object clone(): It returns a copy of all the mappings of a map and used for cloning them into another map.
		//boolean containsKey(Object key): It is a boolean function which returns true or false based on whether the specified key is found in the map.
		//boolean containsValue(Object Value): Similar to containsKey() method, however it looks for the specified value instead of key.
		//Value get(Object key): It returns the value for the specified key.
		//boolean isEmpty(): It checks whether the map is empty. If there are no key-value mapping present in the map then this function returns true else false.
		//Set keySet(): It returns the Set of the keys fetched from the map.
		//value put(Key k, Value v): Inserts key value mapping into the map. Used in the above example.
		//int size(): Returns the size of the map – Number of key-value mappings.
		//Collection values(): It returns a collection of values of map.
		//Value remove(Object key): It removes the key-value pair for the specified key. Used in the above example.
		//void putAll(Map m): Copies all the elements of a map to the another specified map.
		
		
	}
	

}
