package com.rays.oop.pilymorphism;

public class TestShapeByMethodArgument {

public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		s[0] = new Circle(2);
		s[1] = new Rectangle(4,5);
		s[2] = new Triangle(8,2);
		
		double total = totalArea(s);
		System.out.println("Total : " + total);
}

     public static double totalArea(Shape[] s) {
	    double total = 0;
	    
	    for(int i = 0; i < s.length; i++) {
	    	System.out.println("Areas : " + s[i].area());
	    	total = total + s[i].area();
	    }
    	 
    	 return total;
     }	 
}
