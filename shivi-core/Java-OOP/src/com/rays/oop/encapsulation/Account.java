package com.rays.oop.encapsulation;

public class Account {

	
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
	return this.number;
	}
	 
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAccount() {
		return this.accountType;
	}
	
	public void setAccount(String accountType) {
		this.accountType =accountType;
	}
	
	public double getBalance() {
	return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount;
		System.out.println("Total balance after deposite : " + this.balance);
	}
	
	public void withdrawal(double amount) {
		if(amount > this.balance) {
			System.out.println("Insufficent Balance.... Sorry for FundTransfer..!!");
		}else {
		this.balance = balance - amount;
		System.out.println("Total balance after withdrawal : " + this.balance); 
	}
	}
	
	public void fundTransfer(double amount) {
		if(amount > this.balance) {
			System.out.println("Insufficent Balance.... Sorry for FundTransfer..!!");
		}else {
		this.balance = balance - amount;
		System.out.println("Total balance after FundTransfer : " + this.balance);
	}
	}
	
	public void payBill(double amount) {
		if(amount > this.balance) {
			System.out.println("Insufficent Balance.... Sorry for FundTransfer..!!");
		}else {
		this.balance = balance - amount;
		System.out.println("Total balance after PayBill : " + this.balance);
	}
	}
}