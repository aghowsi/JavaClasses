package com.class8;

public class TaskLoopArithmetic {
	public static void main(String[] args) {
		/*Write a code to find the sum of even and odd number 
		 * ranging from 1 to 20
		 * expecting 2 outputs
		 * sum for odd nums=...
		 * sum for even nums=...
		 */
		//1 way
		int sum = 0;
		for(int i=1; i<=20; i+=2 ) {
			
			sum=sum+i;
			
		}
		System.out.println(sum);
        System.out.println("__________________________________");
        
        int sum1=0;
        for(int i=1; i<=20;) {
        	
        	sum1=sum1+1;
        }
        System.out.println(sum1);
	}

}
