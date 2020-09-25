package simplonExoHeritage;

import simplonInterfaces.iCommuniquer;

public class Lapin extends Herbivore implements iCommuniquer
{
	private String maison;
	
	public Lapin() 
	{
		super();
		this.maison= "terrier";
	}
	
	
	@Override
	public void communiquer() 
	{
		System.out.println("je glapis");
	}
	
	@Override
	public void nourir() 
	{
		super.nourir();
	}
	
	
	@Override
	public void deplacement() 
	{
		System.out.println("je me deplace par petit bonds ");
	}
	
	
	public String toString()
	{
		return super.toString() +" je vis dans un "+this.maison+ " je  mange de "+ super.getNourriture()
		+" je fais parti de la famille des "+ super.getMamifere();
	}

}
