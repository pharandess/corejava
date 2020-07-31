package sandeep.com;
import java.util.*;
public class TestCollection32 {

	class book{
		
		int id;
		String name;
		
		public book(int id, String name){
			this.id = id;
			this.name = name;
		}
		
		public void printBook(){
			System.out.println("id="+ id + " Name = " + name);
		}
		
	}
	
	public static void main (String args[]){
		
		LinkedHashMap<Integer, book> lh = new LinkedHashMap<Integer, TestCollection32.book>();
		
		lh.put(1, new TestCollection32().new book(1,"First Book"));
		lh.put(2, new TestCollection32().new book(2,"Second Book"));
		lh.put(3, new TestCollection32().new book(3,"Third Book"));
		lh.put(4, new TestCollection32().new book(1,"Fourth Book"));
		
		book b;
		
		for (Map.Entry m : lh.entrySet()){
			
			b = (book)m.getValue();
			
			b.printBook();
			
		}
		
		
		
		
	}
	
}
