package com.class12;

public class ArrayForLoopAndFindSum {
	public static void main(String[] args)
	{
		/*Write a program that sums all numbers that are on even index and on even row and prints it out.

           For example, in the following array, the numbers with parentheses would be summed: 
		 */
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
//should print -6
 int result = 0;
 
 for(int i = 0; i < a.length; i++ ){
		
		for(int j=0; j < a[i].length; j++){
		  if (i%2==0 || j%2==0) {
		  result +=  a[i][j];
		}
 }
 
 }
 System.out.println(result);
		
	}

}
