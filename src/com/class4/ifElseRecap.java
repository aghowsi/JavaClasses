package com.class4;

public class ifElseRecap {

	public static void main(String[] args) {
		
		/*class schedule 
		 * if tuesday-->sdlc
		 * if wednesday-->java review
		 * if thursday-->sdlc
		 * if saturday-->java coding
		 * if sunday-->my favorite java coding 
		
		 */
		//if: is used if there is only one condition
		// else if : is used if there are multiple conditions
		int day=4;
		if (day==2) {
			System.out.println("SDLC class");
		} else if (day==3) {
			System.out.println("Java review");
		} else if(day==4) {
			System.out.println("SDLC class");
		} else if(day==5) {
			System.out.println("Java coding");
		} else if (day==6) {
			System.out.println("My favourite Java coding ");
		} else {
			System.out.println("There is no class today");
		}
		
	}
}
