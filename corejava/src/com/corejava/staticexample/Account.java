package com.corejava.staticexample;
/* Example for static variable and static method
 * You can not use non static variables inside static method 
 * */
public class Account {
	private String name;
	private int accountNo;
	private double balance;
	private static String bankName = "ICICI";

	public static String getBankName() {
		return bankName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account NO:" + this.accountNo + "\n" + "Name=" + this.name
				+ "\n" + "Balance:" + this.balance + "\n" + " bankName="
				+ bankName;
	}

	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Account No. : " + this.accountNo);
		System.out.println("Balance. : " + this.balance);
		System.out.println("bankName : " + Account.getBankName());
	}
}