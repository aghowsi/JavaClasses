package com.class4;

import java.util.Scanner;

public class TaskLogical {

	public static void main(String[] args) {

		/*
		 * Ask user to enter the month they were born based on the month define the
		 * season if user is born in Jan,feb, dec-->winter if user is born in mar, apr,
		 * may--> spring if user is born in jun, jul, aug-->summer if user is born in
		 * sep, oct, nov-->fall otherwise-->unknown at the end of the program
		 * ("you were born in--")
		 */

		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please enter the month you were born");
		String month = "January";
		month = scan.nextLine();

		String season;
		if (month.equals("January") || month.equals("February") || month.equals("December")) {
			season = "Winter";
		} else if (month.contentEquals("March") || month.contentEquals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.contentEquals("June") || month.contentEquals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		} else {
			season = "Unknown";
		}
		System.out.println("You were born in " + season);
		System.out.println(month);
	}

}