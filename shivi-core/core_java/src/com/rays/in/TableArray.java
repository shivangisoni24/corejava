package com.rays.in;

public class TableArray {

	public static void main(String[] args) {
		
		int [] table ;
		table = new int [10];
		  
		table[0] = 2;
		table[1] = 4;
		table[2] = 6;
		table[3] = 8;
		table[4] = 10;
		table[5] = 12;
		table[6] = 14;
		table[7] = 16;
		table[8] = 18;
		table[9] = 20;
		
		int element = table[6];
		System.out.println("7th Element is" + element);
		
		int size = table.length;
		System.out.println("size is " + size);
	}
}
