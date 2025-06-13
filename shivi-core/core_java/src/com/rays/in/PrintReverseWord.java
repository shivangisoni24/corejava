package com.rays.in;

public class PrintReverseWord {

	public static void main(String[] args) {
		
		String a = " HELLO JAVA ";
		System.out.print(" Reverse word : ");
		
		for (int i = a.length()-1; i >= 0; i--) {
			
		System.out.print(a.charAt(i));
		}
	}
}