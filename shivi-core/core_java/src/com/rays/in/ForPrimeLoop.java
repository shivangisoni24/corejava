package com.rays.in;

public class ForPrimeLoop {

	public static void main(String[] args) {
		 
		int count = 0;
	 
		 for (int i = 1; i <= 50; i++) {
			 for (int j = 2; j < i; j++) {
				 if (i % j == 0) {
					 count++;
				 }
			 }
			 if (count > 0) {
				 System.out.println(i + " is not prime no.");
				 count = 0;
		 } else {
			 System.out.println(i + " is prime no.");
		 }
	  }
	}
}