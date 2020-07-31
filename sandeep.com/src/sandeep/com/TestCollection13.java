package sandeep.com;
import java.util.*;

public class TestCollection13 {

	class book{
		String name;
		int id;
		
		public book(int id, String name){
	
			this.id = id;
			this.name = name;
			
		}
		
		public void printBook(){
			
			System.out.println("id="+id+ " Name="+name);
		}
		
	}
	
	public static void main(String args[]){
		
		LinkedHashSet<TestCollection13.book> bk = new LinkedHashSet<TestCollection13.book>();
		
		bk.add(new TestCollection13().new book(1,"Book1"));
		bk.add(new TestCollection13().new book(2,"Book2"));
		bk.add(new TestCollection13().new book(3,"Book3"));
		bk.add(new TestCollection13().new book(1,"Book1"));
		
		for(book b:bk){
			b.printBook();
		}		
				
	}
}