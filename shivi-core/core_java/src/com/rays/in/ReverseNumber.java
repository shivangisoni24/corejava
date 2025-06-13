package com.rays.in;

public class ReverseNumber {
       
	  public static void main(String[] args) {
		
		  int num = 1234;
		  int rnum = 0;
		  int temp = num;
		  int r = 0;
		  
		  while(temp > 0) {
			  
			  r = temp % 10;
			  rnum = (rnum*10)+ r;
			  temp = temp/10;
		  }
		  System.out.println(rnum);
	}
} 