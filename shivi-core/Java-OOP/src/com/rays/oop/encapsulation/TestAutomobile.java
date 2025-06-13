package com.rays.oop.encapsulation;

public class TestAutomobile {

	public static void main(String[] args) {
		
		Automobile a = new Automobile();
		
		a.setColor("White");
		a.setSpeed(20);
		a.setMake("TVS");
//		a.getGears(0);
		
		System.out.println("Automoblile Color : " + a.getColor());
		System.out.println("Automobile speed : " + a.getSpeed());
		System.out.println("Automobile Make : " + a.getMake());
		System.out.println("no of gears : " + a.getGears(0));
		System.out.println("brakes : " + a.getBrakeStatus(0));
	}
	
}