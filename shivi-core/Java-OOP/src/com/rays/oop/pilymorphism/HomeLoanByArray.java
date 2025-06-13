package com.rays.oop.pilymorphism;

public class HomeLoanByArray {

	public static void main(String[] args) {
		
		Bank[] banks = new Bank[3];
		
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();
		loanEnquiry(banks);	
	}

//	automatic method created
	
	public static void loanEnquiry(Bank[] banks) {
		for(int i=0; i<banks.length; i++ ) {
			System.out.print("Bank Name : " + banks[i].getName());
			System.out.println(" interest rate is =  " + banks[i].interestRate());
		}
//  for each loop		
//		for (Bank b : banks) {
//			String name = b.getName();
//		    double rate = b.interestRate();
//			System.out.println(name + " = " + rate);
//		}	
	}
}
