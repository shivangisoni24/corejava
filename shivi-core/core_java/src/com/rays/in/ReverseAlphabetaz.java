package com.rays.in;

public class ReverseAlphabetaz {

	 public static void main(String[] args) {
		
		 for ( char a = 'z'; a >= 'a'; a--) {
		 System.out.print(a);
		 if (a > 'a') {
			 System.out.print(" , ");
		 }
      }
   }
}
