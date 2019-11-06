package com.Class9;

public class Pattern3 {
	public static void main(String[] args) {
		// Print pattern
		/*     1 
		 *    22 
		 *   333 
		 *  4444 
		 * 55555 
		 */
		
		 for(int i=1; i<=5; i++){
		      for(int c=1; c<=(5-i); c++){
		      System.out.print(" ");
		    }
		    for(int d=1; d<=i; d++){
		    System.out.print(i);
		  }
		  System.out.println();
		    }
		 System.out.println("--------------------------------------------------------");
		 
		 //Print Pattern
		 //      *
		 //     **
		 //    ***
		 //   ****
		 ////*****
		 
		 for(int i=1; i<=5; i++){
		      for(int c=1; c<=(5-i); c++){
		      System.out.print(" ");
		    }
		    for(int d=1; d<=i; d++){
		    System.out.print("*");
		  }
		  System.out.println();
		    }
	}

}
