package sandeep.com;

import java.util.HashSet;

public class TestCollection11 {
	
	class book{
		String name;
		int id;
		
		public book(int id, String name){
			
			this.id = id;
			this.name = name;
		}
		
		public void printBook(){
			System.out.println("id="+id+ " name="+name);
		}
		}
	
	public static void main (String args[]){
		
	
		HashSet<TestCollection11.book> bk = new HashSet<TestCollection11.book>();
		
		bk.add(new TestCollection11().new book(1,"Book1"));

		TestCollection11.book tb1 = new TestCollection11().new book(2,"Book2");

		bk.add(tb1);
		
		tb1 = new TestCollection11().new book(3,"Book3");
		
		bk.add(tb1);
		
		bk.add(new TestCollection11().new book(1,"Book1"));
		
		for(book b:bk){
			
			b.printBook();
		}
		
	}
	
}
