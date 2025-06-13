package com.rays.practice.in;

public class VotingPrc {

	public static void main(String[] args) {
		
		int myAge = 25;
		int votingAge = 18;
		
		System.out.println(myAge >= votingAge);
		
		if(myAge>=votingAge) {
			System.out.println("you can vote..." + myAge);
		} else {
			System.out.println("yo can not vote..." + myAge);
		}
	}
}
