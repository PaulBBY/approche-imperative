package fr.algorithmie;

import java.util.Scanner;

public class FirstLast {
	
	static int[] askMe(Scanner scanner) {
		
		System.out.println("======================\n\nCombien de numéros dans ton tableau d'entiers ?\n");
		
		if(!scanner.hasNextInt())
		{
			System.out.println("\n!!!Ceci n'est pas un entier... Try again !!!\n");
			
			scanner.nextLine();
			askMe(scanner);
		}
		
		int taille = scanner.nextInt();
		
		int[] nombresR = new int [taille];
		
		System.out.println("\nLe tableau aura "+taille+" entiers\n\n======================");
		
		for (int i = 0; i < taille; i++ )
		{
			System.out.println("\nEntier à rentrer ?\n");
			
			int tempInt = scanner.nextInt();
			
			nombresR[i] = tempInt;
			int restant = taille-(i+1);
			
			if (restant > 0) 
			{
				System.out.println("\nL'entier renseigné est : "+ tempInt +"\n\nIl reste "+ restant +" entiers à renseigner\n\n======================");
			}
			
			else {
				System.out.println("\nLes "+taille+" entiers ont été renseignés !\n\n======================\n");
			}
			
		}
		
		System.out.println("Les nombres renseignés sont : \n");
		
		for (int i : nombresR)
		{
			System.out.println(i);
		}
		
		return nombresR;
		
	}
	
	static boolean valorisation (int[] valorise) {
		

		
		if (valorise.length>=1 && valorise[0] == valorise[valorise.length-1])
		{
			return true;
		}
		
		else 
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n"+valorisation(askMe(scanner)));
		scanner.close();
		// TODO Auto-generated method stub

	}

}
