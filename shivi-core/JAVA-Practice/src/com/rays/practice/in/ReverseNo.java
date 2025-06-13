package com.rays.practice.in;

public class ReverseNo {
	
	public static void main(String[] args) {
		
		int num = 1234;
		int reverse = 0;
		int temp = num;
		int r = 0;
		
		while(temp > 0) {
		r  = temp % 10;
	    reverse = (reverse*10) + r;
	    temp = temp / 10;
     	
	}
		System.out.println(reverse);
	}
}
