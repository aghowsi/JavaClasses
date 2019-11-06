package com.class4;

public class LogicOr {
	public static void main(String[] args) {
		
		//7 days a week
		//if days 2 or 4-->SDLC Class
		//if day 6 or 7-->Java Class
		//if day 1 or 5-->No Class
		//if day =3-->Review Class
		

		int day=6;
		
		if(day==2 || day==4) {
			System.out.println("SDLC Class");
		}else if(day==6 || day==7) {
			System.out.println("Java Class");
		}else if(day==1 || day==5) {
			System.out.println("No Class");
		}else if(day==3){
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
		}	
	}
}
