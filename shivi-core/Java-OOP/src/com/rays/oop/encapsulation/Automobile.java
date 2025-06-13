package com.rays.oop.encapsulation;

public class Automobile {

	     private String color;	
         private int speed;
         private String make;
         public static final int NO_OF_GEARS = 6;
         
        public String getColor() {
        return this.color;
        }
         
        public void setColor(String color) {
        	this.color = color;
        }
        
        public int getSpeed() {
        	return this.speed;
        }
        
        public void setSpeed(int speed) {
        	this.speed = speed;
        }
        
        public String getMake() {
        	return this.make;
        }
        
        public void setMake(String make) {
        	this.make = make;
        }
        
        public String getGears(int gear) {
        	if (gear < 1 || gear > NO_OF_GEARS) {
        	return " Invalid Gears Selected " + NO_OF_GEARS;
        }
        	else if (gear == NO_OF_GEARS) {
        		return "Speed is High";
        } 
        	else {
        		return " Your  speed is : " + gear;
        		
        	}
        }
        
        public String getBrakeStatus(int brakePressure) {
        	if (brakePressure < 0) {
        		return "Invalid brake pressure";
        	} else if (brakePressure == 0) {
        		return "Brake at zero. Car is Slowing ";
        	} else if (brakePressure == 1) {
        		return "Brakes released. Car is runnig";
        	} else {
        		return "Brakes applied. Car is Stopping";
        	}
        }
}