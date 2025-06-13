package com.rays.in;

public class TestMethods {

	public static void main(String[] args) {
		
		Methods m = new Methods();
		m.Sum(5, 10);
//	System.out.println();
	
	
	   m.Substraction (20,5);
	   
	   
	   int i = m.multiply(3,3);
	   System.out.println(i);


	   String s = m.greeting("Ram");
	   System.out.println(s);
	
	   
	   char ch = m.getletter('a');
	   System.out.println(ch);
	}
}