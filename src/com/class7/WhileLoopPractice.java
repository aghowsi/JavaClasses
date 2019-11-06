package com.class7;

public class WhileLoopPractice {
	public static void main(String[] args) {
		//how to print numbers from 1 to 20
		
		int i=1;
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------------------------------------------");
		//I want to print numbers from 10 to 30 in one line
		
		int a=10;
		while(a<=30) {
			System.out.print(a+" ");//(print instead of println) will print it in one like and (" ") will give space between numbers in print out.
			a++;
		}
		
	    
		//how to print values 10 to 1
		
		int b=10;
		while(b<=1) {
			System.out.println(b);
			b--;
		}
	}
}

