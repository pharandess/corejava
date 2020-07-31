/**
 /* https://beginnersbook.com/2013/12/java-arraylist/
 * 
 * Arraylist class implements List interface and it is based on an Array data structure. 
 * It is widely used because of the functionality and flexibility it offers. Most of the 
 * developers choose Arraylist over Array as it’s a very good alternative of traditional 
 * java arrays. ArrayList is a resizable-array implementation of the List interface. 
 * It implements all optional list operations, and permits all elements, including null.
 * 
 * Why ArrayList is better than Array?
 * The limitation with array is that it has a fixed length so if it is full you cannot add 
 * any more elements to it, likewise if there are number of elements gets removed from 
 * it the memory consumption would be the same as it doesn’t shrink.
 * On the other ArrayList can dynamically grow and shrink after addition and removal of 
 * elements. Apart from these benefits ArrayList class enables us to use predefined methods of 
 * it which makes our task easy 
 * 
*/
package com.corejava.collections;

import java.util.*;

public class C_01_ArrayList {

	public static void main(String args[]) {

		// Creating ArrayList
		ArrayList<String> l1 = new ArrayList<String>();

		// Adding elements to ArrayList.
		// add( Object o): This method adds an object o to the arraylist

		l1.add("Ganesh");
		l1.add("Mahesh");
		l1.add("Johan");
		l1.add("Karim");
		l1.add("Abdul");
		l1.add("karima");

		// Displaying elements
		System.out.println("*************List******************");
		System.out.println(l1);

		// Adding Tim at 4th position

		// add(int index, Object o): It adds the object o to the array list at the given
		// index
		l1.add(3, "Tim");
		System.out.println("*************After adding element at 3rd postion******************");
		System.out.println(l1);

		// Change an element in ArrayList
		// set(int index, Object o): Used for updating an element. It replaces the
		// element present
		// at the specified index with the object o.

		l1.set(4, "Hrishi");

		System.out.println("*************After Modifying element at 4th position **********************************");
		System.out.println(l1);

		// Remove element from the list
		// remove(Object o): Removes the object o from the ArrayList.
		l1.remove("Tim");
		System.out.println("************* After deleting element from list********************* ");
		System.out.println(l1);

		// remove element by position
		// remove(int index): Removes element from a given index.
		l1.remove(2);
		System.out.println("************* After deleting element from list by position********************* ");
		System.out.println(l1);

		// Trying to remove element from the list that does not exists, do not throw
		// error.
		l1.remove("Abhi");
		l1.remove("10");

		// Iterating through list
		System.out.println("*************Iterating though list.*************");
		for (String s : l1) {
			System.out.print(s + ",");
		}
		System.out.println();
		// ArrayList size
		// int size(): It gives the size of the ArrayList – Number of elements of the
		// list.
		System.out.println("*************Array list size is " + l1.size());

		// Sorting array list.

		Collections.sort(l1);
		System.out.println("*************Array list after sorting ***************");
		System.out.println(l1);

		// indexOf
		// int indexOf(Object o): Gives the index of the object o. If the element
		// is not found in the list then this method returns the value -1.
		System.out.println();
		System.out.println("Position of Mahesh in the list is " + l1.indexOf("Mahesh"));

		// Object get(int index): It returns the object of list which is present at the
		// specified index.

		System.out.println();
		System.out.println("Object at 4th position is " + l1.get(4));

		// boolean contains
		// boolean contains(Object o): It checks whether the given object o is present
		// in the array list if its there then it returns true else it returns false.

		System.out.println("***** Does list contains Mahesh " + l1.contains("Mahesh"));
		System.out.println("***** Does list contains Jojo " + l1.contains("Jojo"));

		// Clear list
		// clear(): It is used for removing all the elements of the array list in one
		// go.
		// The below code will remove all the elements of ArrayList whose object is obj.

		l1.clear();
		System.out.println("***** List contents after clearing");
		System.out.println(l1);
		
		
		// Reinitialize list again
		
		l1.add("Ramesh");
		l1.add("Suresh");
		l1.add("Dinesh");
		l1.add("Ganesh");
		l1.add("Dinesh");
		l1.add(l1.size(),"Tim");
		
		
		// remove method removes first occurence of the object
		l1.remove("Dinesh");
		System.out.println(l1);
		
	}

}
