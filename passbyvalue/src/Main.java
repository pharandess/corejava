import java.util.Scanner;

public class Main {
/* Objective of this program is to check pass by value and pass by reference examples.
 * Java works on pass by value. In case of object.
 * Call by Value means calling a method with a parameter as value. 
 * Through this, the argument value is passed to the parameter.
   Call by Reference means calling a method with a parameter as a reference. 
   Through this, the argument reference is passed to the parameter.
   In call by value, the modification done to the parameter passed does not reflect in 
   the caller's scope while in the call by reference, the modification done to the 
   parameter passed are persistent and changes are reflected in the caller's scope.
   But Java uses only call by value. It creates a copy of references and pass them 
   as value to the methods. If reference contains objects, then the value of an object 
   can be modified in the method but not the entire object. 
 * 
 * 
 * */
public static void changeValues(int a, Student x){	
	a = a + 20;	
	x.setRno(2);
}

public static void main(String[] args) {
	int i = 10;	
	Student s = new Student();
	s.setRno(1);
	s.setName("Jon");
	
	System.out.println("Value of i before change " + i);
	System.out.println("Value of rollnumber before change " + s.getRno());
	changeValues(i,s);
	
	System.out.println("Value of i after change " + i);
	System.out.println("Value of rollnumber after change " + s.getRno());
	/*
	 * If example
	 */
	int result;
	Scanner scr = new Scanner(System.in);
	System.out.print("Enter no :");
	
	result = scr.nextInt();
	
	if (result < 35){
		System.out.println("Fail");
	}
	else{
		System.out.println("Pass");
	}
	
	if (result > 90){
		System.out.println("EXCELLENT");
	}
	else if (result > 70){
		System.out.println("Dist");
	}
	else if (result > 60){
		System.out.println("First");
	}
	else if (result > 50){
		System.out.println("Second");
	}
	else if (result > 35){
		System.out.println("Third");
	}
	else
	{
		System.out.println("Fail");
	}
	
	
	// Switch example
	int month =5;
	
	switch (month){
	case 1:
			System.out.println("January");
			break;
	case 2 :		
		System.out.println("Feburary");
		break;
	case 3 :		
		System.out.println("March");
		break;
	case 4 :		
		System.out.println("April");
		break;
	case 5 :		
		System.out.println("May");
		break;
	case 6 :		
		System.out.println("Jun");
		break;
	case 7 :		
		System.out.println("Jul");
		break;
	case 8 :		
		System.out.println("Aug");
		break;
	case 9 :		
		System.out.println("Sep");
		break;
	default :
		System.out.println("Default");		
	}
	scr.close();
}
}