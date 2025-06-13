package com.rays.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		
		
		Account ac = new Account();
		
		ac.setNumber("23456789010123");
		ac.setAccount("Saving Account");
		ac.setBalance(1500);
		
		System.out.println("Account Number : " + ac.getNumber());
		System.out.println("Account Type : " + ac.getAccount());
		System.out.println("Current Balance: " + ac.getBalance());
		
		ac.deposit(500);
		ac.withdrawal(1000);
		ac.fundTransfer(1200);
		ac.payBill(100);
	}
}
