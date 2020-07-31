package com.corejava.staticexample;
public class AccountDemo {
	
	public static void main(String[] args) {
		
		Account act1 = new Account();
		Account act2 = new Account();
		
		act1.setName("John");
		act1.setAccountNo(1);
		
		act2.setName("Mick");
		act2.setAccountNo(2);
		
		act1.deposit(5000);
		act2.deposit(209873);
				
		act1.withdraw(2000);
		act2.withdraw(6789);
		
		//act1.display();
		System.out.println(act1); // this will call toString method of the class.  
		act2.display();		
	}
}