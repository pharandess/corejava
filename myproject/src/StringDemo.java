public class StringDemo {
public static void main(String[] args) {
	String mystr = "I asdslkj asldkjff sadsadasd  happy";
	String city1 = "Pune";
	String city2 = "pune";
	
	System.out.println(mystr.length());
	System.out.println(mystr.charAt(5));
	System.out.println(mystr.contains("happy"));
	System.out.println(mystr.endsWith("end"));
	System.out.println(mystr.indexOf("happy"));
	System.out.println(mystr.isEmpty());
	
	if (city1.equalsIgnoreCase(city2)){
		System.out.println("String are same");
	}
	else
	{
		System.out.println("String are not same");
	}	
}
}
