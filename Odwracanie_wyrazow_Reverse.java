import java.util.Scanner;
import java.lang.*;

public class Odwracanie_wyrazow_Reverse {

	public static void main(String[] args) {
	
		  
			   Scanner skaner=new Scanner(System.in);
			   System.out.println("Podaj wyraz do odwr�cenia: ");
			   String wyraz=skaner.next();
			   
			   StringBuilder str = new StringBuilder(wyraz);
			   System.out.println("Wyraz do odwr�cenia: " + str);		   
		       System.out.println("Wyraz odwr�cony: " + str.reverse());	    
		  
		   }
			
		}
