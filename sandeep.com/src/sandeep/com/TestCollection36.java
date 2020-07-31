package sandeep.com;
import java.util.*;

public class TestCollection36 {

	class Book {
		
		String name;
		
		public Book(String name){
			this.name = name;
		}
		
		public void printBook(){
			System.out.println("Name:" + name);
		}
	}
	
	public static void main(String args[]){
		
		Hashtable<Integer, Book> h = new Hashtable<Integer, TestCollection36.Book>();
		
		h.put(1, new TestCollection36().new Book("Java"));
		h.put(2, new TestCollection36().new Book("Scala"));
		h.put(3, new TestCollection36().new Book("Python"));
		h.put(4, new TestCollection36().new Book("Spark"));
		
		Book b;
		
		for (Map.Entry<Integer, Book> m : h.entrySet()){
			
			System.out.println(m.getKey() + " Detials");
			b = m.getValue();
			
			b.printBook();
			
		}
			
	}
	
}
