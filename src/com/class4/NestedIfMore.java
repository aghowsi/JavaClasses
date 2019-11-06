package com.class4;

import java.util.Scanner;

public class NestedIfMore {

	public static void main(String[] args) {

		/*
		 * check age if age is less than 16-->you are too young to drive otherwise-->
		 * you are eligible to drive and we will check if you are older than 18--> you
		 * can get diver's license and if not you can get driver permit
		 */

		int age = 15;

		if (age < 16) {
			System.out.println("you are too young to drive");
		} else {
			System.out.println("you are eligible to drive");

			if (age >= 18) {

				System.out.println("you can drive alone");
			} else {
				System.out.println("you need your parents to drive");
			}
		}
		System.out.println("-------------");
		
          //* we need to 
		
		 Scanner scan=new Scanner(System.in);
		System.out.println("Do you need a loan?");
	   
	   boolean loan=scan.nextBoolean();
	    
		if(loan=true){
	      System.out.println("What is your credit score?");
	    }else if(loan!=true){
	      System.out.println("Eligibility Unknown");
	    }
		
	    int score;
	    score=scan.nextInt();
	  if(score<600){
	    System.out.println("Not eligible");
	  }else if(score>600 || score<700){
	    System.out.println("Maybe eligible");
	  }else if(score>701 || score<800){
	    System.out.println("Eligible");
	  }else if(score>800){
	    System.out.println("Definitely eligible");
	    	
	    }else {
	    }
	  System.out.println("The eligibility is "+loan);
	}
	}

