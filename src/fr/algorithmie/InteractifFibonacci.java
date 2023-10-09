package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
	
	
	int estInt(Scanner scan) {
		
		while (!scan.hasNextInt()) {
				System.out.println("\n\""+scan.next()+"\" n'est pas un entier ! Réessayez :\n");
		}
		
		int estInt = scan.nextInt();
		return estInt;	
		
	}

	
	/*static int askMe(Scanner scanner) 
	{
		System.out.println("Donne moi un chiffre...");
		
		int n = scanner.nextInt();
	
		System.out.println("Le chiffre est : "+n);
		
		return n;
	}*/
	
	void go(Scanner scan) {
		
		System.out.println("======================\n\nDonne moi un rang N\n\n======================\n");
		
		int n = estInt(scan);
		
		int ns=1;
		int n1=1;
		int n2=0;
		int nst=0;
		int n1t=0;
		
		for(int i=2;i<=n;i++) {
			nst=ns;
			n1t=n1;
			
			ns=n1+n2;
			n1=nst;
			n2=n1t;	
		}
		
		System.out.println("\nLe nombre correspondant dans la suite de Fibonnaci est "+ns);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		InteractifFibonacci go = new InteractifFibonacci();
		
		go.go(scan);
		scan.close();
	}

}
