package com.rays.in;

public class StudentMarks {

	public static void main(String[] args) {
		
		int marks = 81;
	
		if (marks >= 90) {
			System.out.println(" Grade A");
		} else if(marks >= 80) {
			System.out.println(" Grade B");
		} else if(marks >= 60) {
			System.out.println(" Grade C");
		} else if(marks >= 40) {
			System.out.println(" Grade D");
		} else {
			System.out.println(" FAIL ");
		}
	}
}
