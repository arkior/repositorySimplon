package modeles;

public class Pays
{
	
	private String nom;
	private int nbrHabitants;
	private Personne Autorite;
	
	public Pays (String unNom , Personne unPresident)
	{
		this.nom = unNom;
		this.Autorite = unPresident;
	}

	public int getNbrHabitants()
	{
		return this.nbrHabitants;
	}

	public void setNbrHabitants(int nbrHabitants)
	{
		this.nbrHabitants = nbrHabitants;
	}

	public String getNom()
	{
		return this.nom;
	}

	public Personne getAutorite()
	{
		return this.Autorite;
	}
	
	public String toString() 
	{
		String habitantsDuPays = (this.nbrHabitants == 0)?" chiffre non communiqué ": " "+this.getNbrHabitants();
		return " "+ this.getNom()+ " \n-nombre d'habtants de ce pays : "+ habitantsDuPays +"\n-"+ this.getAutorite().toString()+" ";
	}
	

}
