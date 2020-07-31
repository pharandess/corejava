package sandeep.com;
import java.util.*;

public class TestCollectin8 {

	class book {
		
		String name,Author;
		int id;
		
		book(int id, String name, String Author ){
			
			this.id = id;
			this.name = name;
			this.Author =Author;
		}
		
		public void printBook(){
			
			System.out.println("Id="+ id + " Name="+ name + " Author="+ Author);		
			
		}
		
	}
	
	public static void main(String args[]){
		
			
		LinkedList<TestCollectin8.book> bk = new LinkedList<TestCollectin8.book>();
		
		TestCollectin8.book tb1 = new TestCollectin8().new book(1,"Book1","");
		
		bk.add(tb1);
		bk.add(new TestCollectin8().new  book(2,"Book2",""));
		bk.add(new TestCollectin8().new  book(3,"Book3",""));
		bk.addFirst(new TestCollectin8().new  book(0,"My First Book",""));
		
		Iterator it = bk.iterator();
		
		TestCollectin8.book db;
		
		while (it.hasNext()){
			
			db=(book)it.next();
			
			db.printBook();
		}
		
		bk.remove(2);
		
		System.out.println("After Removing Items");
		
		book tb2;
		
		System.out.println("Number of elements in colletion = " + bk.size() );
		
		for (book tb:bk){
			
			tb2 = tb;
			
			tb2.printBook();
		}
		
	}
	
}
