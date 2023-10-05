package fr.tableaux;

public class ExerciceDeclarationTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myNs = {8, -7, 12, 1, -2, 14, 17, 9};
		int myL = myNs.length;
		
		System.out.println("Le premier chiffre est : "+myNs[0]+"\n");
		System.out.println("La longueur du tableau est : "+myL+"\n");
		System.out.println("Le dernier chiffre est : "+myNs[myL-1]);
		
		
		//L'index commence à 0 (index 0 correspond au premier chiffre dans le tableau). 
		//Donc l'index du dernier chiffre d'un tableau de taille n, doit être n-1.
		
	}
	
}
