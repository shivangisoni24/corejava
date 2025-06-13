package com.rays.oop.pilymorphism;

public class Shape {

	public double area() {
		return 0.0;
	}

//Using Method Return Type

   public static Shape getShape(int i) {

     if (i == 1) {
	   return new Circle(2);
   }
 
     if (i == 2) {
	   return new Rectangle(5,5);
   }

     if (i == 3) {
	   return new Triangle(2,2);
   }
     return new Shape();
   }
}