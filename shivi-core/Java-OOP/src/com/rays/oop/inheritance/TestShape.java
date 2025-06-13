package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {
		
		System.out.println("--------circle--------");
		
		Circle c = new Circle() ;
		
	    c.setColor("red");
	    c.setBorderWidth(5);
	    c.setRadius(2);
	    
	    System.out.println("Color : " + c.getColor());
	    System.out.println("BorserWidth : " + c.getBorderWidth());
		System.out.println("Radius : " + c.getRadius());
		System.out.println("area of circle : " + c.area());
		
		
		
		
		
		
		System.out.println("--------RECTANGLE--------");
		
		Rectangle r = new Rectangle();
		
		r.setColor("blue");
		r.setBorderWidth(3);
		r.setLength(5);
		r.setWidth(2);
		
		
		System.out.println("Color : " + r.getColor());
	    System.out.println("BorderWidth : " + r.getBorderWidth());
	    System.out.println("Length : " + r.getLength());
	    System.out.println("Width : " + r.getwidth());
	    System.out.println("area of rectangle : " + r.area());
	    
	    
	    
	    
	    
	    
	   System.out.println("--------Triangle--------");

	   Triangle t = new Triangle();
	   
	   t.setColor("Green");
	   t.setBorderWidth(3);
	   t.setBase(5);
	   t.setHeight(2);
	   
	   
	  System.out.println("color : " + t.getColor());
	  System.out.println("border : " + t.getBorderWidth());
	  System.out.println("base : " + t.getBase());
	  System.out.println("height : " + t.getHeight());
	  System.out.println("area of tringle : " + t.area());
	   
		
	}
}
