/**
 * Iterator is used for iterating (looping) various collection classes such as HashMap, 
 * ArrayList, LinkedList etc. In this tutorial, we will learn what is iterator, 
 * how to use it and what are the issues that can come up while using it. 
 * Iterator took place of Enumeration, which was used to iterate legacy classes such as 
 * Vector. 
 * We will also see the differences between Iterator and Enumeration in this tutorial.
 * 
 */

package com.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

import oracle.net.aso.e;

public class C_21_Iterator {
	
public static void main(String args[]) {
	
	ArrayList<String> l1 = new ArrayList();
	
	l1.add("Grapes");
	l1.add("Mango");
	l1.add("Apple");
	l1.add("Papaya");
	l1.add("Strawberry");
	
	Iterator it =  l1.iterator();
	
	while (it.hasNext()) {
		
		System.out.println(it.next());
	}
	
	
	
}
	

}
