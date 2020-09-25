package simplonExoHeritage;

import simplonInterfaces.iCommuniquer;

public class Lion extends Carnivore implements iCommuniquer
{
	
private String maison;
	
	public Lion() 
	{
		super();
		this.maison= "tanniere";
	}
	
	
	@Override
	public void communiquer() 
	{
		System.out.println("je rugis");
	}
	
	@Override
	public void nourir() 
	{
		super.nourir();
	}
	
	
	@Override
	public void deplacement() 
	{
		System.out.println("je me deplace en marchant de toute ma prestence ");
	}
	
	
	public String toString()
	{
		return super.toString() +" je vis dans un "+this.maison
		+" je fais parti de la famille des "+ super.getMamifere();
	}

}


