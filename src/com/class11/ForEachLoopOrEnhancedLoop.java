package com.class11;

public class ForEachLoopOrEnhancedLoop {

	public static void main(String[] args) {
	
		
		int [] numbersList= {2,3,4,5};
		
		for(int element:numbersList) {
			System.out.println(element);

	}
		/*Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
        *
		 */
		
		String [] cars= {"BMW","Jeep","RangeRover","RolceRoyce","Toyota","Lamborgini"};
		     for(int i=0; i<cars.length; i++) {
		    	 System.out.println(cars[i]);
		     }
		     
		     for(String j:cars) {
		    	 System.out.println(j);
		    	 
		     }
		     System.out.println("--------------------------------");
		     System.out.println();
		     //   *Create an array on integers and calculate the sum of all elements in an array.
		int [] integers= {2,4,6,8};
		   for(int a=0; a<integers.length; a++) {
			   System.out.println(integers[a]);
		   }
		   System.out.println("-----------------------");
		   System.out.println();
		   //Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		   String[] countries= {"India","Afghanistan","Canada"};
		    for(String getCountry:countries) {
		    	if(getCountry.equals("India")) {
		    		System.out.println("The capitol is NewDelhi");
		    	}
		    	
		    	}
		    }
	}

