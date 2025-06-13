package com.rays.in;

public class SecondLargestNoArray {

    public static void main(String[] args) {
    
    	int [] num = { 20, 45, 99, 67, 18, 90, 102 };
    	int largest = 0;
    	int secondlargest = 0;
   
    	for (int i = 0; i < num.length;  i++) {
    		if (num[i] > largest) {
    		secondlargest = largest;
    		largest = num[i];
    	}
    	 if(num[i] > secondlargest && num[i] < largest) {
    		 secondlargest = num[i];
    	 }
    	
    	}
    	System.out.println(" Second Largest no is " + secondlargest);
//    	System.out.println(" Largest no. is " + largest);
    }
}
