package com.class4;

public class NestedIfPractice {

	 public static void main(String[] args) { 
		 
		 boolean isFriday=true;
		 int day=131;
		 //if clause inside if clause
		 //if today is Friday only day i want to watch a scary movie
		 
		 if(isFriday) {
			 System.out.println("Today is Friday");
		 } 
		 if(day==13) {
			 System.out.println("I will watch a scary movie");
		 } else {
			 System.out.println("Today is Not Friday");
		 }
	
} 
	
}
