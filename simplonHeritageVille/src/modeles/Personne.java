package modeles;

public class Personne
{
	
	private String nom;
	private String prenom;
	private int age;
	private char sexe;
	
	
	public Personne(String unNom,String unPrenom, char unSexe) 
	{
		this.nom = unNom;
		this.prenom = unPrenom;
		this.sexe = unSexe;
	}


	public int getAge() 
	{
		return this.age;
	}
	
	


	public char getSexe()
	{
		return this.sexe;
	}


	public void setAge(int unAge) {
		this.age = age;
	}


	public String getNom() {
		return this.nom;
	}


	public String getPrenom() {
		return this.prenom;
	}
	
	public String toString() 
	{
		String identite = (this.getSexe()== 'F')?" Madame ": " Monsieur";
		String president =  (this.getSexe()== 'F')?" la presidente":" le president";
		return president+ " est " +identite+" " + this.getNom() + " "+ this.getPrenom();
	}

}
