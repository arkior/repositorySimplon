package simplonExoHeritage;

public class Animal
{
	private String mamifere;
	private static int compteur = 0;
	
	public Animal() 
	{
		this.mamifere = "vertebres";
		Animal.compteur++;
	}
	
	
	
	public String getMamifere() {
		return this.mamifere;
	}

	


	public static  int getCompteur() {
		return Animal.compteur;
	}


	
	public void nourir() 
	{
		System.out.println("je mange de tout");
	}
	
	public void deplacement() 
	{
		System.out.println("je me deplace d'une certaine façons");
	}
	
	
	
}
