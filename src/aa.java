import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		   
		   if(language.equals("Java")){
		   System.out.println(" Java is a programming language ");
		   }else if(language.equals("C")) {
		   System.out.println("C is a procedural progsramming language");
		   }else if(language.equals("C++")){
		   System.out.println("C++ is a middle-level programming language");
		   }else{
			   System.out.println("Doesnt match any programming language");
		   }
		  
	}

}
