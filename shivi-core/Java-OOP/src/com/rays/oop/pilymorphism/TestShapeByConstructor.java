package com.rays.oop.pilymorphism;

public class TestShapeByConstructor {

	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		s[0] = new Circle(2);
		s[1] = new Rectangle(4,5);
		s[2] = new Triangle(8,2);
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("area : " + s[i].area());
		}
	}
	
}
