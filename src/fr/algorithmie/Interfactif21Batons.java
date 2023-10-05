package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {
	
	
	static int human(Scanner scanner, int score)
	{
		
		if(score>3)
		{
			System.out.println("Prenez un, deux ou trois batons !");
		}
		else if (score==2)
		{
			System.out.println("Prenez un ou deux batons !");
		}
		else
		{
			System.out.println("Plus trop le choix... prend le dernier >:C !");
		}
	
		
		int play = scanner.nextInt();
		
		if(play>3 || play<=0)
		{
			System.out.println("Merci de respecter les régles du jeux >:C !");
			human(scanner, score);
		}
		
		
		if(play>score)
		{
			System.out.println("Pas assez de batons dans la partie ! Prennez en moins >:C !");
			human(scanner, score);
		}
		
		System.out.println("Vous avez pris "+play+" batons !");
		
		return play;
	}
	
	
	static int computer(Random random, int score)
	{
		
		int play = 0;
		
		if(score>3)
		{
			play = random.nextInt(1,3);	
		}
		else if(score==2)
		{
			play = random.nextInt(1,2);
		}
		else
		{
			play = 1;
		}
		
		System.out.println("L'ordinateur a prit "+play+" batons !");
		
		return play;
	}
	
	
	static void jeux(Scanner scanner, Random random)
	{
		
		int score = 21;
		
		if(random.nextInt(1,2)==1)
		{
			System.out.println("à vous de commencer !");
			score -= human(scanner, score);		
			System.out.println("Il reste encore "+score+" batons !");
		}
		else
		{
			System.out.println("L'odinateur commence >:C !");
		}
		
		while(true)
		{
			
			
			score-=computer(random, score);
			
			if(score==0)
			{
				System.out.println("vous avez gagné !");
				break;
			}
			else 
			{
				System.out.println("Il reste "+score+" batons :");
			}
			
			score-=human(scanner, score);
			
			if(score==0)
			{
				System.out.println("L'odinateur a gagné >:C !\n"
						+ "All your base are belong to us !");
				break;
			}
			else
			{
				System.out.println("Il reste encore "+score+" batons :");
			}
			
		}
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		jeux(scanner, random);
				
		

	}

}
