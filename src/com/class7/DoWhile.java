package com.class7;

public class DoWhile {
	public static void main(String[] args) {
		//in While loop first we test the action then we perform it
		int num=1;
		
		while(num<=7) {
			System.out.println("Hello");
			num++;
		}
		// in Do loop we do/perform the action and then we test/check it, even if the condition is false the Do will execute the condition at least once.
		int num1=1;
		
		do {
			System.out.println("Bye");
			num1++;
		}while(num1<=7);
		System.out.println("--------------------------------------------------");
		//Print even numbers from 20 to 50 using do while
		
		int even=20;
		do {
			System.out.println(even);
			even+=2;
		
		}while(even<=50);
		System.out.println("*********second way***********************");
		
		
		//Print even numbers from 20 to 50 using do while 2nd way
		
			int even1=20;
				do {
					if(even1%2==2) {
						System.out.println(even1);
						}
					even++;
				}while(even<=50);
				}
	}
