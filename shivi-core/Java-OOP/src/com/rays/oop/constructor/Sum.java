package com.rays.oop.constructor;

public class Sum {

	public Sum() {
		System.out.println("this is default constructor");
	}
	
	public Sum (int a, int b) {
		System.out.println("sum = " + (a+b));
	}
	public Sum(double a, double b) {
		System.out.println("sum of double : " + (a+b));
	}
}
