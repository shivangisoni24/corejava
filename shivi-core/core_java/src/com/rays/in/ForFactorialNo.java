package com.rays.in;

public class ForFactorialNo {

	public static void main(String[] args) {
		
		int factorial = 1;
		int num = 7;

		for (int i = num; i >= 1; i--) {
			factorial *= i;
		}
		System.out.println("Factorial no. : " + factorial);
		
	}
}  