
public class InnerClass2 {
	
	int data =30;
	
	public void display(){
		
	int value =50;
	
	 class Local{
		
		public void msg()
		{
		System.out.println("Value is " + value);
		}
		}
	 
	 Local l1 = new Local();
	 
	 l1.msg();
		
	} 

	
	public static void main(String args[]){
		
		InnerClass2 ic = new InnerClass2();
		
		ic.display();
		
	}
}
