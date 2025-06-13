package com.rays.in;

public class StringHandling1 {

	public static void main(String[] args) {
		
		String s1 = "Rays";
		String s2 = "Rays";
		
		String s3 = new String("Welcome");
		String s4 = new String("Rays");
		
		System.out.println(s1 == s3);
		System.out.println(s2.equals(s4));
		
	}
	
}