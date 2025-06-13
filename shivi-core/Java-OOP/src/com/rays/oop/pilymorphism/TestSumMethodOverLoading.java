package com.rays.oop.pilymorphism;

public class TestSumMethodOverLoading {
	
	public static void main(String[] args) {
	 
		Sum s = new Sum();
		
		s.Sum(2, 4);
		s.Sum(2, 3, 4);
		s.Sum(2.0, 2.0);
	}

}
