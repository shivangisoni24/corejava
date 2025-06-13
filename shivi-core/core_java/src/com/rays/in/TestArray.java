package com.rays.in;

public class TestArray {

	public static void main(String[] args) {
		
		int [] i = { 5, 4, 6, 7, 8 };
		System.out.println("Length : " + i.length);
		
		System.out.println(i[0] + " " + i[3]);
		
		System.out.println("----------------");
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		// For Each Loop

		System.out.println("----------------");
		for ( int a : i) {
			System.out.println(a);
		}
	}
} 