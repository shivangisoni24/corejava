package com.rays.oop.pilymorphism;


// Method Overloading

public class Sum {
   
	public void Sum (int a, int b) {
		System.out.println("Sum of two int no: " + (a+b));
	}
	
	public void Sum (int a, int b,int c) {
		System.out.println("Sum of three int no: " + (a+b+c));
	}
	
	public void Sum (double a, double b) {
		System.out.println("Sum of two double no: " + (a+b));
	}
	
}
