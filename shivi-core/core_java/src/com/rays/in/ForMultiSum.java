package com.rays.in;

public class ForMultiSum {

     public static void main(String[] args) {
		 
		int sum = 1;
		int num = 7;
		
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		System.out.println("All Multiplication Sum is  " + sum);
	} 
}