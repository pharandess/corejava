public class TestMemberInner {

private int data =30;

class Inner {
	
	int i =0;
	
	public void msg(){
		
		
		System.out.println("data is " + data );
	}
	
	public void Inc(int inc){
		
		i = i + inc;
		
	}
	
	public void DispData(){
		System.out.println("Interger Value is " + i);
	}
	
}
	

public static void main(String args[]){
	
	TestMemberInner obj = new TestMemberInner();
	
	TestMemberInner.Inner obj1 = obj.new Inner();
	
	TestMemberInner.Inner obj2 = obj.new Inner();

	System.out.println("First Object");
	obj1.msg();
	obj1.Inc(10);
	obj1.DispData();
	
	System.out.println("Second Object");
	
	obj2.msg();
	obj2.Inc(20);
	obj2.DispData();
}
}