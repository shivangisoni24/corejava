package com.rays.in;

public class FindMaximumNumber{

	public static void main(String[] args) {
		
		int[] no = {2, 4, 6, 8, 10, 3, 1};
		
  	int max = no[0];
		
		for(int i=1; i<no.length; i++) {
			if (no[i] > max) {
			max = no[i];
		}
	  }
		System.out.println("maximun no : " + max);
		
		
	}
}
