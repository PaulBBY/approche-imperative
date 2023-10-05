package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	
	static int askMe (Scanner scanner)
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
			System.out.println("\nBien joué, ton chiffre entre 1 et 10 est : "+nb+"\n\n++++++++++\n");
		}
		else
		{
			System.out.println("\nTon chiffre n'est pas entre 1 et 10 ...\n\n++++++++++\n");
			askMe(scanner);
		}
		
		scanner.close();
		return nb;
	
	}
	
	static void multiply(int nb)
	{	
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(nb+" * "+i+" = "+nb*i);
		}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		multiply(askMe(scanner));
		scanner.close();

	

	}

}