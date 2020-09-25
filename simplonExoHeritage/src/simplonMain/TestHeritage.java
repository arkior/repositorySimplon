package simplonMain;

import simplonExoHeritage.Animal;
import simplonExoHeritage.Lapin;
import simplonExoHeritage.Lion;

public class TestHeritage {
	
	

	public static void main(String[] args)
	{
		
		System.out.println("\n************************ LE LION **************************************\n");
		Lion lion = new Lion();
		
		
		lion.communiquer();
		lion.deplacement();
		System.out.println(lion);
		
		System.out.println("\n************************ LE LAPIN **************************************\n");
		Lapin lapin = new Lapin();
		
		
		lapin.communiquer();
		lapin.deplacement();
		System.out.println(lapin);
		
		
		System.out.println("\n************************ NOMBRE D'ANIMAL INSTANCIE **************************************\n");

		
		System.out.println("vous avez cree "+Animal.getCompteur() +" Objet(s)");
		
		
		
	}

}

