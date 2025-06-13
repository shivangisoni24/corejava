package com.rays.in;

public class FloatArray {

	public static void main(String[] args) {
		
		float [] fArray = new float [5];
		
		fArray[0]=1.2f;
		fArray[1]=2.3f;
		fArray[2]=3.4f;
		fArray[3]=4.5f;
		fArray[4]=5.6f;		
		for (int i = 0; i < fArray.length; i++) {	
		System.out.println( " element at index " + i + " : " + fArray[i]);
		}
		
	}
	
}