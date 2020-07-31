package com.corejava.oopsconcepts;

public class Customer {

	private String first_name;
	private String last_name;

	Account acct;

	public Customer(String first_name, String last_name) {

		this.first_name = first_name;
		this.last_name = last_name;

	}

	public String to_string() {

		return " Cutomer first_name = " + this.first_name + " last_name = " + this.last_name;
	}

	public Account getAcct() {
		return acct;
	}

	public void setAcct(Account acct) {
		this.acct = acct;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
}
