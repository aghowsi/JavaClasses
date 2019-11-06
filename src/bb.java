import java.util.Scanner;

public class bb {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter the browser name to proceed further with execution");
		   String browser = sc.nextLine(); 
		   
		   if(browser.equalsIgnoreCase("ChRoMe browser")){
		     System.out.println(browser.replaceAll(browser,"Proceed with Chrome browser"));{
		     }}else if(browser.equalsIgnoreCase("FireFOX")) {
		    	 System.out.println(browser.replaceAll(browser,"Proceed with Firefox browser"));{
		    		}
		     }else if(browser.equalsIgnoreCase("IE")) {
		    	 
		    	 System.out.println(browser.replaceAll(browser,"Proceed with IE brwoser"));
		     }else {
		    	 System.out.println("Invalid browser");
		     }
		   
		
		     
		   }
	}


