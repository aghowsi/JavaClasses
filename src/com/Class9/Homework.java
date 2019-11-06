package com.Class9;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		/*
		 * Write a program that read a range of integers(start and end point), provided
		 * by a user And then from that range prints the sum of the even and odd
		 * integers.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start point");
		int a = scan.nextInt();

		System.out.println("Please enter end point");
		int b = scan.nextInt();
      
		
		
		int sumEven = 0;	
		int sumOdd =0;    
		for (int c=a; c<b; c++) {
            if(c%2==0) {
            	sumEven= sumEven + c;
            }else {
            	sumOdd= sumOdd + c;
            	
            }
		}System.out.println("Sum of even numbers is "+sumEven);
        System.out.println("Sum of odd numbers is "+sumOdd);

	}
}
