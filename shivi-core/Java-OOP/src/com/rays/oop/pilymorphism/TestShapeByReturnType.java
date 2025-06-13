package com.rays.oop.pilymorphism;

public class TestShapeByReturnType {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		s[0] = Shape.getShape(1); // new Circle(2);
		s[1] = Shape.getShape(3); // new Triangle(2,2);
		s[2] = Shape.getShape(2); // new Rectangle(5,5);
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("area : " + s[i].area());
		}
	}

}
