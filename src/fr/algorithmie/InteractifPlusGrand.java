package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	
	static int[] askMe(Scanner scanner)
	{	
		
		int[] mesNb = new int[10];
		
		System.out.println("Donne moi 10 chiffres...");
		
		if(!scanner.hasNextInt())
		{
			System.out.println("Ceci n'est pas un entier... Try again !\n");
			
			scanner.nextLine();
			askMe(scanner);
		}
		
		
		int restant=10;
		
		for(int i=0;i<10;i++)
		{
			int nb = scanner.nextInt();
			restant--;
			mesNb[i]=nb;
			
			System.out.println("Les chiffre renseigné est : "+nb);
			
			if(restant>0)
			{
				System.out.println("Il reste "+restant+ " chiffres à renseigner");
			}
		}

		return mesNb;
		
	}
	
	static void plusGrand(int[] mesNb)
	{
		int max = 0;
		
		for(int i : mesNb)
		{
			if(i>max)
			{
				max =i;
			}
		}
		
		System.out.println("Le chiffre maximal est : "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		plusGrand(askMe(scanner));

	}

}
