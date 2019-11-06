package com.class12;

public class Recap {

	public static void main(String[] args) {
		int [] array1=new int[4];
        array1[0]=12;
        array1[1]=13;
        array1[2]=14;
        array1[3]=15;
        
        System.out.println(array1[0]);
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        
        for(int s=0; s<array1.length; s++) {
        	System.out.println(array1[s]);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        //Printing the values using ForEach Loop or Advance Loop / Enhanced Loop
        for(int i:array1) {
        	System.out.println(i);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        
        int [] array2= {2,5,7,9};
        for(int a:array2) {
        	System.out.println(a);
        }
        
        
        
	}

}

