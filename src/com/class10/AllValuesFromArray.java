package com.class10;

public class AllValuesFromArray {
	public static void main(String[] args) {

		                // 0    1    2    3    4    5
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		int a = 2;
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		a += 2;// 2+2
		System.out.println(grades[a]);
		a--;// 3
		System.out.println(grades[a]);
		System.out.println("--------------------");
		 System.out.println(grades[0]);
		 System.out.println(grades[1]);
		 System.out.println(grades[2]);
		 System.out.println(grades[3]);
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		System.out.println("--------------------");
		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };
		int size = animals.length;
		for (int i = 0; i < size; i++) {
			System.out.print(animals[i] + " ");
			System.out.println();
		}

		// create an array to store 5 double values, print all in 1 line
      System.out.println("-------------------------------------------------------------------------");
		double[] values = { 1.0, 1.1, 1.2, 1.3, 1.4 };
		int size1 = values.length;

		for (int i = 0; i < size1; i++) {
			System.out.println(values[i] + " ");
		}
		int [] j={1,2,3,4,5};
		for(int k=0; k<j.length; k++){
			for(int l=0; l<=0; l++)
		  System.out.println(j[k]);
		}
		
	}
}
