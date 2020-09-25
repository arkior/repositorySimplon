package simplonExoHeritage;

import simplonInterfaces.IAnimauxForet;

public class Carnivore extends Animal implements IAnimauxForet
{
	private String nourriture ;
	public Carnivore() 
	{
		super();
		this.nourriture = "viande";
	}
	
	
	
	
	@Override
	public void nourir() 
	{
		System.out.println("je mange de "+this.nourriture);
	}
	
	
	
	public String getNourriture() {
		return this.nourriture;
	}




	public String toString()
	{
		return IAnimauxForet.super.jeSuisUnAnimal()+" de type carnivore je mange de la "+this.nourriture;
	}




	
	
}
