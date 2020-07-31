
public class Interfacedemo2 implements A.InnerInterface{

	public void msg(){System.out.println("Implemented inner interface");}
	
	public static void main(String args[]){
		
		Interfacedemo2 d1 = new Interfacedemo2();
		
		d1.msg();
	}
	
}
