//https://beginnersbook.com/2013/12/vector-in-java/

/**
 * Vector implements List Interface. Like ArrayList it also maintains insertion order
 * but it is rarely used in non-thread environment as it is synchronized and due to which
 * it gives poor performance in searching, adding, delete and update of its elements.
 * 
 */





package com.corejava.collections;

import java.util.Vector;

public class C_03_Vectors {

	public static void main (String args[]) {
		
	
	// three ways to create vector
	//First Method
	Vector<String> v1 = new Vector<String>();
	// Vector with initial capacity
	Vector<String> v2 = new Vector<String>(02);
	// Vector with initial capacity and subsequent increment.
	Vector<String> v3 = new Vector<String>(02,02);
	
	/* Adding elements to a vector*/
	
	v1.addElement("Apple");
	v1.addElement("Orange");
	v1.addElement("Lime");
	v1.addElement("Banana");
	
	// check the size and 
	System.out.println(v1.size());
	System.out.println(v1.capacity());

	System.out.println(v1);
	
	v1.addElement("Guawa");
	v1.addElement("Strawberry");
	v1.addElement("Cherry");
	v1.addElement("Pinaple");
	v1.addElement("Mango");
	v1.addElement("Grapes");

	// check the size and 
	System.out.println(v1.size());
	System.out.println(v1.capacity());

	System.out.println(v1);
	
	v1.add("Jackfruit");
	
	// check the size and 
	System.out.println(v1.size());
	System.out.println(v1.capacity());

	System.out.println(v1);
	
	
	// void addElement(Object element): It inserts the element at the end of the Vector.
	// int capacity(): This method returns the current capacity of the vector.
	// int size(): It returns the current size of the vector.
	// void setSize(int size): It changes the existing size with the specified size.
	// boolean contains(Object element): This method checks whether the specified element is present in the Vector. If the element is been found it returns true else false.
	// boolean containsAll(Collection c): It returns true if all the elements of collection c are present in the Vector.
	// Object elementAt(int index): It returns the element present at the specified location in Vector.
	// Object firstElement(): It is used for getting the first element of the vector.
	// Object lastElement(): Returns the last element of the array.
	// Object get(int index): Returns the element at the specified index.
	// boolean isEmpty(): This method returns true if Vector doesn’t have any element.
	// boolean removeElement(Object element): Removes the specifed element from vector.
	// boolean removeAll(Collection c): It Removes all those elements from vector which are present in the Collection c.
	// void setElementAt(Object element, int index): It updates the element of specifed index with the given element.
	
	}
	
}
