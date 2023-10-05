package fr.algorithmie;

import java.util.Scanner;

public class Rotation {
	
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
	
	
	static int[] rotation (int[] rotate)
	{
		
		int t = rotate.length;
		int[] rotated = new int[t];
		
		rotated[0] = rotate[t-1];
		rotated[t-1] = rotate[0];
		
		for (int i = 1; i<t-1; i++)
		{
			rotated[i] = rotate[i];
		}
		
		System.out.println("Les nombres retournés sont : \n");
		
		for (int i : rotated)
		{
			System.out.println(i);
		}
		
		return rotated;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner scanner = new Scanner(System.in);
	rotation(askMe(scanner));
		

	}

}
