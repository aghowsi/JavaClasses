package com.class4;

public class Task3 {
	public static void main(String[] args) {
		
		/*Prompt the user to enter person heights in feet.
		 * person should be classified as one of the following
		 * short=under 5 feet
		 * medium=5 to 6 feet
		 * tall=6 feet and over
		 */
		
		int height=6;
		
	if(height==1 || height<5) {
		System.out.println("short");
		}else if(height==5 || height<=6) {
			System.out.println("medium");
		}else if(height==6 || height>=6) {
			System.out.println("tall");
		}else {
			System.out.println("Invalid height");
		}
	
	}

}
