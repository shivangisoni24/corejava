package com.rays.in;

public class SumOfIntegers {
 
	public static void main(String[] args) {
	
		int sum = 0;
		
		for ( int i = 100; i < 200; i++) {
			if ( i % 7 == 0) {
			sum += i;
	    	}
		}
		
		System.out.println("Sum of Integers Greater Than 100 and Less Than 200 that are Divisible by 7 :  " + sum);
		
    }
}