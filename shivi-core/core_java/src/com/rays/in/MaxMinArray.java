package com.rays.in;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int [] value = { 8, 3, 5, 1, 9 };
		int max = value[0];
		int min = value[0];
		
		for ( int i = 1; i < value.length; i++ ) {
			if ( value [i] > max) max = value[i];
			if ( value [i] < min)min = value [i] ;
		}
		System.out.println("Max : " + max);

		System.out.println("Min : " + min);
  }
}