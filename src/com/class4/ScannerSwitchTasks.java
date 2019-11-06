package com.class4;

import java.util.Scanner;

public class ScannerSwitchTasks {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter name of the instructor");
		
		String name = null, instructor = null;
		name=scan.nextLine();
		
		switch (name){
		case "Shiva":
			instructor="Will take care of Java assignment";
			break;
		case "Sandish":
			instructor="Will take care of SDLC class";
			break;
		case "Weqas":
			instructor="Will take care of Selinium";
			break;
		case "Asel":
			instructor="Will take care of every assignment";
			break;
			default:
				instructor="Invalid instructor selected";
				
	}
              System.out.println(instructor);
	}	
	 
}

