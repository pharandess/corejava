public class WrapperClassDemo {
	public static void main(String[] args) {

		int i = 10;
		Integer iWrapper = new Integer(i);
		// Below assignment is called as autoboxing
		Integer iWrapper1 = 20;

		System.out.println(iWrapper);
		// If we assign new value it will create new object, it will not use
		// first object. Its about memory management.
		iWrapper = 20;
		System.out.println(iWrapper);

		// convert wrapper object value to normal integer
		int b = iWrapper.intValue();

		// Below assignment is called as unboxing
		int c = iWrapper1;

		System.out.println(b);
		System.out.println(c);
	}
}