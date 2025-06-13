package com.rays.practice.in;

public class Sum {

	public static void main(String[] args) {
//		
//		int sum =0;
//		for(int n=1; n<=5; n++) {
//			 sum += n;		
//		}
//		 System.out.println(sum);
		
		System.out.println("-----factorial-------");
		
		int factorial = 7;
		int sum =1;
		for(int i=factorial; i >=1; i--) {
			sum *= i;  
//			sum = sum*i;
		}
	System.out.println(sum);
	}
}
