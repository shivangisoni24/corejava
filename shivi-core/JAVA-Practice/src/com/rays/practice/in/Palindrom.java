package com.rays.practice.in;

public class Palindrom {

	public static void main(String[] args) {
		
		int num = 151;
		int rev = 0;
		int temp = num;
		int rem = 0;
		
		while( temp > 0) {
			rem = temp % 10;
			rev = (rev*10) + rem;
			temp = temp/10;
		}
		System.out.println("reverse no : " + rev);
		if (num==rev) {
			System.out.println(rev + " this is palindrome");
		}else {
			System.out.println(rev + " this is not palindrome");
		}
	}
}
