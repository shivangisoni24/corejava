package com.rays.practice.in;

public class RevString {

	public static void main(String[] args) {
		
		String name = " SHIVANGI ";
		String reverse = " ";
		for (int i = name.length()-1 ; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
			}
		System.out.println("Orignal Name - " +  name);
		System.out.println("Reverse Name - " + reverse);
	}
}