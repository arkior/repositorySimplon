package restaurant;


public class Acceuil {
	
	
	
	public static int choixSupplementRiz()
	{

		Utilisateur user = new Utilisateur();
		return user.choixSupplement();
	}
	
	public static int choixBoisson()
	{
		Utilisateur user = new Utilisateur();
			return user.choixUtilisateurBoisson();
	}
	
	public static int choiAccompagnement() 
	{
		
		Utilisateur user = new Utilisateur(); 		
		return user.choixUtilisateurAccompagnement();
	}

	public static void main(String[] args)
	{
		Utilisateur user = new Utilisateur();
			int choix = user.choixMenu();
		
		switch(choix) 
		{
		case 65:
			int unAccompagnement= choiAccompagnement();
			Menu menu = new Menu();
			System.out.println(menu.menuBoeuf(unAccompagnement));
			break;
		case 66:
			 unAccompagnement = choiAccompagnement();
			int uneBoisson = choixBoisson();
			 menu = new Menu();
			System.out.println(menu.menuPoulet(unAccompagnement,uneBoisson));
			break;
		case 67 : 
			 unAccompagnement = choiAccompagnement();
			int unSupplement = choixSupplementRiz();
			 uneBoisson = choixBoisson();
			 menu = new Menu();
			System.out.println(menu.menuVegetarien(unAccompagnement,uneBoisson,unSupplement));
			break;
		}
	

	}

}
