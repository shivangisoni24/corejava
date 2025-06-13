package com.rays.in;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FindAge {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		String dob = "2002-10-14";
		Date YourDob = sdf.parse(dob);
		System.out.println("Current date : " + now);
		System.out.println("my dob :" + YourDob);
		int age = now.getYear()-YourDob.getYear();
		System.out.println("my age : " + age);
		
		
	}
}
