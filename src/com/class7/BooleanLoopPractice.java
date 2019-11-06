package com.class7;

public class BooleanLoopPractice {

		/*
		 * Creat a boolean variable workday and assign true create int variable day and
		 * assign it to 1 as long as it is workday print "I need a day off" and increase
		 * data to 6 once day is 6 print "I do not need a day off any more"
		 */
		public static void main(String[] args) {
			boolean workDay = true;
			int a = 1;

			while (workDay) {
				System.out.println("I need a day off ");
				if (a > 6) {
					System.out.println("I do not need a day off anymore");
					workDay = false;
				}
				a++; 

			}
		}
	}



