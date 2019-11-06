import java.util.Scanner;

public class ab {

	public static void main(String[] args) {
		/*
		 * Write a program that shows if you input a number it will display a month with corresponding number, 
		 * and if you input a number out of bounds (12) it will display invalid. Display the months to be displayed on my output.
IMPORTANT: use Scanner Class
Example:
1 will display January
2 will display February
3 will display March
4 will display April
5 will display May
6 will display June
7 will display July
8 will display August
9 will display September
10 will display October
11 will display November
12 will display December
ANY INPUT outside of 12 should display in output "Invalid"
		 */
Scanner scan=new Scanner(System.in);
System.out.println("please enter month number");
int a=scan.nextInt();
if(a==1) {
	System.out.println("january");
	
}else if(a==2) {
	System.out.println("february");
}else
{
	System.out.println("invalid");
}
	}

}
