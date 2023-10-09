package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	
	int estInt(Scanner scan) {
		
		while (!scan.hasNextInt()) {
				System.out.println("\n\""+scan.next()+"\" n'est pas un entier ! Réessayez :\n");
		}
		
		int estInt = scan.nextInt();
		return estInt;	
		
	}
	
	void go(Scanner scan) {
		
		System.out.println("======================\n\nDonnez moi un chiffre\n\n======================\n");
		int chiffre = estInt(scan);
		
		System.out.println("\nLa suite correspondante à "+chiffre+" est :\n");
	
		for(int i = chiffre; i<=chiffre+10;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		InteractifChiffresSuivants go = new InteractifChiffresSuivants();
		go.go(scan);
		scan.close();
	}

}
