/**Similar to arrays in Java, LinkedList is a linear data structure. 
 * However LinkedList elements are not stored in contiguous locations like arrays, 
 * they are linked with each other using pointers. Each element of the LinkedList has the 
 * reference(address/pointer) to the next element of the LinkedList.
 * Each element in the LinkedList is called the Node. Each Node of the LinkedList contains two items: 
 * 1) Content of the element 
 * 2) Pointer/Address/Reference to the Next Node in the LinkedList.
 * Note:
1. Head of the LinkedList only contains the Address of the First element of the List.
2. The Last element of the LinkedList contains null in the pointer part of the node because it is the end of the List so it doesn�t point to anything as shown in the above diagram.
3. The diagram which is shown above represents a singly linked list. 
   There is another complex type variation of LinkedList which is called doubly linked 
   list, node of a doubly linked list contains three parts: 
   1) Pointer to the previous node of the linked list 
   2) content of the element 
   3) pointer to the next node of the linked list.
 * 
 * 	Why do we need a Linked List?
	You must be aware of the arrays which is also a linear data structure but arrays 
	have certain limitations such as:
	1) Size of the array is fixed which is decided when we create an array so it is 
	hard to predict the number of elements in advance, if the declared size fall short 
	then we cannot increase the size of an array and if we declare a large size array and 
	do not need to store that many elements then it is a waste of memory.

	2) Array elements need contiguous memory locations to store their values.

	3) Inserting an element in an array is performance wise expensive as we 
		have to shift several elements to make a space for the new element. For example:
	
		Let�s say we have an array that has following elements: 10, 12, 15, 20, 4, 5, 100, now if we want to insert a new element 99 after the element that has value 12 then we have to shift all the elements after 12 to their right to make space for new element.

		Similarly deleting an element from the array is also a performance wise expensive 
		operation because all the elements after the deleted element have to be shifted left.
		

		These limitations are handled in the Linked List by providing following features:
		1. Linked list allows dynamic memory allocation, which means memory allocation is done at the run time by the compiler and we do not need to mention the size of the list during linked list declaration.

		2. Linked list elements don�t need contiguous memory locations because elements 
			are linked with each other using the reference part of the node that contains the address of the next node of the list.

		3. 	Insert and delete operations in the Linked list are not performance wise expensive 
			because adding and deleting an element from the linked list does�t require element shifting,
			only the pointer of the previous and the next node requires change.
 */

package com.corejava.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class C_02_LinkedList {

	public static void main(String args[]) {

		LinkedList<String> l1 = new LinkedList<String>();

		// Adding list to the list
		//boolean add(Object item): It adds the item at the end of the list.
		l1.add("Nehara");
		l1.add("Sachin");
		l1.add("Saurav");
		l1.add("Dhoni");

		// Adding element to the first position
		// void addFirst(Object item): It adds the item (or element) at the first position in the list.
		l1.addFirst("Rohit");
		l1.addFirst("Virat");

		// Adding element to the last
		//void addLast(Object item): It inserts the specified item at the end of the list.
		l1.addLast("Kumble");

		// Adding element to third position
		//void add(int index, Object item): It adds an item at the given index of the the list.

		l1.add(3, "Virendra");

		// Iterating through list

		Iterator<String> itr = l1.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		
		// Removing items from list
		System.out.println("Before removing items from list ");
		System.out.println(l1);
		
		//Object remove(): It removes the first element of the list.
		//Object remove(int index): It removes the item from the list which is present at the specified index.
		
		l1.remove(3);
		l1.removeFirst();
		l1.removeLast();
		System.out.println("After removing items from list ");
		System.out.println(l1);
		
		String s = l1.get(0);
		System.out.println("First element is " + s);
		
		//Object set(int index, Object item): It updates the item of specified index with the give value.		
		l1.set(0, "Prithvi");
		l1.add(1, "Prithvi");
		
		//Object get(int index): It returns the item of the specified index from the list.
		
		s = l1.get(0);
		
		System.out.println("First element is " + l1);
		
		//Object remove(Object obj): It removes the specified object from the list.
		//Object removeFirst(): It removes the first item from the list.
		// Object removeLast(): It removes the last item of the list.
		// Object removeFirstOccurrence(Object item): It removes the first occurrence of the specified item.
		//Object removeLastOccurrence(Object item): It removes the last occurrence of the given element.
		
		l1.remove("Prithvi");
		
		System.out.println("First element is " + l1);
		
		
		//boolean addAll(Collection c)
		// boolean addAll(int index, Collection c): It adds all the elements of 
		// collection c to the list starting from a give index in the list. It throws 
		//NullPointerException if the collection c is null and IndexOutOfBoundsException 
		//when the specified index is out of the range.
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Srinath");
		l2.add("Prabhakar");
		
		l1.addAll(l2);
		
		System.out.println("After adding second collection");
		System.out.println(l1);
		
		//void clear(): It removes all the elements of a list.
		l2.clear();
		
		//Object clone(): It returns the copy of the list.
		
		// boolean contains(Object item): It checks whether the given item is present 
		//in the list or not. If the item is present then it returns true else false.
		
		// Object getFirst(): It fetches the first item from the list.
		
		// Object getLast(): It fetches the last item from the list.
		
		//int indexOf(Object item): It returns the index of the specified item.
		
		//int lastIndexOf(Object item): It returns the index of last occurrence of the specified element.

		
		//Object poll(): It returns and removes the first item of the list.
		System.out.println("Before Poll");
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println("After Poll");
		System.out.println(l1);
		
		//Object pollFirst(): same as poll() method. Removes the first item of the list.
		
		System.out.println(l1.pollFirst());
		System.out.println("After Poll First");
		System.out.println(l1);
		
		
		//Object pollLast(): It returns and removes the last element of the list.
		
		//int size(): It returns the number of elements of the list.
		
	}

}
