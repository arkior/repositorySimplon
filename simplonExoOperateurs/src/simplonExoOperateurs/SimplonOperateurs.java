package simplonExoOperateurs;

import java.util.Scanner;

public class SimplonOperateurs {
	
	public static float floatUtilisateur()
	{
		boolean verifFloat = false;
		float floatUtilisateur;
		do {
		Scanner valeurUtilisateur = new Scanner(System.in);
		System.out.println("veuillez saisir une valeur entre 0 et 0,99");
		floatUtilisateur = valeurUtilisateur.nextFloat();
		if(floatUtilisateur >= 1 || floatUtilisateur<=0) 
		{
			System.out.println("votre donnee est incorrecte...");
		}
		else
		{
			verifFloat = true;
		}
		}while(!verifFloat);
		return floatUtilisateur;
	}
	
	public static void resultatPieces(float somme) 
	{
		String message = "pour payer il vous faut :\n ";
		int cinquante, vingt,dix,cinq,deux, un;
		int total, sommeRestante;
		
		 total =(int) (somme*100);
		 
		 cinquante = total / 50;
		 sommeRestante = total % 50;
		 
		 vingt = sommeRestante /20;
		 sommeRestante %=  20;
		 
		 dix = sommeRestante / 10;
		 sommeRestante %=  10;
		 
		 cinq = sommeRestante /5;
		 sommeRestante %=  5;
		
		 deux = sommeRestante /2;
		 sommeRestante %=  2;
		
		 un = sommeRestante /1;
		 sommeRestante %=  1;
		 
		 if(cinquante!=0) 
		 {
			 message+= " "+cinquante +" piece de 0.50 centimes\n ";
		 }
		  if (vingt!= 0)
		 {
			 message+= " "+vingt +" piece(s) de 0.20 centimes\n ";
		 }
		 if (dix!= 0)
		 {
			 message+= " "+dix +" piece(s) de 0.10 centimes\n ";
		 }
		 if (cinq!= 0)
		 {
			 message+= " "+cinq +" piece(s) de 0.05 centimes\n ";
		 }
		 if (deux!= 0)
		 {
			 message+= " "+deux +" piece(s) de 0.02 centimes\n ";
		 }
		 if (un!= 0)
		 {
			 message+= " "+un +" piece(s) de 0.01 centimes\n ";
		 }
		
		
		System.out.println( message);
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("\n***************************ASSOCIATIVITE DES OPERATEURS*********************************\n");
		
		
		System.out.println(" b + a - a ");
		System.out.println(" b = 2  a = 3 ");
		System.out.println(" b + (a - a)  = "+(6+(4-4)));
		System.out.println(" b + a - a = "+(6+4-4));
		
		
		System.out.println("\n***************************CAPACITE CAMIONS CARTONS*********************************\n");
		
		Scanner donneeUtilisateur = new Scanner(System.in);
		System.out.println("saisir la capacite du camion");
		float capaciteCamion = donneeUtilisateur.nextFloat();
		
		System.out.println("saisir le poids de votre colis");
		float capaciteColis = donneeUtilisateur.nextFloat();
		
		float nbrColis = capaciteCamion/capaciteColis;
		
		System.out.println("le camion a une capacite de : "+nbrColis+ " colis");
		System.out.println("meme donnee arrondi  : "+Math.floor(nbrColis)+ " colis");
		

		System.out.println("\n***************************MOYENNE ARITHMETIQUE*********************************\n");

		
		Scanner valeurUtilisateur = new Scanner(System.in);
		System.out.println("saisissez la valeur de A");
		float valeurA = valeurUtilisateur.nextFloat();
		
		System.out.println("saisissez la valeur de B");
		float valeurB = valeurUtilisateur.nextFloat();
		
		
		System.out.println("la moyenne arithmetique de A et B est de : "+ (valeurA+valeurB)/2);
		System.out.println("la moyenne geometrique  de A et B est de : "+Math.sqrt((valeurA*valeurB)) );
		
		System.out.println("\n***************************NOMBRE DE PIECES*********************************\n");
		
		
		
		float sommeUtilisateur = floatUtilisateur();
		float somme = sommeUtilisateur;
		
		resultatPieces(somme);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
