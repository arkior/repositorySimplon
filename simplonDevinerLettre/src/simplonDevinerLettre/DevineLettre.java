package simplonDevinerLettre;

import java.util.Random;
import java.util.Scanner;

public class DevineLettre {
	
	
	public static int genererInt()
	{
		int min =65;
		int max= 91;
		Random random = new Random();
		int nb= min+random.nextInt(max-min); 
		return nb;
	}
	
	
	public static boolean verifiChar(char caractereUtilisateur) 
	{
		boolean verif = false;
		int caractereVerif = (int) caractereUtilisateur;
		if (caractereVerif >64 && caractereVerif< 92) 
		{
			verif = true;
		}
		
		
		return verif ;
	}
	
	public static boolean verifReponse()
	{
		boolean retourReponse = false;
		boolean verif = false;
		Scanner choixUtilisateur= new Scanner(System.in);
		do
		{
			System.out.println("voulez vous rejouer ? (O/N)\n");
			String reponseStr = new String(choixUtilisateur.next().toUpperCase());
			char reponse=reponseStr.charAt(0);
			if(reponse== 'O'|| reponse== 'N' ) 
			{
				if(reponse == 'O') 
				{
					retourReponse = false;
					verif = true;
				}
				else 
				{
					retourReponse = true;
					verif = true;
				}
				
			}
		}
		while(!verif);
		return retourReponse;
	}
	
	public static void init()
	{
		Scanner choixUtilisateur = new Scanner(System.in);
		boolean rejouer = false;
		do {
			char caractereAtrouver = (char) genererInt();
			System.out.println("caractere a trouver "+caractereAtrouver);
			System.out.println("devinez quelle lettre j'ai choisi ?");
			System.out.println("veuillez saisir une lettre de l'alphabet [A-Z]\n");
			boolean trouver = false;
			do 
			{
				
				
				String lettreChoisie = new String(choixUtilisateur.next().toUpperCase());
				char lettreDefinitive=lettreChoisie.charAt(0);
				
				
				if( verifiChar(lettreDefinitive)) 
				{
					
					if(victoire(lettreDefinitive,caractereAtrouver)) 
					{
						trouver = true;
					}
					else 
					{
						int positionUtilisateur = (int)lettreDefinitive;
						int  positionLettreaTrouver = (int) caractereAtrouver;
						System.out.println("position de la lettre a trouver = "+positionLettreaTrouver );
						System.out.println("position actuelle = "+positionUtilisateur );
						System.out.println("eh non ce n'est pas mon choix... recommencez" );
						if(positionUtilisateur > positionLettreaTrouver) 
						{
							System.out.println("dirigez vous le vers le A");
						}
						else
						{
							System.out.println("dirigez vous le Z");
						}
						
						System.out.println("resaisissez a nouveau une lettre [A-Z]" );
						
						
						
					}
	
				}else 
				{
					System.out.println("votre saisie est incorrecte...  ");
					System.out.println("resaisissez a nouveau une lettre [A-Z]" );
				}
				
	
			}
			while(!trouver);
			System.out.println("Felicitation vous avez trouvé\n");
			
			rejouer = verifReponse();
			
			
			
		}while(!rejouer);
		System.out.println("au revoir a bientot...");
	}
	
	public static boolean victoire(char caracteresUtilisateur, char caractereMachine) 
	{
		boolean result = false;
		if(caracteresUtilisateur == caractereMachine)
		{
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		init();
		
		
		
		
		
	}

}
