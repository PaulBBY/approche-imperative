package fr.tableaux;

public class ExerciceTableauChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] myCi = {"Hanoï","Lima","Quito","Santa Cruz", "Bogota"};
		
		int myCiS = myCi.length;
		
		for (String c : myCi) {
			System.out.println(c+"\n");
		}
		
		System.out.println("Il y a : "+myCiS+" Villes \n");
		
		myCi[3] = "Reims";
			
		for (String c : myCi) {
				System.out.println(c+"\n");
			}
		
	}

}
