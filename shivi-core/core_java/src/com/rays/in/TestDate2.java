package com.rays.in;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate2 {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println("date : " + d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		String date = sdf.format(d);
		System.out.println(" formated date : " + date);
		
	}
	
}
 