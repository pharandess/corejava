
public class LocalInner1 {

	int data =50;
	
	public void disp(){
		
		class Inner1 {
			
			public void  msg(){
				System.out.println("data is "+ data);
			}
		}
		
		Inner1 i = new Inner1();
		
		i.msg();
				
	}
	
	
public static void main(String args[])
{
	
	LocalInner1 i1 = new LocalInner1();
	
	i1.disp();
}
	
}
