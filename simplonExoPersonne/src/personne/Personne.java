package personne;

public class Personne
{
	private String nom;
	private Personne ami;
	
	public Personne(String unNom) 
	{
		this.nom= unNom;
	}
	
	public Personne(String unNom,Personne unAmi) 
	{
		this.nom= unNom;
		this.ami = unAmi;
	}

	public Personne getAmi() {
		return this.ami;
	}

	public void setAmi(Personne unAmi) {
		this.ami = unAmi;
	}
	
	public String toString()
	{
		
		String message = (this.getAmi()==null)
						?this.nom+" n'a pas d'ami"
						:this.nom+" a pour ami "+this.getAmi().nom;
		
		return message;
	}

}
