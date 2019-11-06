package com.class8;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		/*Print numbers from 1 to 50 except those that are divisible by 3
		 */
		
		for(int i=1; i<=50; i++) {
			if(i%3==0)
			continue;
			System.out.println(i);
		}
		//Creat a programe that will be asking user to apply for a credit card 10 times. as soon as you get a "yes"from  a user program should stop asking.
		
		for(int i=0; i<=10; i++) {
			String card;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter credit card");
			 card=scan.nextLine();
			if(card.contentEquals("Yes")) {
				break;
			}
					
		}
	}
	
	}


