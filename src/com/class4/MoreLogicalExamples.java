package com.class4;

import java.util.Scanner;

//to import shortcut is ctr+shift+0-->windows
// for mac cmd+shift+0
public class MoreLogicalExamples {
	public static void main(String[] args) {
		
		
		/*ask user to enter daily sales
		 * base on the sales range we want to give commission to the person
		 * if sales is <100-->mission is 10%
		 * if sales is between 100-200-->commission of 20%
		 * etc
		 */
	
	
	Scanner scan;
	double salesAmount;
	double commission;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your sales amount");
	salesAmount=scan.nextDouble();
    

	if(salesAmount>=1 && salesAmount<100) {
		//lets give user 10% commission of a sale
		commission=salesAmount*0.1;
        }else if(salesAmount>=100 && salesAmount<200 ){
        	commission=salesAmount*0.2;
        	}else if(salesAmount>=200 && salesAmount<500) {
	            commission=salesAmount*0.3;
               }else if(salesAmount>500) {
            	   commission=salesAmount*0.5; 
               }else {
            	   commission=0;
               }
	      System.out.println("Based on the sales your comission is "+commission);
}
}
