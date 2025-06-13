package com.rays.practice.in;

public class SwapingFourNo {
	
	public static void main(String[] args) {
		
	 int a = 1;
	 int b = 2;
	 int c = 3;
	 int d = 4;
	 int e;
	 System.out.println("_____before swaping____");
	 System.out.println("a = " + a);
	 System.out.println("b = " + b);
	 System.out.println("c = " + c);
	 System.out.println("d = " + d);
	 
	 System.out.println("_____after swaping____");
	 e=a;
	 a=d;
	 d=e;
	 System.out.println("a = " + a);
	 System.out.println("b = " + b);
	 System.out.println("c = " + c);
	 System.out.println("d = " + d);
	}

}
