package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
	
	
	
	static void guess(int r, Scanner scanner)
	{
		int tentatives = 1;
		
		System.out.println("Devine un chiffre entre 1 et 100...");
		
		while(true)
		{
			
			
			if(!scanner.hasNextInt())
			{
				System.out.println("Ceci n'est pas un entier... Try again !\n");
				scanner.nextLine();
			}
			
			else
			{
				int tentative = scanner.nextInt();
				
				if(tentative == r) {
					System.out.println("Bonne réponse. Mon chiffre était bien : "+r+"\nTu as trouvé en "+tentatives+" tentatives");
					break;
				}
				
				else
				{
					tentatives++;
					
					if (tentative>r)
					{
						System.out.println("Dommage. Mon chiffre est plus petit...");
					}
					else
					{
						System.out.println("Dommage. Mon chiffre est plus grand...");
					}
					
				}
			}
			
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		guess(new Random().nextInt(1,100), scanner);
		
	}

}
