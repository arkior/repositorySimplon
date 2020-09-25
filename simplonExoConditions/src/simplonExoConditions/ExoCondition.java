package simplonExoConditions;

import java.util.Scanner;

public class ExoCondition
{

	
	public static String message(int note) 
	{
		String message="";
		if(note<8) 
		{
			message = "ajourné";
		}else if(note>8 & note<10) 
		{
			message = "rattrapage";
		}else 
		{
			message = "admis";
		}
		

		return message;
	}
	
	public static int[]insertionDonneesTab(int[]tab)
	{
		Scanner valeurUtilisateur = new Scanner(System.in);
		System.out.println("veuillez saisir 3 valeurs\n\n");
		for(int i = 0;i<tab.length;i++) 
		{
			System.out.println("saississez la valeur "+(i+1));
			tab[i]=valeurUtilisateur.nextInt();
		}
		return tab;
	}
	
	public static String messageDoublon(int[]tab) 
	{
		String message = " ";
		for(int i =0;i<tab.length-1;i++) 
		{
			for(int y = i+1;y<tab.length;y++) 
			{
				if(tab[i]== tab[y]) 
				{
					message = "vous avez un doublon\na la position : "+(i+1) 
																	  +" se trouve la valeur : "
																	  +tab[i]
																	  +"\na la position : "
																  	  +(y+1)
																  	  +" se trouve la valeur : "
																  	  +tab[y];
					break;
				}
				else
				{
					message = "il n'y a pas de doublon";
				}
			}
		}
		return message;
	}
	
	
	
	public static char verificationOperateur(char op)
	{
		char opVerif = 'o';
		boolean verif = false;
		do {
			if(op=='+' ||op=='-'||op=='*'||op=='/')
			{
				opVerif=op;
				verif= true;
			}
			else 
			{
				Scanner valeurCalculette = new Scanner(System.in);
				System.out.println("votre operateur est inconnu\n");
				System.out.println("veuillez saisir un operateur (+ - * / )\n");
				op =verificationOperateur(valeurCalculette.next().charAt(0));
				
			}
		}while(!verif);
		
		
		return opVerif; 
	}
	
	
	public static String calculette(int[]tab, char op) 
	{
		
		String resultat = "";
		
		int valeur1= tab[0];
		int valeur2 = tab[1];
		
		
		switch (op) 
		{
		case '+':
			resultat = "resultat : "+valeur1+" "+ op+" "+valeur2 +" = " + (valeur1+valeur2);
			break;
		case '-':
			resultat = "resultat : "+valeur1+" "+ op+" "+valeur2 +" = " + (valeur1-valeur2);
			break;
		case '*':
			resultat = "resultat : "+valeur1+" "+ op+" "+valeur2 +" = " + (valeur1*valeur2);
			break;
		case '/':
			resultat = "resultat : "+valeur1+" "+ op+" "+valeur2 +" = " + (valeur1/valeur2);
			break;
		}
		
		return resultat;
	}
	
	public static String equation(int a, int b) 
	{
		String resultat= "";
		int somme=0;
		if(a != 0) {
            somme = (-b/a);
            resultat = " (-"+b+"/"+a+") ,  x = "+ somme;
        } else {
        	resultat = "resultat est infini";
        }
		
		return resultat;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("\n******************************AGE MINEUR****************************************\n ");
		
		Scanner ageUtilisateur = new Scanner(System.in);
		System.out.println("veuillez saisir votre age");
		int age = ageUtilisateur.nextInt();
		if(age<=0) 
		{
			System.out.println("vous n'etes pas né");
		}
		else if(age<18)
		{
			System.out.println("vous etes mineur");
		}
		else 
		{
			System.out.println("vous etes majeur");
		}
		
		
		System.out.println("\n******************************VALEUR ABSOLUE**************************************** \n");
		
		Scanner valeurAbsolue = new Scanner(System.in);
		System.out.println("veuillez saisir votre valeur");
		int valeur = valeurAbsolue.nextInt();
		System.out.println("la valeur absolue de " +valeur+ " est : "+Math.abs(valeur)+"\n");
		
		
		System.out.println("\n****************************** SAISIR NOTE**************************************** \n");

		Scanner noteUtilisateur = new Scanner(System.in);
		System.out.println("veuillez saisir votre note");
		int note = noteUtilisateur.nextInt();
		System.out.println(message(note));

		
		System.out.println("\n****************************** DOUBLON OU PAS**************************************** \n");
		
		
		int[]tabValeurs =new int[3];
		
		System.out.println(messageDoublon(insertionDonneesTab(tabValeurs)));
		
		System.out.println("\n****************************** CALCULETTE **************************************** \n");
		
		Scanner valeurCalculette = new Scanner(System.in);
		System.out.println("veuillez saisir 2 valeurs");
		int[]tab = new int[2];
		for(int i = 0;i<tab.length;i++)
		{
			System.out.println(" valeur "+(i+1));
			tab[i]= valeurCalculette.nextInt();
		}
		System.out.println("veuillez saisir un operateur (+ - * / )");
		char op =verificationOperateur(valeurCalculette.next().charAt(0));
		
		
		System.out.println(calculette(tab,op));
		
		
		System.out.println("\n******************************BONUS EQUATION ax + b = 0 **************************************** \n");

		Scanner valeurEquation = new Scanner(System.in);
		System.out.println("veuillez saisir A");
		int a = valeurEquation.nextInt();
		System.out.println("veuillez saisir B");
		int b = valeurEquation.nextInt();
		
		System.out.println(equation(a,b));
		

		int a1 = 1; 
		int b1 = 0; 
		int n = 5;
		  while (a1 <= n) {
		   b1 += a1++;
		  System.out.println(a + ", " + b1);
		  }
		  
		  int a2 = 0, b2 = 0, c2 = 0, d2 = 0, m2 = 3, n2 = 4;
		  for (; a2 < m2; a2++)
		  {
		   d2 = 0;
		   for (b2 = 0; b2 < n2; b2++)
		    d2 += b2;
		   c2 += d2;
		  }
		  System.out.println(a2 + ", " + b2 + ", " + c2 + ", " + d2 + ".");
		 }


}
