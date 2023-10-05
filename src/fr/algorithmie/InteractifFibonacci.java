package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	
	static int askMe(Scanner scanner) 
	{
		System.out.println("Donne moi un chiffre...");
		
		int n = scanner.nextInt();
	
		System.out.println("Le chiffre est : "+n);
		
		return n;
	}
	
	static void fibo(int n) 
	{
		int ns=1;
		int n1=1;
		int n2=0;
		int nst=0;
		int n1t=0;
		
		for(int i=2;i<=n;i++)
		{
			nst=ns;
			n1t=n1;
			
			ns=n1+n2;
			n1=nst;
			n2=n1t;
			
		}
		
		System.out.println(ns);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		fibo(askMe(scanner));
		scanner.close();
	}

}
