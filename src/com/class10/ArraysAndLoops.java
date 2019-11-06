package com.class10;

public class ArraysAndLoops {
	public static void main(String[] args) {
		
		//Create an array of countries. While retrieving all values from an array print capital for each country. 
		
		String[] countries= {"Japan","USA","Turkey","Russia"};
		
		for(int i=0; i<countries.length; i++) {
			if(countries[i].equals("Japan")) {
				System.out.println("Tokyo");
			}else if(countries[i].equals("USA")) {
					System.out.println("Washington DC");
				}else if(countries[i].equals("Turkey")) {
						System.out.println("Ankara");
					}else if(countries[i].contentEquals("Russia")) {
							System.out.println("Moscow");
						}else {
							System.out.println("Maybe you have hard time looking for the country");
						}
			
						}
					}
				}
			
		
	
		
	


