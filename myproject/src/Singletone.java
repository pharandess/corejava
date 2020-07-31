
public class Singletone {
	
	public static Singletone singleton = new Singletone();
	
	private Singletone (){
		
	}
	
	public static Singletone getInstance(){
		return singleton;
	}
	
	protected  void demoMethod(){
		System.out.println("Demomethod");
	}
}
