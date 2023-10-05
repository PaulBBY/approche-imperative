package fr.algorithmie;

import java.util.ArrayList;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		ArrayList<Integer> existe = new ArrayList<>();
		
		int commun = 0;
		
		for (int i : array1)	
		{
			for (int j : array2)
			{
				if (i == j && existe.contains(i))
				{
					commun += 1;
				}
		
				else if (i == j)
				{
					commun += 2;
					existe.add(i);
				}
				
			}
		
		}
		
		System.out.println("Il y a "+commun+" éléments en commun !");
	}

}



