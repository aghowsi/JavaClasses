package com.class4;

import java.util.Scanner;

public class ScannerSwitchString {
	public static void main(String[] args) {
		
		/*ask user where they are from
		 * based on the country we will specify favorite food
		 */
		String country, foodName;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country) {
		
		case "Turkey":
			foodName="Kebab";
			break;
		case"Ethiopia":
			foodName="Tibs";
		case"Morrocco":
			foodName="Tajin";
			break;	
		case"Kazakhstan":
			foodName="Kumis";
			break;
		case"Pakistan":
		    foodName="Biryani";
		    break;
		case"Russia":
			foodName="Caviar";
			break;
		case"Cuba":
			foodName="Sofrito";
			break;
		case"Afghanistan":
			foodName="Palaw";
				break;
				default:
				foodName="None";
		}
			System.out.println("Your favorite food is "+foodName);
		
		}	
	}

