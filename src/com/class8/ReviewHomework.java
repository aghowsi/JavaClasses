package com.class8;

public class ReviewHomework {
	public static void main(String[] args) {
		
		// Task 0ne Print numbers from 10 to 1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
			
		}
		 
		// Task Two Write a program from 40 to 10 and only print the even numbers
		
		for(int i=40; i>=10;i--) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	   
	    // Task Three Write a program from 50 to 25 and only print the odd numbers
		
		for(int i=50; i>=25; i--) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
		
		// Task Four Write a program from 0 to 100 and break the loop once the value  reaches 45
		
		for(int i=0; i<=100; i++) {
			if(i==45) {
			
				break;
			}
			System.out.println(i);
		}
		
		// Task Five Write a program  1 to 10 and if the value is 10 
		
		for(int i=0; i<=10;i++ ) {
			if(i==10 || i==0) {
			
			continue;
			}
			System.out.println(i);
		}
	}
}
