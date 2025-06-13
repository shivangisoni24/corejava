package com.rays.oop.encapsulation;

import java.util.Date;

public class Student {

	    private String name;
	    private int age;
	    private Date dob;
	    private String fathername;
	    private String mothername;
	    private String address;
	    private int mobilenumber;
	    private String city;
	    
	    public String getName() {
	    	return this.name;
	    }
	    
	    public void setName(String name) {
	    	this.name = name;
	    }
 
	    public int getAge() {
	    	return this.age;
	    }
	     
	    public void setAge(int age) {
	    	this.age = age;
	    }
	    
	    public Date getDob() {
	    	return this.dob;
	    }
	    
	    public void setDob(Date dob) {
	    	this.dob = dob;
	    }
	    
	    public String getFathername() {
	    	return this.fathername;
	    }
	    
	    public void setFatherName(String fathername) {
	    	this.fathername = fathername;
	    }
	    
	    public String getMothername() {
	    	return this.mothername;
	    }
	    
	    public void setMothername(String mothername) {
	    	this.mothername = mothername;
	    } 
	    
	    public String getAddress() {
	    	return this.address;
	    }
	    
	    public void setAddress(String address) {
	    	this.address = address;
	    }
	    
	    public int getMobilenumber() {
	    	return this.mobilenumber;
	    }
	    
	    public void setMobilenumber(int mobilenumber) {
	    	this.mobilenumber = mobilenumber;
	    }
	    
	    public String getCity() {
	    	return this.city;
	    }

	    public void setCity(String city) {
	    	this.city = city;
	    }
}
