package com.class7;
import java.util.Scanner;
public class Task1 {
	

		public static void main(String[] args) {
			/*You need to ask user to pay for coffee
			 * you need to keep asking user to pay for it until
			 * entered price is equal=5;
			 * After user paid then say "Enjoy your coffee"
			 */
			Scanner scan= new Scanner(System.in);
			//1st way with while
			int price=5;
			
			do {
				System.out.println("Plese pay for your coffee");
				price=scan.nextInt();
			}while(price!=5);
				System.out.println("Enjoy your coffee");
				//2nd way with while
			System.out.println("-------------------------------------------------------------");	
				int price1=5;
				System.out.println("Please pay for your coffee");
				price1=scan.nextInt();//4
				while(price1!=5){
					System.out.println("Please pay for your coffee");
					price1=scan.nextInt();
				}
				System.out.println("Enjoy your cofee");
			}
			
		}



