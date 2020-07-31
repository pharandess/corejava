package sandeep.com;

import java.util.TreeSet;

public class TestCollectoion15 {

	class book implements Comparable<book>{
		String name;
		int id;
		
		public book(int id,String name){			
			this.id=id;
			this.name=name;			
		}
		
		public void printBook(){
			
			System.out.println("id="+id+" name="+name);
		}
		
		public int compareTo(book b){
			
			if (this.id < b.id){
				return -1;
			}else if(this.id > b.id){
				return 1;
			}
			else
			{
				return 0;
			}
			
		}
	}
	
	public static void main(String args[]){
		
		TreeSet<book> bk = new TreeSet<TestCollectoion15.book>();
		
		bk.add(new TestCollectoion15().new book(3,"Third Book"));
		bk.add(new TestCollectoion15().new book(1,"First Book"));
		bk.add(new TestCollectoion15().new book(2,"Second Book"));
		bk.add(new TestCollectoion15().new book(3,"Fourth Book"));
		
		
		for(book tbk: bk){
			
			tbk.printBook();
		}
		
	}
}
