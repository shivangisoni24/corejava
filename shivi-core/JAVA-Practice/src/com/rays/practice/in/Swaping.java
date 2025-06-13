package com.rays.practice.in;

public class Swaping {
 
	public static void main(String[] args) {
		
	 int a = 1;
	 int b = 2;
	 int c = 3;
	 int d;
	 
	 System.out.println("----before swaping----");
	 
	 System.out.println("a : " + a);
	 System.out.println("b : " + b);
	 System.out.println("c : " + c);
	 
	 
	 System.out.println("----afetr swaping----");
	 
	 d = a;
	 a = b;
	 b = c;
	 c = d;
     System.out.println("a - " + a);
     System.out.println("b - " + b);
     System.out.println("c - " + c);
	}
}
