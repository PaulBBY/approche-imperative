package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
	
	static void askMe (Scanner scanner, int[] tableau)
	{
		
		System.out.println("Bonjour, ce programmes propose deux options :\n\n"
				+ "1. Ajouter un nombre\n"
				+ "2. Afficher les nombres existants\n\n"
				+ "Merci de renseigner le numéro de l'une de ces options...");
		
		if(!scanner.hasNextInt())
		{
			System.out.println("Ceci n'est pas un entier... Try again !\n");
			
			scanner.nextLine();
			askMe(scanner, tableau);
		}
		
		int option = scanner.nextInt();
		
		switch(option)
		{
			case 1:
				System.out.println("Vous avez choisi l'option 1 :");
				tableau = methode1(tableau, scanner);		
				break;
				
			case 2:
				System.out.println("Vous avez choisi l'option 2 :");
				methode2(tableau);
				break;
		}
		askMe(scanner, tableau);
	}
	
	static int[] methode1(int[] tableau, Scanner scanner)
	{	
		
		System.out.println("Merci de renseigner un numéro à rentrer dans le tableau...");

		int newNu = scanner.nextInt();		
		int taille = tableau.length;
	
		int[] tableauN = new int[taille+1];
		
		int i = 0;
		
		for(int j:tableau)
		{
			tableauN[i]=j;
			i++;
		}
		
		tableauN[taille]=newNu;
				
		return tableauN;
		
	}
	
	static void methode2(int[] affiche) 
	{
		for(int i:affiche)
		{
			System.out.println(i);
		}
	}
	
	static int[] plus(int[] tableau)
	{
		return tableau;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] init = new int[0];
		Scanner scanner = new Scanner(System.in);
		
		askMe(scanner, init);
		scanner.close();

	}

}
