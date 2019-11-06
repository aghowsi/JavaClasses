package com.class11;

public class HowToFindLargestNumberInAarray {
public static void main(String[] args) {
		
		int[] nums= {88,99,-140,-33,0,44};
		
		int largest=nums[0];
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
		System.out.println("The largest number in this array is "+largest);
}
}
