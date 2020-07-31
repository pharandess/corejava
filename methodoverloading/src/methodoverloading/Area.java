package methodoverloading;

public class Area {
	
	public static void calArea(int x){
		System.out.println("cal area 1");
		System.out.println(x*x);
	}	
	public static void calArea(int x, int y){
		System.out.println("cal area 2");
		System.out.println(x*y);
	}
	
	public static void calArea(double pi, int r){
		System.out.println("cal area 3");
		System.out.println(pi*r*r);
	} 	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area.calArea(2);
		Area.calArea(2,5);
		Area.calArea(3.12,2);
	}
}