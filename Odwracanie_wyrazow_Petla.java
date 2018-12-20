import java.util.Arrays;
import java.util.Scanner;

public class Odwracanie_wyrazow_Petla {

	public static void main(String[] args) {
		
		Scanner skaner=new Scanner(System.in);
		System.out.println("Podaj wyraz: ");
		String wyraz=skaner.nextLine();
		int dlugosc=wyraz.length();
		
		System.out.print("Wyraz odwrócony: ");
		for (int i=dlugosc-1; i>=0; i--){
			System.out.print(wyraz.charAt(i));
		}
		 
	}
}


