import java.util.Scanner;

public class If {
public static void main(String[] args) {
	/*
	 * Initialize a scanner object.
Create an if condition: if user enters a number and it is even, print that “Value is even”.
If the above mentioned statement is true then create a nested if condition to see if the value is greater than 100.
If the value is greater than 100, then print “Value is too large”, else print “Value is just right”.
For the first if condition create an else and if the value is less than 100 then print “Value is just right and is an odd number”,
 else “This is an odd number and value is too high”
	 * 
	 */
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int value=scan.nextInt();
	if(value%2==0) {
		System.out.println("value is even");
		if(value>100) {
			System.out.println("value is too large");
		}else {
			System.out.println("value is just right");
		}
		
	}else
		if(value<100) {
		System.out.println("value is just right and is an odd number");
	}else {
		System.out.println("This is an odd number and value is too high");
	}
	
}
}
