package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {
	
	
	int estInt(Scanner scan) {
		
		while (!scan.hasNextInt()) {
				System.out.println("\n\""+scan.next()+"\" n'est pas un entier ! Réessayez :\n");
		}
		
		int estInt = scan.nextInt();
		return estInt;	
		
	}
	
	
	void afficheChoix(int choix, int tour) {
		
		String joueur;
		
		if (tour == 1) {
			joueur = "Vous avez ";
		} else {
			joueur = "L'ordinateur a ";
		}
		
		if (choix == 1) {
			System.out.println("\n"+joueur+"retiré un baton\n");
		} else {
			System.out.println("\n"+joueur+"retiré "+choix+" batons\n");
		}
		
	}
	
	
	int humain(Scanner scan, int batons) {
	
		switch (batons) {
			case 2 :
				System.out.println("Prenez un ou deux batons :\n");
				break;
			case 1 :
				System.out.println("Prenez le dernier baton...\n");
				break;
			default :
				System.out.println("Prenez un, deux ou trois batons :\n");
		}
			
		int choixH = estInt(scan);
		
		while (choixH <=0 || choixH > 3 || choixH > batons) {
			System.out.println("\nVeuillez ne pas tricher ! Réessayez :\n");
			choixH = estInt(scan);
		}
	
		afficheChoix(choixH, 1);
		return choixH;
		
	}

	
	int ordinateur(Random random, int batons) {
		
		int choixO = 0;
		int opti = ( batons % 4 );
		
		if (batons > 4) {
			switch (opti) {
				case 3 :
					choixO = 2;
					break;
				case 2, 1 :
					choixO = 1;
					break;
				case 0 :
					choixO = 3;
					break;
			} 	
		} else {
			switch (batons) {
				case 4 :
					choixO = 3;
					break;
				case 3 : 
					choixO = 2;
					break;
				case 2, 1:
					choixO = 1;
					break;
			}
		}
	
		afficheChoix(choixO, 0);
		return choixO;
		
	}
	
	
	void jeux(Scanner scan) {
		
		System.out.println("======================\n\n"
				+ "Bienvenue au jeux des 21 batons"
				+ "\n\n======================\n");
		
		int batons = 21;
		
		Random random = new Random ();
		
		if (random.nextInt(1, 3) == 1) {
			System.out.println("À vous de commencer !"
					+ "\n\n======================\n");
			batons -= humain(scan, batons);		
			System.out.println("Il reste "+batons+" batons dans la partie !"
					+ "\n\n======================");
		} else {
			System.out.println("L'odinateur commence !"
					+ "\n\n======================");
		}
	
		
		while(true) {
			batons-=ordinateur(random, batons);
			
			if (batons == 0) {
				System.out.println("Vous avez gagné !");
				break;
			} else {
				System.out.println("Il reste "+batons+" batons dans la partie !\n\n======================\n");
			}
			
			batons -= humain(scan, batons);
			
			if (batons == 0) {
				System.out.println("L'odinateur a gagné... All your base are belong to us !");
				break;
			} else {
				System.out.println("Il reste encore "+batons+" batons dans la partie !\n\n======================\n");
			}
		}
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		
		Interfactif21Batons go = new Interfactif21Batons();
		
		go.jeux(scan);
		scan.close();
		
				
		
	
	}
	

}
