package com.rays.in;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//int num = 10;
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(" fibonacci Series - ");
	
	for ( int i = 1; i <= 10; i++) {
		System.out.print(a + " ");
	
	    c = a + b;
		a = b;
		b = c;
		
	}
  }
}