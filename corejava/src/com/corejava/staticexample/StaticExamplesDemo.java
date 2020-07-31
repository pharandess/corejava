package com.corejava.staticexample;

public class StaticExamplesDemo {

	public static void main(String args[]) {
		
		// call static method without creating object of class
		System.out.println("**************Static method call using class name *********");
		StaticExamples.collageAddress();
		
		// refer individual static variables
		System.out.println("**************Static variable reference by using class name *********");
		System.out.println(StaticExamples.collageName);
		
		// create object of the StaticExamples class
		
		StaticExamples e1 = new StaticExamples("Electrionics",60);
		System.out.println("************ Instance Method call within whihc static method is called **************");
		e1.displayBranch();
		
		
	}
	
}
