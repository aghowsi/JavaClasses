package com.class7;

public class WhileLoop {
	public static void main(String[] args) {
		
		int time=8;
		if(time<12) {// condition is true, 
			System.out.println("Good morning");// code executes
		}
		System.out.println("-----------------------------------------------------");
		while(time<12) { //condition is true
			System.out.println("Good morning"); // code executes
			time++;
		}
		System.out.println("-------------------------------------------------------");
		//I want to print "Good afternoon" 5 times
		
		int i=0;
		while(i<5) {
			System.out.println("Good Afternoon");
			i++;
		}
	}

}
