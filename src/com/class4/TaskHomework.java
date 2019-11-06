package com.class4;

import java.util.Scanner;

public class TaskHomework {
	public static void main(String[] args) {
		
		/*ask user to enter boolean value for sale
		 * if no sale-->I am not shopping
		 * if sale-->check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price<20$--> apply 20% discount
		 * if price between 20$-100$-->apply 20% discount
		 * if between 100-500$--> apply 30% discount
		 * anything else above 500$--> apply 50% discount
		 * 
		 * After discount - the price of the item reduced from - to -.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please boolean value for sale");
		
		boolean sale;
		
		sale=scan.nextBoolean();
		
		if(sale==false) {
			System.out.println("I am not shopping");
		}else{
			System.out.println("What is the actual price");
		}
		
		double price;
	    price=scan.nextDouble();
		double discount;
		double priceAfterDiscount;
		
		if (price<20) {
			discount=price*0.2;
			priceAfterDiscount=price-discount;
		}else if(price==20 || price<=100) {
			discount=price*0.2;
			priceAfterDiscount=price-discount;
		}else if(price==100 || price<=500) {
			discount=price*0.3;
			priceAfterDiscount=price-discount;
		}else  {
			discount=price*0.5;
			priceAfterDiscount=price-discount;
		}
	   System.out.println("After discount "+discount+"the price reduced from "+price+"to "+priceAfterDiscount);	
	}
}
