package com.rays.oop.constructor;

public class Circle extends Shape {
		
		private int radius;
		
		public Circle(int radius) {
			this.radius = radius;
		}
		
		public int getRadius() {
			return radius;
		}
		

		@Override
		public double area() {
			double area = 3.14 *radius*radius; 
			return area;
		}
	
	}
