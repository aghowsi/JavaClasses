package com.class11;

public class HowToSumInArray {

	public static void main(String[] args) {
		
		int[] numbers= {12,4,5,2,6,90};
		
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) {
			
			sum=sum+numbers[i];
		}
           System.out.println(sum);
	}

}
