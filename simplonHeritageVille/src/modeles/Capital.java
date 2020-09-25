package modeles;

public class Capital extends Ville
{
	private Pays pays;
	private static int nombreCapital;
	
	
	
	
	public Capital(String nom,Pays unPays)
	{
		super(nom);
		this.pays = unPays;
		Capital.nombreCapital++;
	}
	public Capital(String unNom,Pays unPays, int unNbrHab )
	{
		super(unNom,unNbrHab);
		this.pays = unPays;
		Capital.nombreCapital++;
	}

	

	public static int getNombreCapital() 
	{
		return Capital.nombreCapital;
	}

	public Pays getPays()
	{
		return this.pays;
	}


	public void setPays(Pays unPays)
	{
		this.pays = unPays;
	}
	
	public String toString()
	{
		return super.toString() +" Capital : "+ this.getPays().toString();
	}
	
	

}
