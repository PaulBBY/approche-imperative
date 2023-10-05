package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("======================\n\nTest chiffres >3 \n\n======================\n");
		
		for (int i : array)
		{
			if (i > 3)
			{
				System.out.println(i);
			}
			
		}
		
		System.out.println("\n======================\n\nTest chiffres pairs \n\n======================\n");
		
		for (int i : array)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
			
		}
		
		System.out.println("\n======================\n\nTest index pairs \n\n======================\n");
		
		for (int i : array)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
			
		}
		
		System.out.println("\n======================\n\nTest chiffres impairs \n\n======================\n");


		for (int i : array)
		{
			if (i % 2 != 0)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
