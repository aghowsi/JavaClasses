package com.Class9;

public class Pattern1 {
	//print pattern
	//$$$$
	//$  $
	//$  $
	//$$$$
	
	public static void main(String[] args){
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
