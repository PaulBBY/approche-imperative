package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	static void askMe (Scanner scanner)
	{
		System.out.println("Donne moi un chiffre entre 1 et 10 : ");

		if(!scanner.hasNextInt())
		{
			System.out.println("Ceci n'est pas un entier... Try again !\n");
			
			scanner.nextLine();
			askMe(scanner);
		}
		
		int nb = scanner.nextInt();
		
		if(nb>0 && nb<=10)
		{
			System.out.println("\nBien joué, ton chiffre entre 1 et 10 est : "+nb);
		}
		else
		{
			System.out.println("\nTon chiffre n'est pas entre 1 et 10 ...\n\n++++++++++\n");
			askMe(scanner);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		askMe(scanner);
		scanner.close();

	
	

	}

}
