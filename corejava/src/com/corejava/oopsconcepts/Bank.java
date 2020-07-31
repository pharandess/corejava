package com.corejava.oopsconcepts;

public class Bank {

	Customer[] cutomers;
	public int totalCutomers;

	public Bank() {

		totalCutomers = 0;
		cutomers = new Customer[10];
	}

	public void addCutomer(Customer cust) {

		cutomers[totalCutomers] = cust;
	}
	
	public Customer getCutomer(int cutomerid) {
		return cutomers[cutomerid];
	}
}
