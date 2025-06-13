package com.rays.oop.constructor;

public class Employee extends Person {
	
	
     public Employee(int id, String name, String address) {
    	 super(id, name, address);
     }
     
     public static void main(String[] args) {
    	 Employee e = new Employee(23, "Ram", "Indore");
     }
 }
