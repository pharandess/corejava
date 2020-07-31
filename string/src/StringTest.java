import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		
		String s = "I am happy";
		s = "I am too happy";
		s.charAt(1);
		
		// String Buffer
		StringBuffer s1 = new StringBuffer();		
		s1.append("Hello");
		// String Tokenizer
		
		StringTokenizer  s2 = new StringTokenizer("I,am,Happy",",");
					
		while (s2.hasMoreElements()) {
			System.out.println(s2.nextElement());
		}	
	}
}
