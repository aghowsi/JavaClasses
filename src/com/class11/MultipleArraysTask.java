package com.class11;

public class MultipleArraysTask {
	public static void main(String[] args) {
		
		//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
		
		int[][]numbers= {
				{1,2,3,4},
				{5,6,7,8},
				{10,9,12,13} };
				
	    for(int a[]:numbers) {
	    	for(int b:a) {
	    		System.out.print(b+" ");
	    	}
	    	System.out.println();
	    }
				
				
				
	
	}

}
