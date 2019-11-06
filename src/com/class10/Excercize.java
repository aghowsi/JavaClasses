package com.class10;

public class Excercize {

	public static void main(String[] args) {
		//An array is collection of same type of data.
		// Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		// grade B (use 2 different ways of creating an array).
		// 1 way
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[2]);
		// 2 way

		char[] grades1 = new char[6];
		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';
		grades1[5] = 'F';
		System.out.println(grades1[4]);
		

//Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
		// 1 way
		String[] names = { "Rahmat", "Ahmad", "Farid", "Zabih", "Qari" };
		System.out.println(names[1]);
		// 2 way
		String[] names1 = new String[5];
		names1[0] = "Rahmat";
		names1[1] = "Ahmad";
		names1[2] = "Faridt";
		names1[3] = "Zabih";
		names1[4] = "Qari";
		System.out.println(names1[0]);

//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using element of array: “Saturday is Java coding Day”. 
	//1 way
		String[] words = { "Java", "Saturday", "day", "coding", "is" };
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
		
		//2 way
		String[]word=new String[5];
		word[0]="Java ";
		word[1]="Saturday ";
		word[2]="day ";
		word[3]="coding ";
		word[4]="is ";
		System.out.println(word[1]+word[4]+word[0]+word[3]+word[2]);
		
	}
}
