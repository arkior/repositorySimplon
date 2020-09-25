package simplonExo;

import javax.print.attribute.IntegerSyntax;

import java.util.Scanner;

public class simplonExo {
	public static int resultatDivision(int valeur,int valeur1) 
	{
		return valeur/valeur1;
	}
	
	public static int quotientDivision(int valeur,int valeur1) 
	{
		return valeur%valeur1;
	}
	
	
	//methode qui retourne une moyenne d'un tableau d'entier
	public static int moyenne(int[] valeur) 
	{
		int resultat=0 ;
		for (int i =0 ; i<valeur.length;i++)
		{
			
			resultat+= valeur[i];
		}
		
		return resultat/valeur.length;
	}
	
	public static int[] tableauPermute(int[]tab) 
	{
		int tampon = tab[4];
		int tampon2 = tab[3];
		int tampon3 = tab[2];
		int tampon4 = tab[1];
		tab[4] = tab[0];
		tab[0] = tampon2;
		tab[2] = tampon;
		tab[1]= tampon3;
		tab[3]= tampon4;
	
		
		
		
		return tab;
	}

	public static void main(String[] args) 
	{
		System.out.println("********************************ASCII D'UN CHARACTERE***********************************\n");
		char c = 'a';
        System.out.println("le resultat en code ASCII de la lettre '"+c+"'  est : "+  (int) c+"\n");
	
        System.out.println("********************************LETTRE EN MINUSCULE***********************************\n");
        Scanner sc1 = new Scanner(System.in);
		System.out.println("tapez une lettre en majuscule");
		String lettre1 = new String(sc1.next());

		System.out.println("voici ce que vous avez saisi: "+lettre1+" lettre reduite : " +lettre1.toLowerCase ()+"\n");
		
		
		
		System.out.println("********************************MOYENNE***********************************\n");
		//programme qui retourne la moyenne de trois valeurs
		
		int[] valeurs ;
		Scanner cbValeur = new Scanner(System.in);
		System.out.println("combien de valeurs voulez vous rentrez dans le tableau ?");
		int nombre = cbValeur.nextInt();
		int[]tableauEntier =new int[nombre];
		
		for(int i = 0; i<tableauEntier.length ;i++) 
		{
			 Scanner valeurTab = new Scanner(System.in);
			System.out.println("veuillez saisir la valeur numero :"+(i+1));
			int valeurTableau = valeurTab.nextInt();
			tableauEntier[i]=valeurTableau;
			
		}

		//methode static qui prend en parametre un tableau et calcule ma moyenne
		System.out.println(" la moyenne de votre tableau est de : "+moyenne(tableauEntier)+"\n");
		
		System.out.println("********************************SOMME PLUS QUOTIENT***********************************\n");
		
		Scanner valeurDiv = new Scanner(System.in);
		System.out.println("veuillez saisir la premiere valeur");
		int val1 = valeurDiv.nextInt();
		System.out.println("veuillez saisir la deuxieme valeur");
		int val2 = valeurDiv.nextInt();
		System.out.println("le resultat de la division est : "+resultatDivision(val1,val2)
		+"\nle quotient de la division est de : "			+quotientDivision(val1,val2)+"\n");
		

		
		System.out.println("********************************ENTIERS PERMUTE***********************************\n");
		
		Scanner valeurEntier = new Scanner(System.in);
		System.out.println("veuillez saisir 5 valeurs");
		int []tabEntiers = new int[5];
		for(int i =0;i<tabEntiers.length;i++) 
		{
			System.out.println("valeur numero :"+(i+1)+"\n");
			tabEntiers[i] = valeurEntier.nextInt();
		}
		System.out.println("votre tableau actuel\n");
		for(int i =0;i<tabEntiers.length;i++) 
		{
					System.out.print(tabEntiers[i]+",");
		}
		
		System.out.println("\nvotre nouveau tableau \n");
		int []tab2 = tableauPermute(tabEntiers);
		for(int i =0;i<tab2.length;i++) 
		{
					System.out.print(tab2[i]+",");
		}
		

		
	}

}
