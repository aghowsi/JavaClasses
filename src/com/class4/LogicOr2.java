package com.class4;

public class LogicOr2 {
	public static void main(String[] args) {
		
		//7 days a week
	    //if days Tuesday or Thursday->SDLC Class
	    //if day  Saturday or Sunday-->Java Class
		//if day Monday or Friday-->No Class
		//if day =Wednesday-->Review Class
		//
		
		String weekDay="Sunday";
		
		if (weekDay.equals("Tuesday")|| weekDay.equals("Thursday")) {
			System.out.println("SDLC Class");
		} else if(weekDay.equals("Saturday")|| weekDay.equals("Sunday")){
			System.out.println("Java Class");
		}else if(weekDay.contentEquals("Monday") || weekDay.equals("Friday")){
			System.out.println("No Class");
		}else if(weekDay.equals("Wednesday")){
			System.out.println("Review");
		}else {
			System.out.println("Not a valid day");
		}
	}

}
