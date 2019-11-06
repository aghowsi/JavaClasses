import java.util.Scanner;

public class ifPractice {
	public static void main(String[] args) {
		/*
		 * Please enter the length 18 Please enter the width 16 The shape of your object
		 * is rectangle Please enter the length 16 Please enter the width 16 The shape
		 * of your object is square
		 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the lengh");
	int length=scan.nextInt();
	
	System.out.println("Please enter the width");

	int width=scan.nextInt();
	
	if(length>width) {
		System.out.println("The shape of your object is rectangle");
		
	}else if(length==width) {
		System.out.println("The shape of you object is square");
	}
	
	
	
	}
	

}
