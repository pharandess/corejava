package WrapperExamples;

public class WrapperMethodExample1 {

	public static void main(String args[]){
		
		/* xxxValue*/
		/* Method converts the value of Number Object that invoke method to the primitive data 
		 * type*/
		
		Integer i = 5;
		
		System.out.println("Byte Value " + i.byteValue());
		System.out.println("Short Value " + i.shortValue());
		System.out.println("double Value " + i.doubleValue());
		
		Double d = 99.99;
		
		System.out.println("Integer Value " + d.intValue());
		System.out.println("Short Value " + d.shortValue());
		System.out.println("Float Value " + d.floatValue());
		
		/* compareTo */
		/* This method compare number object with invoked method to the argument passed */
		
		Integer j =5;
		Double d1 = 75.88;
		
		System.out.println(j.compareTo(7)); 
		System.out.println(d1.compareTo(88.66));
		
		/* equals */
		/* This method determine if the number object that invoke the method is equal to  the argument */
		
		System.out.println(j.equals(5));
		
		
		}
}
