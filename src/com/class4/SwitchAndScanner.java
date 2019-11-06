package com.class4;

import java.util.Scanner;

public class SwitchAndScanner {
  
	  public static void main(String[] args){
		  boolean isSunny= true;
          Scanner scan=new Scanner(System.in);
       isSunny=scan.nextBoolean();
        if (isSunny) {
                System.out.println("It is a sunny day, I should go somewhere!");
                int temperature=scan.nextInt();
                if ( temperature>85){
                        System.out.println("I am going to the beach");
                }else {
                        System.out.println("I am going to the park");
                }
        }else{
                System.out.println("I stay home and practice Java!");
        }
 }
}