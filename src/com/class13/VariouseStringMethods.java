package com.class13;

public class VariouseStringMethods {
	
	public static void main(String[] args) {
	// Print the string in reverse order	
     String day= "Sunday";
    // 1st way
    System.out.println(day.charAt(5)+""+day.charAt(4)+""+day.charAt(3)+""+day.charAt(2)+""+day.charAt(1)+""+day.charAt(0));
     
   System.out.println("----------------------------------------------------------------");
    
    //2nd way 
   System.out.println(day.length());
     for(int i=day.length()-1; i>=0; i--) {
    	 System.out.print(day.charAt(i));
    		 
     }
     System.out.println(); 
     System.out.println("----------------------------------------------------------------");
     /*
      * Create a String and if the String is not empty perform the following: if the
      * String has an odd number of characters and has 3 or more characters, print
      * the character in the middle of the String.
      */
     
 
     
     String str1="Hellourwewr";
     
     int lenght=str1.length();
     int middle=str1.length()/2;
     
     System.out.println();
     if(!str1.isEmpty()) {
         if(lenght%2!=0 && lenght>=3) {
             System.out.println(str1.charAt(middle));
	}	
}
	}}
