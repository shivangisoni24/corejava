package com.rays.in;

public class ChennaiExpressString {
	
	public static void main(String[] args) {
		
		String name = "Chennai Express";
		
		System.out.println(" String Length is - " + name.length());
		
		System.out.println(" 5th character is - " + name.charAt(4));
		
		System.out.println(" Ex index is - " + name.indexOf("E"));
		
		System.out.println(" First i position is - " + name.indexOf("i"));
		
		System.out.println(" e is replaced by a - " + name.replace("e", "a"));
		
		System.out.println(" Chhota chenni - " + name.toLowerCase());
		
		System.out.println(" Bada chenni -  " + name.toUpperCase());
		
		System.out.println(" Starts with Chenni - " + name.startsWith("Chenni"));
		
		System.out.println(" Ends with press - " + name.endsWith("press"));
		
		System.out.println(" Substring - " + name.substring(3));
				
	}

}
