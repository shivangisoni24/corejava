package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Person p = new Person();
		
		p.setName("shiv");
		p.setDob(sdf.parse("2012/10/14"));
		p.setAddress("Udaipur");
		int age = p.getAge(p.getDob());
		
		System.out.println("name : " + p.getName());
		System.out.println("dob : " + p.getDob());
		System.out.println("address : " + p.getAddress());
		System.out.println("age : " + age);
		if (age == Person.AVR_AGE || age> Person.AVR_AGE) {
			System.out.println("you are selected for voting");
		}
		
		System.out.println("-------------");
		
	    
        Person p1 = new Person();
		
		p1.setName("Ram");
		p1.setDob(sdf.parse("2000/07/27"));
		p1.setAddress("jaipur");
		int age1 = p1.getAge(p1.getDob());
	
		
		System.out.println("name : " + p1.getName());
		System.out.println("dob : " + p1.getDob());
		System.out.println("address : " + p1.getAddress());
		System.out.println("age : " + age1);
		if (age1 == Person.AVR_AGE || age1 > Person.AVR_AGE);
		System.out.println("you are selected for voting");
		
		      
	}
		
}
