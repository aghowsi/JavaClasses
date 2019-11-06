package com.class10;

public class ArraySwitchAndForLoop {
	public static void main(String[] args) {
		//Create an array of countries. While retrieving all values from an array print capital for each country. 
		
		String[] countries= {"Afghanistan","Columbia","USA","Russia","Turkey"};
		String capitol=null;
		for(int i=0; i<countries.length; i++) {
			
			switch(countries[i]) {
			case "Afghanistan":
			   System.out.println("Kabul");
			   break;
			case"Columbia":
				System.out.println("Bogota");
				break;
			case"USA":
				System.out.println("Washington DC");
				break;
			case"Russia":
				System.out.println("Moscow");
				break;
			case"Turkey":
				System.out.println("Asnkara");
				break;
			}
		}
	}

}
