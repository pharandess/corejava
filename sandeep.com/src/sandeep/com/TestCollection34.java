package sandeep.com;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class TestCollection34 {

	class book{
		int id;
		String name;
		
		public book(int id, String name){
			
			this.id =id;
			this.name=name;
		}
		
		public void printBook(){
			System.out.println("id:"+ id + " Name:" + name);
		}
	}
	
	public static void main(String args[]){
		
		TreeMap<Integer, book> t = new TreeMap<Integer, TestCollection34.book>();
		
		t.put(1, new TestCollection34().new book(1,"Lets C"));
		t.put(2, new TestCollection34().new book(1,"Python"));
		t.put(3, new TestCollection34().new book(1,"Scala"));
		t.put(4, new TestCollection34().new book(1,"Spark"));
		t.put(5, new TestCollection34().new book(1,"Hadoop"));
		
		book b;
		
		for(Map.Entry m : t.entrySet()){
		
			b = (book)m.getValue();
			System.out.println(m.getKey());
			System.out.println("Detials" );
			b.printBook();
			
		}
		
	}
	
}
