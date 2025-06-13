package com.rays.in;

public class ReverseDigit {

	public static void main(String[] args) {
		
		int sum = 1234567;
		int reverseno = 0;
		 
		while (sum > 0) {
			
			int num = sum % 10;
			reverseno = reverseno*10 + num;
			sum = sum/10;
		}
		System.out.println("Reverse number : " + reverseno);
	}
}