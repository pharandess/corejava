
public class TestAnnonymus1 {

	public static void main(String args[]){
		
		Eatable e = new Eatable(){
			public void eat()
			{
				System.out.println("Eating Inner");
			}
			
			public void eat1()
			{
				System.out.println("Eating Inner1");
			}		
			
		};
		e.eat();
		e.eat1();
	}
}
