package simplonExoHeritage;

public class Herbivore extends Animal
{
	private String nourriture ;
	public Herbivore() 
	{
		super();
		this.nourriture = "herbe";
	}
	
	
	
	
	public String getNourriture() {
		return this.nourriture;
	}




	@Override
	public void nourir() 
	{
		System.out.println(" je mange de "+this.nourriture);
	}
	
	
	@Override
	public void deplacement() 
	{
		System.out.println("je suis un herbivore je me deplace d'une certaine façons");
	}
	
	
	public String toString()
	{
		return "je suis un herbivore";
	}

}
