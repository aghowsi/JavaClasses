package com.class11;

public class ArrayTask {
	public static void main(String[] args) {
		// Create 2D array of String with 2 rows and 3 columns
		// and print value in second row and third column
		int[][] array = new int[2][3];

		// 1st row
		array[0][0] = 2;
		array[0][1] = 4;
		array[0][2] = 6;

		// 2nd row

		array[1][0] = 1;
		array[1][1] = 3;
		array[1][2] = 5;

		System.out.println(array[1][2]);

		// 2nd way of doing the task

		int[][] numbers = { { 2, 4, 6 }, { 1, 3, 5 } };

		System.out.println(numbers[1][2]);
		// To identify the numbers of rows
		System.out.println(numbers.length);
		// to identify the numbers of columns/elements in a row
		System.out.println(numbers[1].length);

		System.out.println("----------------------------------------------------");
		System.out.println();

		int[][] inte = { { 88, 12, 13, 79 }, { 75, 34, 22, 12 }, { 78, 56, 47, 37 } };
		for (int i = 0; i < inte.length; i++) {
			for (int a = 0; a < inte[i].length; a++) {
				if (inte.length % 2!= 0) 
					System.out.print(inte[i][a] + " ");

				
			}
		}

	}

}
