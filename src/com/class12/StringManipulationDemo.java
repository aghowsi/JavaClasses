package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) {
		//There are two ways to create String Object
		
		//1st way (String Literal)
		String name="Jhon";
		System.out.println(name);
		System.out.println("The length of name is = "+name.length());
		
		
		//2nd ways
		String name1=new String("Jhon1");
         System.out.println(name1);
         System.out.println(name1.length());
         System.out.println("-----------------------------------------------");   
         /*This method returns the length of this string
          * The length is equal to the number
          * of 16-bit Unicode characters in the string
          */
         int name1len=name.length();
         System.out.println("The length of name1Len is = "+name1len);
         
         System.out.println("-----------------------------------------------");  
         String str1="Hello woRld";
         System.out.println("before = "+str1);
         str1=str1.toLowerCase();
         System.out.println("After Manuplation = "+str1);
         System.out.println("-----------------------------------------------");
         
         //.equals() method
         String str2="HelLo WoRld";
         boolean isEqual=str1.contentEquals(str2);
         System.out.println(isEqual);
         System.out.println("-----------------------------------------------");   
         //.equalsIgnoreCase(); This method does not care for capitalization and compare the content only
         System.out.println(str1.equalsIgnoreCase(str2));
         System.out.println("-----------------------------------------------");
         //This method converts all of the charaters in this string to upper case
         //toUpperCase();
         String str3="Mohammad";
         System.out.println("Before :"+str3);
        str3= str3.toUpperCase();
         System.out.println("After :"+str3);
         System.out.println("-----------------------------------------------");
         
         
	}

}
