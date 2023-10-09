package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
	
	
	int estInt(Scanner scan) {
		
		while (!scan.hasNextInt()) {
				System.out.println("\n\""+scan.next()+"\" n'est pas un entier ! Réessayez :\n");
		}
		
		int estInt = scan.nextInt();
		return estInt;	
		
	}
	

	void go() {
		 
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int r = random.nextInt(1 , 100);
		
		int tentatives = 1;
		
		System.out.println("======================\n\nDevinez un chiffre entre 1 et 100...\n\n======================\n");
		
		while(true) {
			String grandeur;
			int laTentative = estInt(scan);
			if(laTentative == r) {
				System.out.println("\nBonne réponse. Mon chiffre était bien : "+r+"\n\nTu as trouvé en "+tentatives+" tentatives");
				break;
			} else {
				tentatives++;
				if (laTentative>100 || laTentative<=0) {
					System.out.println("\n"+laTentative+" n'est pas un chiffre netre 1 et 100. Réessayez\n\n======================\n");
				}
				if (laTentative<r) {
					grandeur = "grand";
				} else {
					grandeur = "petit";
				}
				System.out.println("\nDommage. Mon chiffre est plus "+grandeur+". Réessayez\n\n======================\n");
			}
		}
		
		scan.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteractifPlusMoins go = new InteractifPlusMoins();
		go.go();
		
	}

}
