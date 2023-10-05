package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//méthode applicable à l'exercice "SommeDeTablea
		
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int[] arrayS = new int [2];
		int somme1 = 0;
		int somme2 = 0;
		 
		for (int i : array1)
		{
			somme1 += i;
		}
		 
		for (int j : array2)
		{
			somme2 += j;
		}
		 
		arrayS[0] = somme1;
		arrayS[1] = somme2;
		 
		System.out.println("La somme du premier tableau est : "+somme1);
		System.out.println("La somme du second tableau es : "+somme2);
		
	}

}
