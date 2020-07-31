package sandeep.com;

import java.util.PriorityQueue;

public class TestCollection16 {
	
	class book implements Comparable<book>{
		
		int id;
		String name;
		
		public book(int id, String name){
			this.id=id;
			this.name=name;
		}
		
		public void printBook(){
			
			System.out.println("id="+id + " name=" + name);

		}
		
		public int compareTo(book b2){
			
			if (this.id > b2.id){
				return 1;
			}
			else if(this.id<b2.id)
			return -1;
		
		else
		{
			return 0;
		}
	}
	}
		
		public static void main (String args[]){

			PriorityQueue<book> b = new PriorityQueue<TestCollection16.book>();
			
			b.add(new  TestCollection16().new book(121, "Let us C"));
			b.add(new TestCollection16().new book(233,"Operating System"));
			b.add(new TestCollection16().new book(101,"Data Communications & Networking"));
			
			
			for(book b1: b){
				b1.printBook();
			}
			
			b.remove();
			
			System.out.println("*** After removing one element ***");
			
			for(book b1: b){
				b1.printBook();
			}
			
		}
		
	}