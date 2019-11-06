package com.class8;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		
		int time = 8;
		if (time < 12) {// condition is true
		System.out.println("Good morning");// code executes 1
		}
		System.out.println("-------------------------");
		while (time < 12) {// while condition is true
		System.out.println("Good morning");
		time++;
		}
		//I want to print GA 5 times
		int i=-1;
		while(i<4) {
		System.out.println("Good afternoon");
		i++;
		}
		System.out.println("Outside of while loop");
		
		/*
		* Create a boolean variable workDay and assign tru
		e create
		int variable day and
		* assign it to 1 As long as it is workDay print
		and
		increase
		* day. Once day is 6 print
		*/

		boolean workDay = true;
		int day = 1;
		while (workDay) {
		if (day == 6 || day==7) {
		workDay = false;
		System.out.println("I do not need a day of anymore");
		}else {
		System.out.println("I need a day off");
		}
		day++;
		}
	    //	Task One	
		/* print only even numbers from 1 to 20 */
		
		int c=1;
		while(c<=20) {
			if(c%2==0)
			System.out.println(c);
			c++;
		}
		
		
		//Task Two
		 //how to print numbers from 5 to 25 inclusive all in 1 line with space in
		// between?
		
		int d=5;
		while(d<=25){
		System.out.println(d);
		d+=5;
		
		}

		
		System.out.println("***********************************************************");
		 
		 
	    //Task Three
		// Prompt the user to ask the name 3 times and print "Hello____" 
		Scanner scan=new Scanner(System.in);
	    String name;
	    System.out.println("Please enter your name");
	    name=scan.nextLine();
	    int f=1;{
	        System.out.println("Hello "+name);
	    }
	    while (f<=3) {
	    f++;
	     }
			int num = 10;
			while (num <= 7) {
			System.out.println("Hello");
			num++;
			}
			// rare
			int num1 = 10;
			do {
			System.out.println("Bye");
			num1++;
			} while (num1 <= 7);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
			// print even numbers from 20 to 50 using do while
			// 1 way
			int even = 20;
			do {
			System.out.println(even);
			even += 2;
			} while (even <= 50);
			System.out.println("-------------Second way---------");
			// 2 way
			int even1 = 20;
			do {
			if (even1 % 2 == 0) {
			System.out.println(even1);
			}
			even1++;
			} while (even1 <= 50);
			
			System.out.println("----------------------------------------------");
			
			  //   Task One
	        //Write a program using a do while loop to print out all odd number from 0 15 
			
		int k=0;
		
		do {
			if(i%2==0) {
				System.out.println(k);
			}while(k<=15);}
		

		    //   Task Two
		  //  *keep asking user to pay for candy until entered price is not equal to 3
		   //  *after user got a write amount print "Please enjoy your candy
		
	}}
		