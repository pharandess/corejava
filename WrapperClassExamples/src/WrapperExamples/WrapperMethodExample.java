package WrapperExamples;

import org.omg.CORBA.portable.ValueOutputStream;

public class WrapperMethodExample {
	
	public static void main(String[] args) {
		
		//xxxValue()
		Integer x =5;
		System.out.println("xxxValue() example");
		System.out.println(x.byteValue());
		
		//compareTo()
		System.out.println("compareTo() example");
		System.out.println(x.compareTo(4)); // if argument Value is less than object value then returns 1
		System.out.println(x.compareTo(5)); // if argument Value is equal to object value then returns 0
		System.out.println(x.compareTo(6)); // if argument Value is grate than object value then returns -1
		
		//equals()		
		System.out.println("equals() example ");
		System.out.println(x.equals(5)); // if value is equals then it return true
		System.out.println(x.equals(6)); // if value is not equals then it return false
		
		//valueOf() this method returns relevant Number object holding the value of argument passed
		//This is static method
		
		System.out.println("Value of output ");
		
		//valueOf(int i) 
		System.out.println(Integer.valueOf(10));
		System.out.println(Integer.valueOf("88"));
		Integer z = Integer.valueOf("444",10);
		System.out.println("z="+z);
		
		//toString() 
		// this method is used to get string object representing value of number object
		System.out.println("toString Output");
		System.out.println(x.toString());
		
	}

}
