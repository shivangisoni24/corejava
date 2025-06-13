package com.rays.in;

public class FindMinimumNoArray {

public static void main(String[] args) {
		
		int[] no = {2, 4, 6, 8, 10, 3, 1};
		
  	int min = no[0];
		
		for(int i=1; i<no.length; i++) {
			if (no[i] < min) {
			min = no[i];
		}
	  }
		System.out.println("minimun no : " + min);	
	}
}
