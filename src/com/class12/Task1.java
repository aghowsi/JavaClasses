package com.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		int [] array2= {2,5,7,9};
	        for(int a:array2) {
	        	//System.out.println(a);

	}
	        
	        int []arr=new int[3];
	        Scanner scan=new Scanner(System.in);
	        
	        for(int i=0; i<arr.length; i++) {
	        	arr[i]=scan.nextInt();
	        }
	        for(int i=0; i<arr.length; i++) {
	        	System.out.print(arr[i]+" ");
	        }
	}
}
