package com.rays.in;

public class PrintNumbers {
	
	public static void main(String[] args) {
		for (int a = 1; a <= 20; a++) {
			System.out.print( a );
			if (a < 20 ) {
				System.out.print("  ,  ");
			}
		}
	}

}