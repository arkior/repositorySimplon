package personne;

public class EssaiAmi {

	public static void main(String[] args) {
		
		Personne personneSeule,ami1,ami2;
		personneSeule = new Personne("Suzanne");
		ami1 = new Personne("Francois");
		ami2 = new Personne("Marc",ami1);
		ami1.setAmi(ami2);
		System.out.println(personneSeule);
		System.out.println(ami1);
		System.out.println(ami2);
		
		
		

	}

}
