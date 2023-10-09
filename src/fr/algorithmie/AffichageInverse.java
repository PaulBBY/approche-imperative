package fr.algorithmie;

public class AffichageInverse {

	
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int taille = array.length-1;
		
		System.out.println("======================\n\nDans l'ordre\n\n======================\n");
		
		for (int i : array) {
			System.out.println(i);
		}
		
		System.out.println("\n======================\n\nEn sens inverse\n\n======================\n");
		
		for(int i = taille; i >= 0 ; i--) {
			System.out.println(array[i]);
		}
	
		
		int[] copyArray = new int[array.length];
		int i = 0;
		
		for (int j : array) {
			copyArray[i] = j;
			i ++;
		}
		
	}

	
}
