package com.class4;

import javax.lang.model.element.Element;

public class LogicNot {
	public static void main(String[] args) {
		
		
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		// if traffic-->late. else-->on time
		if(!traffic) {// using ! we are reverting condition
		System.out.println("On time");
		}else {
			System.out.println("Late");
		}
		
		boolean isRain=false;
		if(!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Do not take an umbrella");
		}
		// let's compare 2 numbers using NOT (!) operator
		
		int num1=10;
		int num2=10;
		
		if (num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
		// the beneath example is just a different way of encoding using NOT (!), the result will be the same for both of the examples. 
		if(!(num1==num2)) {
			System.out.println("Numbers are not equal");
		}else {
			System.out.println("Numbers are equal");
		}
		// if name is not Marry or Anna then you are not my sister
		String name="Mary";
		String name2="July";
		//true OR false--> true add NOT-->false
		if(!(name.contentEquals("Mary") || name.equals("Anna"))){
		     System.out.println("You are not my sister");
		}else {
			System.out.println("You are my sister");
		}
	}
}
