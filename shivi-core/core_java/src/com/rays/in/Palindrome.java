package com.rays.in;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 121;
		int rnum = 0;
		int temp = num;
		int r = 0;
		
		while ( temp > 0) {
			r = temp % 10;
			rnum = ( rnum*10 ) + r;
			temp = temp/ 10;
		}
		 System.out.println(rnum);
		 if ( rnum == num ) {
			 System.out.println(num + " - palindrome number.");
		 }else {
			 System.out.println(num + " - not palindrome number.");
		 }
	}
}
