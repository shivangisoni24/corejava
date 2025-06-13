package com.rays.in;


// Find the sum of all elements in an array ?


public class ArraySum {

	public static void main(String[] args) {
		
		int [] num = {1,2,3,4,5};
		int sum = 0;
		System.out.println("Length : " + num.length);
		for ( int i = 0; i < num.length; i++) {
			sum += num[i];
			
		}
		System.out.println("Sum : " + sum);
	}
}
