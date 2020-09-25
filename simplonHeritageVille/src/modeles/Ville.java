package modeles;

import java.util.ArrayList;

public class Ville 
{
	
	private String nom;
	private int nbHab;
	private static int nbrVille = 0;
	private static ArrayList<Ville>listeVilles = new ArrayList<>();
	
	
	

	public Ville(String unNom)
	{
		this.nom = unNom;
		Ville.nbrVille++;
		listeVilles.add(this);
		
		
	}
	
	
	public Ville(String unNom, int unNbrHab)
	{
		
		this.nom = unNom;
		this.nbHab = unNbrHab;
		Ville.nbrVille++;
		listeVilles.add(this);
		
	}
	
	
	public static String getDetailVilles() 
	{
		String message = "";
		for(Ville v : Ville.getListeVilles())
		{
			message += v.toString()+"\n";
		}
		
		return message;
	}
	

	public static ArrayList<Ville> getListeVilles()
	{
		return Ville.listeVilles;
	}


	public static int getNbrVille() {
		return nbrVille;
	}


	public String getNom()
	{
		return this.nom;
	}


	public void setNom(String nom)
	{
		this.nom = nom;
	}


	public int getNbHab()
	{
		return this.nbHab;
	}


	public void setNbHab(int nbHab)
	{
		this.nbHab = nbHab;
	}
	
	public String toString()
	{
		String nbreHbt = (this.getNbHab()==0)? " inconnu ": ""+this.getNbHab();
		return "Ville "+this.getNom() + " nombre d'habitants = "+ nbreHbt;
	}

}
