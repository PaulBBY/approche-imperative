package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	static int askMe(Scanner scanner)
	{	
		System.out.println("Donne moi un chiffre");


		if(!scanner.hasNextInt())
		{
			System.out.println("Ceci n'est pas un entier... Try again !\n");
			
			scanner.nextLine();
			askMe(scanner);
		}
		
		int nb = scanner.nextInt();
		
		scanner.close();
		return nb;
		
	}
	
	static void fct(int nb)
	{
		int somme = 0;
		for(int i = nb; i>0 ;i--)
			{
				somme += i;
			}

		System.out.println("La somme de tous les entiers entre 1 et "+nb+" est : "+somme);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		fct(askMe(scanner));
	}

}
