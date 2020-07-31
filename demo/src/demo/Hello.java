package demo;
import java.util.Scanner;


public class Hello {
	
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int a = sc.nextInt();
		
		for (int i=0;i<=a;i++) {
			
			System.out.println(i);
		}
		
	}

}
