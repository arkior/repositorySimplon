package restaurant;


public class Menu

{
	private Legume accompagnement;
	private Boisson boisson;
	private Viande viande;
	
	public Menu() {}
	
	public String menuBoeuf(int unAccompagnement ) 
	{
		
		viande = new Viande();
		accompagnement = new Legume();
		String legume = "";
		
		switch(unAccompagnement)
		{
		case 65 : 
			legume = this.accompagnement.getLegumesFrais();
			break;
		case 66 : 
			legume = this.accompagnement.getRiz();
			break;
		case 67 : 
			legume = this.accompagnement.getFrites();
			break;
		}
		
		

		return "votre menu contient : \n-"
				+viande.getBoeuf()
				+"\n-"+legume
				+"\n-boisson non comprise dans ce menu\n"
				+"prix  :  9 euros";
	}
	
	public String menuPoulet(int unAccompagnement, int uneBoisson) 
	{
		viande = new Viande();
		accompagnement = new Legume();
		boisson = new Boisson();
		String legume = "";
		String boissonPrise = "";
		
		switch(unAccompagnement)
		{
		case 65 : 
			legume = this.accompagnement.getLegumesFrais();
			break;
		case 66 : 
			legume = this.accompagnement.getRiz();
			break;
		case 67 : 
			legume = this.accompagnement.getFrites();
			break;
		}
		
		
		switch(uneBoisson)
		{
		case 65 : 
			boissonPrise = this.boisson.getEauPlate() ;
			break;
		case 66 : 
			boissonPrise = this.boisson.getEauGazeuse();
			break;
		case 67 : 
			boissonPrise = this.boisson.getSoda();
			break;
		}
		
		
		return  "votre menu contient : \n-"
		+viande.getPoulet()
		+"\n-"+legume
		+"\n-"+boissonPrise
		+"\nprix  :  9 euros";
	}
	
	public String menuVegetarien(int unAccompagnement, int uneBoisson , int supplement) 
	{

		
		accompagnement = new Legume();
		boisson = new Boisson();
		String legume = "";
		String boissonPrise = "";
		String riz = "";
		
		riz =(supplement == 65) ?accompagnement.getRiz()+ " (votre supplement)":"vous n'avez pas pris de supplement";
		
		
		switch(unAccompagnement)
		{
		case 65 : 
			legume = this.accompagnement.getLegumesFrais();
			break;
		case 66 : 
			legume = this.accompagnement.getRiz();
			break;
		case 67 : 
			legume = this.accompagnement.getFrites();
			break;
		}
		
		
		
		
		switch(uneBoisson)
		{
		case 65 : 
			boissonPrise = this.boisson.getEauPlate() ;
			break;
		case 66 : 
			boissonPrise = this.boisson.getEauGazeuse();
			break;
		case 67 : 
			boissonPrise = this.boisson.getSoda();
			break;
		}
		
		return  "votre menu contient : "
		+"\n-"+legume
		+"\n-"+boissonPrise
		+"\n-"+riz+"\n"
		+"prix  :  9 euros";
	}
	
	
	
	

}
