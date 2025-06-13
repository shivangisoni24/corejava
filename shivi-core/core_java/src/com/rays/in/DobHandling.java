package com.rays.in;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DobHandling {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//String dob = "1999-10-24";
		Date d = sdf.parse("1999-9-24");
		System.out.println(d);
		System.out.println(sdf.format(d));
	}
	
}
