package com.rays.in;

public class VijayAloknathChauhanString {
	
	public static void main(String[] args) {
		
		String n = "Vijay Aloknath Chauhan";
		
		System.out.println("String Length : " +  n.length());
		
		System.out.println("7th character : " + n.charAt(6));
		
		System.out.println("Index of Alok : " + n.indexOf("Alok"));
		
		System.out.println("1 # pos of i : " + n.indexOf("i"));
		
		System.out.println("Last Position of i : " + n.lastIndexOf("i"));
		
		System.out.println("a is replace by b : " + n.replace("a","b"));
		
		System.out.println("Lower Name : " + n.toLowerCase());
		
		System.out.println("Upper Name : " + n.toUpperCase());
		
		System.out.println("Starts with Vijay : " + n.startsWith("Vijay"));
		
		System.out.println("Dad's name : " + n.substring(6));
		
		
	}

}
