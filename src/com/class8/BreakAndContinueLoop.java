package com.class8;

public class BreakAndContinueLoop {
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			if(i==7) {
				break;// break simply breaks the loop and moves to the next condition and prints it.
			}
			System.out.println(i);
		}
		System.out.println("I am outside of loop");
	}

}
