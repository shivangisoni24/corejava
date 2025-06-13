package com.rays.in;

public class Armstrong {

	public static void main(String[] args) {
		 
		int num = 153;
		int sum = 0;
		int temp = num;
		int r = 0;
		
		while ( temp > 0) {
			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp/10;
		}
		 System.out.println(sum);
		 if ( sum == num) {
			 System.out.println(sum + " is Armstrong");
		 }else {
			 System.out.println(sum + " is not Armstrong");
		 }
	}
}  