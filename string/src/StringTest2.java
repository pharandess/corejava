
public class StringTest2 {

	public static void main(String[] args) {
		
		String test = "ABCDEFGH";
		
		System.out.println(test.charAt(3));
		//System.out.println(test.charAt(-1));

		
/* 		compareTo
 * 		
 */
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "melko";
		String s4 = "hemlo";
		String s5 = "flag";
		String s6 = "";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		
		System.out.println(s2.compareTo(s6));
		System.out.println(s6.compareTo(s1));
		
	/*concat
	 * 	
	 */
		
		String c1 = "java string";
		
		s1.concat("is immutable");
		
		System.out.println(c1);
		
		c1 = c1.concat("is immutable so assign it explicitley");
		
		System.out.println(c1);
		
		String d1 = "what do you know about me";

		System.out.println(d1.contains("what do you"));
		System.out.println(d1.contains("know"));
		System.out.println(d1.contains("lets see"));
		
		
		/*
		 * endswith()
		 */
		
		System.out.println(d1.endsWith("e"));
		System.out.println(d1.endsWith("about me"));
		
		System.out.println();
		
		/*
		 * equals() 
		 */
		
		String e1 = "javatpoint";
		String e2 = "javatpoint";
		String e3 = "JAVATPOINT";
		String e4 = "python";
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		
		/*
		 * equalignorecase()
		 */
		
		System.out.println();
		System.out.println(e1.equalsIgnoreCase(e2));
		System.out.println(e1.equalsIgnoreCase(e3));
		System.out.println(e1.equalsIgnoreCase(e4));
		
		System.out.println();
		
		String f1 = "ABCDEFG";
		
		 byte[] b1 = f1.getBytes();
		 char[] b2 = new char[10];
		 
		 f1.getChars(0, f1.length(), b2, 0);
		 
		 for (int i=0; i < b1.length;i++){
			 
			 System.out.println(b1[i]);
		 }
			 
		 System.out.println();

for (int i=0; i < b2.length;i++){
			 
			 System.out.println(b2[i]);
		 }
		 
		 
	}

}
