package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	static int askMe(Scanner scanner)
	{	
		
		System.out.println("Donne moi un chiffre...\n\n");
		
		if(!scanner.hasNextInt())
		{
			System.out.println("Ceci n'est pas un entier... Try again !\n");
			
			scanner.nextLine();
			askMe(scanner);
		}
		
		int nb = scanner.nextInt();
		
		return nb;
		
	}
	
	static void cs(int nb)
	{
		System.out.println("\nLa suite correspondante à "+nb+" est :\n");
		
		for(int i = nb; i<=nb+10;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		cs(askMe(scanner));
		
		scanner.close();
	}

}
