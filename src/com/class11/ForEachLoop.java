package com.class11;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] names= {"Ahmad","Faisal","Ehsan","Farooq"};
		
		for(String namha:names) {
			System.out.println(namha);
		}
		System.out.println("-------------------------------------");
		System.out.println();
		
   int [] numbers= {88, 97,1212,478};
   
   for(int digits:numbers) {
	   System.out.println(digits);
   }
   System.out.println("-------------------------------------");
	System.out.println();
	int [] number= {88, 97,1212,478};

	int sum=0;
	
	for(int i=0; i<number.length; i++) {
		sum=sum+number[i];
	}
	System.out.println(sum);
   
	}

}
