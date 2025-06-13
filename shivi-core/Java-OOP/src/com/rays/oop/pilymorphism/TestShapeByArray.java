package com.rays.oop.pilymorphism;

public class TestShapeByArray {

	public static void main(String[] args) {
		
	     Shape[] s = new Shape[3];
	   
	     s[0] = new Circle();
	     s[1] = new Rectangle();
	     s[2] = new Triangle();
	     
	     
	     System.out.println("----circle----");
	     
	     Circle c = (Circle) s[0];
	     c.setRadius(4);
	     System.out.println("Radius : " + c.getRadius());
	     System.out.println("Area of Circle : " + c.area());
	     
	     
	     System.out.println("----rectangle----");
	     
	     Rectangle r = (Rectangle) s[1];
	     r.setLength(7);
	     r.setWidth(2);
	     System.out.println("Length : " + r.getLength());
	     System.out.println("Width : " + r.getWidth());
	     System.out.println("Area of Rectangle : " + r.area());
	
	     
	     System.out.println("----triangle----");
	     
	     Triangle t = (Triangle) s[2];
	     t.setBase(4);
	     t.setHeight(5);
	     System.out.println("Base : " + t.getBase());
	     System.out.println("Height : " + t.getHeight());
	     System.out.println("Area of Triangle : " + t.area());
	     
		
	     System.out.println("===========================================");
	     
	     Shape[] sh = new Shape[3];
		   
	     sh[0] = new Circle();
	     sh[1] = new Rectangle();
	     sh[2] = new Triangle();
	     
	     
	     System.out.println("----circle----");
	     
	     Circle cc = (Circle) sh[0];
	     cc.setRadius(4);
	    
	     
	     System.out.println("----rectangle----");
	     
	     Rectangle rr = (Rectangle) sh[1];
	     rr.setLength(7);
	     rr.setWidth(2);
	    
	
	     
	     System.out.println("----triangle----");
	     
	     Triangle tt = (Triangle) sh[2];
	     tt.setBase(4);
	     tt.setHeight(5);


	     for(int i=0; i<sh.length; i++) {
	    	 System.out.println("Area : " + sh[i].area());
	     }
	}
	
}
