import java.util.Scanner;
import java.lang.*;

public class Odwracanie_wyrazow_Reverse {

	public static void main(String[] args) {
	
		  
			   Scanner skaner=new Scanner(System.in);
			   System.out.println("Podaj wyraz do odwrócenia: ");
			   String wyraz=skaner.next();
			   
			   StringBuilder str = new StringBuilder(wyraz);
			   System.out.println("Wyraz do odwrócenia: " + str);		   
		       System.out.println("Wyraz odwrócony: " + str.reverse());	    
		  
		   }
			
		}
