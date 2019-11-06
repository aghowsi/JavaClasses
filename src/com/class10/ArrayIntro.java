package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// 1st way //0, 1, 2, 3, 4, 5, 6, 7, 8
		int[] values = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int a = 0; a < values.length; a++) {

		}
		System.out.print(values[0] + " ");
		System.out.print(values[2] + " ");
		System.out.print(values[4] + " ");
		System.out.print(values[6] + " ");
		System.out.print(values[8] + " ");

		System.out.println();
		System.out.println("----------------------------------------------------");

		// 2nd way
		int[] values1 = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int a = 0; a < values1.length; a++) {

			System.out.print(values1[0] + " ");
			System.out.print(values1[2] + " ");
			System.out.print(values1[4] + " ");
			System.out.print(values1[6] + " ");
			System.out.print(values1[8] + " ");
			break;
		}
		System.out.println();
		char[] letters = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };
		for (int i = 0; i < letters.length; i++) {
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.print(letters[0]);
		System.out.print(letters[2]);
		System.out.print(letters[4]);
		System.out.print(letters[6]);
		System.out.print(letters[8]);
		System.out.print(letters[10]);
		//1st way
		System.out.println();
		System.out.println("-----------------------------------------------------");
		  for (int i=1; i<=4; i++) {
			  	for (int j=1; j<=4; j++) {
					
					if (i==1 || i==4 || j==1 || j==4) {
						System.out.print("$");
					} else {
						System.out.print(" ");
					}
				} System.out.println();
			}
		  //2nd way
		  System.out.println();
			System.out.println("-----------------------------------------------------");
			for(int i=1; i<=4; i++){
			      System.out.print("$");
			    }
			    System.out.println();
			    for(int a=1; a<=(4-2); a++){
			      System.out.print("$"+"  ");
			    }
			     System.out.println();
			     for(int b=1; b<=(4-2); b++){
			       System.out.print("$"+"  ");
			     }
			      System.out.println();
			      for(int c=1; c<=4; c++){
			        System.out.print("$");
			      }
	}
}
