package fr.algorithmie;

import java.util.Scanner;

public class FirstLast6 {
	
	static int[] askMe (Scanner scanner) 
	{
		
		System.out.println("Combien de numéros dans ton tableau d'entiers ?");
		
		if(!scanner.hasNextInt())
		{
			System.out.println("Ceci n'est pas un entier... Try again !\n");
			
			scanner.nextLine();
			askMe(scanner);
		}
		
		int taille = scanner.nextInt();
		int[] nombresR = new int [taille];
		
		System.out.println("Le tableau aura "+taille+" entiers\n");
		
		for (int i = 0; i < taille; i++ )
		{
			System.out.println("Entier à rentrer ?");
			
			int tempInt = scanner.nextInt();
			
			nombresR[i] = tempInt;
			int restant = taille-(i+1);
			
			if (restant > 0) 
			{
				System.out.println("L'entier renseigné est : "+ tempInt +"\nIl reste "+ restant +" entiers à renseigner\n");
			}
			else {
				System.out.println("\nLes "+taille+" entiers ont été renseignés !\n");
			}
		}
		
		System.out.println("Les nombres renseignés sont : \n");
		
		for (int i : nombresR)
		{
			System.out.println(i);
		}
		
		scanner.close();
		return nombresR;
		
	}

	static boolean valorisation (int[] valorise) 
	{
		
	
		
		if (valorise.length>=1 && valorise[0] == 6 || valorise[valorise.length-1] == 6)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("\n"+valorisation(askMe(scanner)));
	}

}
