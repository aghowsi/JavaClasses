package com.class2;

public class ArithmeticOperations {
	
	/*
	 * declare 2 variables and initialize them 
	 * perform addition, subtration, multiplication and division
	 */
   public static void main (String[] args) {
	   
	   int num1, num2;
	   num1=20;
	   num2=10;
	   
	   System.out.println(num1+num2);   //30
	   System.out.println(num1-num2);   //10
	   System.out.println(num1*num2);   //200
	   System.out.println(num1/num2);   //2
	   
	   //how can we print value of num1 and num2 together
	   
	   System.out.println(num1+","+num2);
	   
	   System.out.println("*****************************************");
	   //2nd way of performing arithmetic operations
	   int sum=num1+num2;
	   int sub=num1-num2;
	   int mult=num1*num2;
	   int div=num1/num2;
	   //the addition/subtraction/multiplication/division of two number is-
	   System.out.println(sum);
	   System.out.println(sub);
	   System.out.println(mult);
	   System.out.println(div);
	   
	   
	   
   }
    
}
