package com.rays.in;

public class StringArray {

	public static void main(String[] args) {
		
		String [] sArray = new String[5];
		
		sArray[0] = "Indore";
		sArray[1] = "Pune";
		sArray[2] = "Mumbai";
		sArray[3] = "Udaipur";
		sArray[4] = "Jaipur";
		
		for (int i = 0; i < sArray.length; i++) {
			System.out.println("City index [" + i + "]= " + sArray[i]);
		}
	}
	
}