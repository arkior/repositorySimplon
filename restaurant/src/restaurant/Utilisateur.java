package restaurant;

import java.util.Scanner;

public class Utilisateur
{
	 private Scanner choixUtilisateur =new Scanner(System.in);
	 private boolean choixOk = false;
	 private int choix;;
	 private String valeurUtilisateur;
	
	public Utilisateur() {}
	
	public int choixUtilisateurBoisson() 
	{
		
		 this.choixOk = false;
		 
		
		do 
		{
			System.out.println("choississez votre boisson\n"
					+ "- choix A : EAU PLATE\n"
					+ "- choix B : EAU GAZEUSE\n"
					+ "- choix C : SODA\n");
			this.testValeur();

		}while(!this.choixOk);
		return this.choix;
		
	}
	
	public int choixUtilisateurAccompagnement() 
	{
		
		 this.choixOk = false;
		 
		
		do 
		{
			System.out.println("choississez votre accompagnement\n"
					+ "- choix A : LEGUME FRAIS\n"
					+ "- choix B : RIZ\n"
					+ "- choix C : FRITES\n");
			this.testValeur();

		}while(!this.choixOk);
		return this.choix;
		
	}
	
	
	
	public int choixSupplement()
	{
		do 
		{
			System.out.println("voulez vous un supplement de riz ?\n"
					+ "- choix A : oui\n"
					+ "- choix B : non\n"
					);
			this.valeurUtilisateur = new String(choixUtilisateur.next()).toUpperCase();
			this.choix = valeurUtilisateur.charAt(0);
			int result = (int) choix;
			if(result == 65 || result == 66 )
			{
				this.choixOk = true;
			}
			else
			{
				this.choixOk= false;
				System.out.println("votre choix n'est pas bon veuillez recommencer\n");
			}

		}while(!this.choixOk);
		return this.choix;
		
	}
	
	public int choixMenu()
	{
		this.choixOk = false;
		do 
		{
			System.out.println("choississez un menu de votre choix\n"
					+ "- choix A : BOEUF / ACCOMPAGNEMENT / BOISSON(boisson non comprise)\n"
					+ "- choix B : POULET / ACCOMPAGNEMENT / BOISSON\n"
					+ "- choix C : VEGETARIEN / LEGUMES FRAIS (possibilite d'avoir un supplement en riz) / BOISSON ");
			this.testValeur();
			

		}while(!this.choixOk);
		return this.choix;
	}
	
	public  void testValeur() 
	{
		this.valeurUtilisateur = new String(choixUtilisateur.next()).toUpperCase();
		this.choix = valeurUtilisateur.charAt(0);
		int result = (int) this.choix;
		if(result == 65 || result == 66 || result == 67 )
		{
			this.choixOk = true;
		}
		else
		{
			this.choixOk= false;
			System.out.println("votre choix n'est pas bon veuillez recommencer\n");
		}
	}
	
	
	
	

}
