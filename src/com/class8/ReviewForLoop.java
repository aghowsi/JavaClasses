package com.class8;

public class ReviewForLoop{
	public static void main(String[] args) {
		
	//For loop 
		//Say good morning 5 times
		//Initialize;  Test condition;   Increment;
	for (int i=0;    i<=4; i++) {
		System.out.println("Good morning");
		}
		//print numbers from 1-10;
		for (int a=1; a<=10; a++) {
		System.out.println(a);
		}
		//print numbers from 10-1
		for (int b=10; b>=1; b--) {
		System.out.println(b);
		}
		for (int c=0; c<=50; c+=5) {
		System.out.println(c);//5, 10, 15, 20

		}
		
		//Break and Continue Review!!!
		
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
			break;
			}
			System.out.println(i);
			}
			System.out.println("**********************");
			// continue - it will skip CURRENT iteration
			for (int i = 1; i <= 5; i++) {
			if (i == 3 || i == 4) {
			continue;
			}
			System.out.println(i);
			}
			System.out.println("*******************");
			// I want to print nums from 1 to 20 except 5,6,7
			for (int a = 1; a <= 20; a++) {//5
			if (a >=5 && a<=17) {
			continue;
			}
			System.out.println(a);
		
			}	
}
}
