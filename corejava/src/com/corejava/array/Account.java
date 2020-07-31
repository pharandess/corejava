
package com.corejava.array;

public class Account {
private String  name;
private int		accountNo;
private double  balance;

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}

public int getAccountNo() { 
	return this.accountNo;
}

public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}

public double getBalance() {
	return this.balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public void deposit(double amount)
{
	this.balance = this.balance + amount;
}

public void withdraw(double amount){
	this.balance = this.balance - amount;
}

public void display(){
	System.out.println(" Name : " + this.name);
	System.out.println(" Account No. : " + this.accountNo);
	System.out.println(" Balance. : " + this.balance);
}
}