package com.class4;

public class Recap {

	public static void main(String[] args) {
		
		int num=23;
		num=90;
		num-=200;// -110=90-200
		num-=-110;
		num+=220;
		 
		if(num>0) {
			System.out.println(num+" is a positive number");
			
		} else if (num==0) { 
			System.out.println("value of num "+num);
			
		} else {
			System.out.println(num+"is a negative number");
		}
	
		//even or odd numbers (how to find out if the number is even or odd)
		int i=132;
		
		if (i%2==0) {
			System.out.println(i+" is even number");
		} else {
			System.out.println(i+" is odd number");
		}
		
		//2nd way of finding if the number is even or odd
		if(i%2!=0) {
			System.out.println(i+" is not odd number");
		} else {System.out.println(i+" is an even number");
			
		}
		
		
		
		
		
		
	}
}
