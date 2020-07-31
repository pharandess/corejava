
public class TestInnerClass {
	
public static void main(String args[]){	
	
	Person p = new Person()
	{
		public void eat(){
			System.out.println("Eating");
		}
				
	};

	p.eat();
}
}