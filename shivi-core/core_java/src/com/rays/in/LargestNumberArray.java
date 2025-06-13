package com.rays.in;

public class LargestNumberArray {

	public static void main(String[] args) {
		
		int [] num = {24, 29, 15, 10, 9, 18, 27};
		int largest = num[0];
		
		for( int i = 0; i < num.length; i++) {
			if ( num [i] > largest) {
				largest = num [i];
			}
		}
        System.out.println("Largest number is " + largest);
	}
}
	