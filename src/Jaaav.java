import java.util.Scanner;

public class Jaaav {
	public static void main(String[] args) {
		
		
		  Scanner userInput = new Scanner(System.in);
	        String[] array = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	        for (int i = 0; i <array.length; i++) {
	            System.out.println("Please enter day " + (i+1) + " of the week");
	            array[i] = userInput.next();
	        }
	        
	        
	        for(int i=0; i<=array.length-1; i++){
	            System.out.println(array[i]);
	        }
	        
		
		}

		}


	

