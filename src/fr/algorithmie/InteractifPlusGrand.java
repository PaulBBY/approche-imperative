package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	
	
	int estInt(Scanner scan) {
		
		while (!scan.hasNextInt()) {
				System.out.println("\n\""+scan.next()+"\" n'est pas un entier ! Réessayez :\n");
		}
		
		int estInt = scan.nextInt();
		return estInt;	
		
	}
	
	
	void go(Scanner scan) {	
		
		System.out.println("======================\n\nRenseignez 10 numéros\n\n======================\n");
		
		int[] mesNb = new int[10];
		int restant=10;
		
		for(int i=0;i<10;i++) {
			int nb = estInt(scan);
			restant--;
			mesNb[i]=nb;
			
			System.out.println("\nLe chiffre renseigné est : "+nb+"\n\n======================\n");
			
			if (restant>0) {
				System.out.println("Il reste "+restant+ " chiffres à renseigner\n");
			}
		}

		plusGrand(mesNb);
		
	}
	
	void plusGrand(int[] mesNb) {
		
		int max = 0;
		
		for(int i : mesNb) {
			if(i>max) {
				max =i;
			}
		}
		
		System.out.println("Le chiffre maximal est : "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		InteractifPlusGrand go = new InteractifPlusGrand();
		
		go.go(scan);
	}

}
