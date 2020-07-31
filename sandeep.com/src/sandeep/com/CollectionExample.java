package sandeep.com;
import java.util.*;

public class CollectionExample {

	public class book{
		
		String name,author,publisher;
		int id,quantity;
		
		public book(int id, String name ){
			
			this.id = id;
			this.name=name;
			
			
		}
		
		public void printBook(){
			
			System.out.println(id+":"+name);
			
		}
	} 
	
	public static void main (String args[]){

		ArrayList<CollectionExample.book> al = new ArrayList<CollectionExample.book>();
		
		al.add(new CollectionExample().new book(1,"C++"));
		al.add(new CollectionExample().new book(2,"Java"));
		al.add(new CollectionExample().new book(3,"Adv Java"));
		
		
		
		for(book b:al){
			
			b.printBook();
			
		}

		al.remove(2);
		
		System.out.println("After Removing Item"); 
		
		for(book b:al){
			b.printBook();
		}
		
	}
}
