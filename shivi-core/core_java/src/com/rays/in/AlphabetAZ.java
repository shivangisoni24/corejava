package com.rays.in;

public class AlphabetAZ {

	public static void main(String[] args) {
		for ( char a= 'A'; a <= 'Z'; a++) {
			System.out.print( a);
			if (a < 'Z') {
				System.out.print(" , ");
			}
			
		}
	}
}
