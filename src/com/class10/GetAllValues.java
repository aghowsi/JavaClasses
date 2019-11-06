package com.class10;

public class GetAllValues {
	public static void main(String[] args) {
		
		// I want to print all values from an array
		//when value is Dog-->I love dogs
		
		String[] animals= {"Cat", "Cow","Snake","Dog","Elephant"};
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i].contentEquals("Dog")) {
				System.out.println("I love dogs");
			}else {
				System.out.println(animals[i]);
			}
		}

	}

}
