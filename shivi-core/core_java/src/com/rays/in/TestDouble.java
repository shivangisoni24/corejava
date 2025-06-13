package com.rays.in;

public class TestDouble {
 
public static void main(String[] args) {
		
		double a = 900d;
		
		if ( a > 550d ) {
			System.out.println(a + " is your very high value.");
		} else if ( a > 350d ) {
			System.out.println(a + " is your high value.");
		} else if (a > 150d) {
			System.out.println(a + " is your low value.");
		} else {
			System.out.println(a + " is your very low value.");
		}
	}
}