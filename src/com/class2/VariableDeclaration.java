package com.class2;

public class VariableDeclaration {
	
	
              public static void main (String[] args) {
            	  
            	  //1. declaring variable num1 that will hold value of int and 
            	  // assigning value of 123 to it
            	  
            	  int num1=123;
            	  int num2=6767;
            	  int num3=786876;
            	  long num4=784746477l;
            	  char num5='A';
            	  
            	  //2. declare variable first and then assign value
            	  int n1;
            	  int n2;
            	  int n3;
            	  n1=56;
            	  n2=7676;
            	  n3=767;
            	  
            	  //3. declare all variable together and then assign value
            	  int number1, number2, number3;
            	  
            	  number1=12;
            	  number2=15;
            	  number3=676;
            	  //System.outprintln(number3);
            	  System.out.println(n1);
            	  
            	  number3=1000;
            	  System.out.println(number3);
            	  
            	  boolean var=true;
            	  System.out.println(var);
            	  
            	  char myVariable;
            	  myVariable='*';
            	  System.out.println(myVariable);
            	  
            	  number2=number1;  //12
            	  System.out.println(number2);
            	  
            	  // number2=false; -->compiler time error asking to change data type of 
            	  //variable number2 to boolean 
            	  
            	  boolean isRain=false;
            	  boolean isSnow;
            	  isSnow=isRain; // isSnow=false
            	  System.out.println(isSnow);
            	  
            	  isSnow=true;
            	  System.out.println(isSnow);
            	 	  
              }

}
