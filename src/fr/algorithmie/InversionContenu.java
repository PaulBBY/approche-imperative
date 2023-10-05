package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int taille = array.length;
		int [] arrayCopy = new int [taille];
		
		for(int i = 0; i < taille ; i++) 
		{
			arrayCopy [taille - i - 1] = array [i];
		}

		System.out.println("======================\n");
		
		for (int i : array) 
		{
			System.out.println(i);
		}

		System.out.println("\n======================\n");
		
		for (int i : arrayCopy) 
		{
			System.out.println(i);
		}
		
		System.out.println("\n======================");
	}

}
