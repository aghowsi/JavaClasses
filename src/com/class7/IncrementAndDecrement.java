package com.class7;

public class IncrementAndDecrement {
	public static void main(String[] args) {
		
		int a=10;
		a=a+1; // Assignment 
		a+=1; //shorthand assignment
		
		System.out.println(a);// The answer should be print as 12 in the console, bcz the original number was 10 and the increment operator added two to it
		//so the result should be 12.
		a++;//Increment operator
		System.out.println(a);// 13, when you do another print out, it'll print the the value printed on first print out +1 so it'll be 13/
		
		int b=10;
		b-=1;//9
		b--;//decrement operator
		System.out.println(b);
		//Note: Increment and Decrement operators can be used only with variables
		
		int c=23;
		c++;
		//c++; compiler error invalid argument, won't print out anything. 
	}

}
