package com.rays.in;

public class PrimeNo{

	public static void main(String[] args) {
		
		int a = 15;
		int count = 0;
		for ( int i = 2; i < a; i++) {
			if ( a % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		if (count > 0) {
			System.out.println(a + " is not prime no.");
		} else {
			System.out.println(a + " is prime no.");
		}
	}
}
