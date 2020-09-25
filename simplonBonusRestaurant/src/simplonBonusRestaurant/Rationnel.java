package simplonBonusRestaurant;

public class Rationnel
{
	private int nominateur;
	private int denominateur;
	
	public Rationnel(int a, int b)
	{
		this.nominateur = a;
		this.denominateur = b;
	}

	public int getNominateur() {
		return this.nominateur;
	}

	public int getDenominateur() {
		return this.denominateur;
	} 
	
	public String toString() 
	{
		return "le denominateur a pour valeur : "+this.getDenominateur() 
			  +"\nle nominateur a pour valeur : "+this.getNominateur();
	}

}
