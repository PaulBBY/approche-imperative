package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	int estInt(Scanner scan) {
		
		while (!scan.hasNextInt()) {
				System.out.println("\n\""+scan.next()+"\" n'est pas un entier ! Réessayez :\n");
		}
		
		int estInt = scan.nextInt();
		return estInt;	
		
	}
	
	void go() {
		
		System.out.println("======================\n\nDonnez moi un nombre\n\n======================\n");
		
		Scanner scan = new Scanner(System.in);
		
		int nombre = estInt(scan);
		int somme = 0;
		
		for(int i = nombre; i>0; i--) {
				somme += i;
			}

		System.out.println("\nLa somme de tous les entiers entre 1 et "+nombre+" est : "+somme);
		
		scan.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InteractifSommeArithmetique go = new InteractifSommeArithmetique();
		go.go();
				
	}

}
