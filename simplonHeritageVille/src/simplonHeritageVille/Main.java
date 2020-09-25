package simplonHeritageVille;

import modeles.Capital;
import modeles.Pays;
import modeles.Personne;
import modeles.Ville;

public class Main {

	public static void main(String[] args)
	{
		Ville v1 = new Ville("Lyon", 15000000);
		Ville v2 = new Ville("Nice");
		//Ville v3 = new Ville("saint etienne", 1258672);
		//Ville v4 = new Ville(, 1);
		Personne presidentfrance = new Personne("Gautherot","christophe", 'M');
		Personne presidentAllemagne = new Personne("Merkel", "angela",'F');
		Pays france = new Pays("France",presidentfrance );
		Pays allemagne = new Pays("Allemagne",presidentAllemagne);
		Capital c1 = new Capital("Paris",france,100000000);
		Capital c2 = new Capital("Berlin",allemagne);
		
		
		
	
		
		System.out.println(Ville.getDetailVilles());
		
		System.out.println("\n*********************************************\n          VILLE(S) INSTANCIEE(S)\n*********************************************\n");
		System.out.println("le nombre de ville instancie "+Ville.getNbrVille());
    }

}
