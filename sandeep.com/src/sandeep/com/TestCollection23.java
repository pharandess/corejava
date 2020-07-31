package sandeep.com;
import java.util.*;
public class TestCollection23 {
	
	class book{
		
		int id;
		String name;
		
		public book(int id, String name){
			this.id = id;
			this.name = name;
		}
		
		public void printMe(){
			System.out.println("id="+id+ " Name="+ name);
		}
		
	}
	
	public static void main(String args[]){
		
		HashMap<Integer, book> hb = new HashMap<Integer, book>();
		
		hb.put(1, new TestCollection23().new book(1,"First 	Book"));
		hb.put(2, new TestCollection23().new book(2,"Second Book"));
		hb.put(3, new TestCollection23().new book(3,"Third 	Book"));
		hb.put(4, new TestCollection23().new book(4,"Fourth Book"));
		
		
		for(Map.Entry<Integer, book> b: hb.entrySet() ){
			
		book t = (book) b.getValue();
		
		t.printMe();
			
		}
	}
}
