package com.rays.oop.dataabstraction;

public class BusinessMan extends Person implements Richman , SocialWorker {

	@Override
	public void earnMoney() {
	  System.out.println("Earn Money");	
	}

	@Override
	public void donation() {
		System.out.println("Donation Money");
		}

	@Override
	public void party() {
		System.out.println("Party");
		}
	
	@Override
	public void helpToOther() {
		System.out.println("Help To Other");}
	
}
