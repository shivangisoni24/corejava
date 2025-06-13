package com.rays.oop.dataabstraction;

public class TestBusinessMan {

	public static void main(String[] args) {
		
		Richman r = new BusinessMan();
	    r.earnMoney();
        r.donation();
        r.party();
        
        SocialWorker s = new BusinessMan();
        s.helpToOther();

//	    BusinessMan b = new BusinessMan();
	    
	}
	
}
