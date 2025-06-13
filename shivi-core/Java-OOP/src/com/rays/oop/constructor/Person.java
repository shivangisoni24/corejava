package com.rays.oop.constructor;

public class Person {
	
	public int id;
	public String name;
	public String address;
	
	public Person() {
		System.out.println("This is default Constructor");
	}
	
	public Person(int id) {
		this();
		this.id = id;
		System.out.println("id : " + this.id);
	}
   
	public Person(int id, String name) {
		this(id);
		this.name = name;
		System.out.println("name : " + this.name);
	}
	
	public Person(int id, String name, String address) {
		this(id, name);
		this.address = address;
		System.out.println("address : " + this.address);
	}
}
