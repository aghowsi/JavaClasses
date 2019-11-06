package com.class3;

public class PerimitiveCasting {
	
	public static void main(String[] args) {
		 
		
		double d=12;
		System.out.println(d);
		//Casting is changing one type of date to another. For example from byte to int, from int to double etc. 
		//int i=12.0; compile time error
		//widening or automatic or implicit casting
		//we can assign small values of data to bigger easily, but if we were to assign larger values of data to small, you'll have to manually do it
		//java is not going to do it for you. 
		
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		
		//narrowing or explicitor manual casting (you do it yourself)
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=789;
		byte b1=(byte)num3;
		System.out.println(b1);
	
		
		
		
		
	}
		
}
