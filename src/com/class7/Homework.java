package com.class7;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		
		/*You need to ask user to pay for coffee
		 * You need to keep asking user to pay for it until entered price is equal= 5;
		 * After user paid then say "Enjoy your coffee"
		 */
		Scanner scan=new Scanner(System.in);
		
		int price=1;
		while(price<5) {
			System.out.println("Enjoy your coffee");
			price++;
			
		}
		
		
		    for (int i = 1; i <= 5; i++) {
		       for (int a = 1; a <= 10; a++) {
		      System.out.print((i * a) + " "); }

		    System.out.println(); }
		    
		  }
	}


