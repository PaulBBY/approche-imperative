package fr.algorithmie;

import java.util.Scanner;

public class FirstLast {
	
	
	int estInt(Scanner scan) {
		
		while (!scan.hasNextInt()) {
				System.out.println("\n\""+scan.next()+"\" n'est pas un entier ! Réessayez :\n");
		}
		
		int estInt = scan.nextInt();
		return estInt;	
		
	}
	
	
	void go(Scanner scan) {
		
		System.out.println("======================\n\nQuelle taille doit faire le tableau ?\n\n======================\n");
		
		int taille = estInt(scan);
		int[] nombresR = new int [taille];
		
		System.out.println("\nLe tableau aura "+taille+" entiers\n\n======================\n");
		
		for (int i = 0; i < taille; i++ ) {
			System.out.println("Entier à rentrer ?\n");
			
			int tempInt = estInt(scan);
			
			nombresR[i] = tempInt;
			int restant = taille-(i+1);
			
			if (restant > 0) {
				System.out.println("\nL'entier renseigné est : "+ tempInt +". Il reste "+ restant +" entiers à renseigner\n\n======================");
			} else {
				System.out.println("\nLes "+taille+" entiers ont été renseignés !\n\n======================\n");
			}	
		}
		
		System.out.println("Les nombres renseignés sont : \n");
		
		for (int i : nombresR) {
			System.out.println(i);
		}
		
		System.out.println("");
		valorisation(nombresR);
		
	}
	
	
	void valorisation (int[] valorise) {
		
		boolean reponse;
		
		if (valorise.length>=1 && valorise[0] == valorise[valorise.length-1]) {
			reponse = true;
		} else {
			reponse = false;
		}
		
		afficheValorisation(reponse);
	}
	
	
	void afficheValorisation(Boolean retour) {
		
		if (retour = true) {
			System.out.println("Le tableau a au moins un élément, et son premier et dernier élément sont égaux");
		} else {
			System.out.println("Le tableau est vide, ou son premier, ou son dernier premier et dernier élément sont différents");
		}
	}

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		FirstLast go = new FirstLast();
		go.go(scan);
		scan.close();

	}

	
}
