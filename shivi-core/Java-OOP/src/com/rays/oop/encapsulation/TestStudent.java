package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestStudent {
  
      public static void main(String[] args) throws ParseException {
	
    	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	  Student s = new Student();
  
    	  s.setName("Aman Sharma");
    	  s.setAge(23);
    	  s.setDob(sdf.parse("17/08/2002"));
    	  s.setFatherName("Raman Sharma");
    	  s.setMothername("Anjali Sharma");
    	  s.setAddress("Vijay Nagar");
    	  s.setMobilenumber(1234567891);
    	  s.setCity("Indore");
    	  
    	  
    	 System.out.println("Student Name : " + s.getName());
    	 System.out.println("Student Age : " + s.getAge());
//    	 System.out.println("Student Dob : " + s.getDob());
    	 System.out.println("Student Dob : " + sdf.format(s.getDob()));
    	 System.out.println("Student Father Name : " + s.getFathername());
    	 System.out.println("Student Mother Name : " + s.getMothername());
    	 System.out.println("Student Address : " + s.getAddress());
    	 System.out.println("Student Mobile Number : " + s.getMobilenumber());
    	 System.out.println("Student City : " + s.getCity());
    	  
    	  
  }
}
