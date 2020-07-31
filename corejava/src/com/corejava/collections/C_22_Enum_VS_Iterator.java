package com.corejava.collections;

public class C_22_Enum_VS_Iterator {

	/**
	 * 
	 * An iterator over a collection. Iterator takes the place of Enumeration in the
	 * Java Collections Framework. Iterators differ from enumerations in two ways:
	 * 1) Iterators allow the caller to remove elements from the underlying
	 * collection during the iteration with well-defined semantics. 2) Method names
	 * have been improved. hashNext() method of iterator replaced hasMoreElements()
	 * method of enumeration, similarly next() replaced nextElement().
	 * 
	 * Explanation From Javadoc: This exception may be thrown by methods that have
	 * detected concurrent modification of an object when such modification is not
	 * permissible. For example, it is not generally permissible for one thread to
	 * modify a Collection while another thread is iterating over it. In general,
	 * the results of the iteration are undefined under these circumstances. Some
	 * Iterator implementations (including those of all the general purpose
	 * collection implementations provided by the JRE) may choose to throw this
	 * exception if this behavior is detected. Iterators that do this are known as
	 * fail-fast iterators, as they fail quickly and cleanly, rather that risking
	 * arbitrary, non-deterministic behavior at an undetermined time in the future.
	 */

}
