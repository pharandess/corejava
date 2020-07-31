package sandeep.com;
import java.util.*;

public class CollectionsExample3 {

	public class book implements Comparable<book>{
		
		int id;
		String name;
	
	public book(int id, String name){
		
		this.id = id;
		this.name = name;
	}
	
	public void printBook(){
		
		System.out.println("id = " + id + " Name = " + name );
	}
	
	public int compareTo(book b){
		
		if (this.id > b.id){
			return 1;
		}
		else if(this.id < b.id)  {
			return -1;
		}
		else{
			return 0;
		}
		
		
	}
	
	}


	public static void main(String args[]){
		
		List<book> al = new ArrayList<book>();
		
		 
		
		al.add(new CollectionsExample3().new book(3,"Third"));
		al.add(new CollectionsExample3().new book(22,"Twenty Two"));
		al.add(new CollectionsExample3().new book(7,"Seven"));
		al.add(new CollectionsExample3().new book(11,"Eleven"));
		
		
		
		for(book b:al){
			
			b.printBook();
			
		}
		
		Collections.sort(al);
		
		System.out.println("******* After Sorting ************ ");
		
		for(book b:al){
			
			b.printBook();
			
		}
	}

	
	
}
