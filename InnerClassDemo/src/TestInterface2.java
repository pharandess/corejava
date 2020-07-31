public class TestInterface2 implements  InnerInterface1.Message {

	public void msg(){
		System.out.println("Hello Nested Interface");
		};
	
	
	public static void main(String args[]){
		
		TestInterface2 t1 = new TestInterface2();
		
		t1.msg();
		
	}
	
}


