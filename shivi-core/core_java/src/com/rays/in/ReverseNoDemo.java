package com.rays.in;

public class ReverseNoDemo {
	public static void main(String[] args) {
		
		int a = 123;
		int v = a;
		int r = 0;
		while(v>0) {
			int b = v%10;
			r = r*10 + b;
			v=v/10;
			
		}
		System.out.println(r);
	}

}
