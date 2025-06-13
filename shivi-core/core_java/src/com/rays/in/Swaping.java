package com.rays.in;

public class Swaping {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c;
		
		System.out.println("Befor Swaping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swaping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
