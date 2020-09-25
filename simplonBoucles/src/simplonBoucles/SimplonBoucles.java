package simplonBoucles;

import java.util.Scanner;

public class SimplonBoucles {
	
	public static void carre()
	{
		System.out.println("choisissez un chiffre");
		Scanner valeurUtilisateur = new Scanner(System.in);
		int valeur = valeurUtilisateur.nextInt();
		char [][]tab = new char[valeur][valeur];
		char X = 'X';
		for (int y = 0; y < tab.length; ++y) {
	        for (int x = 0; x < tab[y].length; ++x) {
	        	tab[y][x]=X;
	            System.out.print(tab[y][x]);
	        }
	        System.out.println();
		}
		
	}
	
	
	public static void multiplication()
	{
		System.out.println("choisissez un chiffre");
		Scanner valeurUtilisateur = new Scanner(System.in);
		int valeur = valeurUtilisateur.nextInt();
		for(int i =0;i<=10;i++) 
		{
			System.out.println(""+valeur+" x "+i+ " = "+ (valeur*i));
			
		}
	}
	
	public static void multiplication2D()
	{
		int [][]tab = new int[11][11];
		for (int y = 1; y < tab.length; ++y) {
	        for (int x = 0; x < tab[y].length; ++x) {
	        	tab[y][x]=y*x;
	            System.out.print(" "+tab[y][x]+",");
	        }
	        System.out.println();
		}
	}
	
	public static void alphabet() 
	{
		char []tabAlphabet = new char[26];
		int compteur = 65;
		int i = 0;
		while(i<tabAlphabet.length) 
		{
			tabAlphabet[i]=  (char) compteur;
			compteur++;
			System.out.print(tabAlphabet[i]+",");
			i++;
		}
		System.out.print("\n");
	}
	
	public static void saisirEntier() 
	{
		System.out.println("choisissez un chiffre");
		Scanner valeurUtilisateur = new Scanner(System.in);
		int valeur = valeurUtilisateur.nextInt();
		int compteur= 1;
		String message = "";
		while(valeur<10)
		{
			 message += "votre valeur numero : "+compteur+ " que vous avez tapé est : " + valeur+"\n"; 
			 System.out.println(message);
			 
			 System.out.println("choisissez un chiffre");
			 valeur = valeurUtilisateur.nextInt();
			 compteur++;
		}
		
		System.out.println("la valeur : "+ valeur + " n'est pas inferieur a 10");
	}
	
	public static void valeurPositive()
	{
		System.out.println("choisissez un chiffre");
		Scanner valeurUtilisateur = new Scanner(System.in);
		int chiffreUtilisateur = valeurUtilisateur.nextInt();
		int compteur = 1;
		for(int i =chiffreUtilisateur;i>=0;i--)
		{
			System.out.println("la valeur numero : "+compteur+" est = " +i);
			compteur++;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("\n*************************************** VALEUR POSITIVE N-1*************************************************\n");
		
		valeurPositive();
		
		System.out.println("\n*************************************** MULTIPLICATION *************************************************\n");
		multiplication();
		
		System.out.println("\n*************************************** MULTIPLICATION 1 - 10 *************************************************\n");
		
		multiplication2D();
		
		System.out.println("\n*************************************** AFFICHAGE CARRE *************************************************\n");
		
		carre();
		
		System.out.println("\n*************************************** LETTRES DE L'ALPHABETS *************************************************\n");
		
		alphabet();
		
		System.out.println("\n*************************************** ENTREE UTILISATEUR INFERIEUR A 10 *************************************************\n");
		
		saisirEntier();
	}

}
