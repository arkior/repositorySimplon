package polymorphismeTest;

public class Personne
{
	private String nom;
	private String prenom;
	private int age;
	
	
	public Personne(String unNom) 
	{
		this.nom = unNom;
	}
	
	public Personne(String unNom, String unPrenom) 
	{
		this(unNom);
		this.prenom = unPrenom;
	}
	
	public Personne(String unNom, String unPrenom, int unAge) 
	{
		this(unNom,unPrenom);
		this.age = unAge;
	}

}
