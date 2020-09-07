package obligatorisk2;

import static java.lang.Integer.*;
import static java.lang.Math.*;
import javax.swing.JOptionPane.*;
import java.util.Scanner;


public class Opg7Poengsum {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv inn poengsum(heltall): ");
		double poengsum = scan.nextDouble();
		
		if(poengsum < 101 && poengsum >= 90) {
			System.out.println("Karakter A");
		}
		else if(poengsum < 90 && poengsum >= 80) {
			System.out.println("Karakter B");
		}	
		else if(poengsum < 80 && poengsum >= 60) {
			System.out.println("Karakter C");
		}	
		else if(poengsum < 60 && poengsum >= 50) {
			System.out.println("Karakter D");
		}	
		else if(poengsum < 50 && poengsum >= 40) {
			System.out.println("Karakter E");
		}	
		else if(poengsum < 40 && poengsum >= 0) {
			System.out.println("Karakter F");
		}	
		else {
			System.out.println("Ugyldig poengsum");
		}	
			
		}

	}
}