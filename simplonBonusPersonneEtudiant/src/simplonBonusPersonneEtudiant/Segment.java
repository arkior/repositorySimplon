package simplonBonusPersonneEtudiant;

public class Segment
{
	private int abscisseA;
	private int abscisseB;
	private int valeur;
	
	
	public Segment(){}
	
	
	public String testSegment(int a,int b,int c) 
	{
		String message="";
		String message2="";
		int ordreValeur1=(a<0)?a:b;
		int ordreValeur2=(a>0)?a:b;
		this.abscisseA = a;
		this.abscisseB = b;
		this.valeur = c;
		if(a<0) 
		{
			this.abscisseA*= -1;	
		}
		else if (b<0)
		{
			this.abscisseB*=-1;
		}
		
		
		message2 =(this.valeur >ordreValeur1 &&  this.valeur <ordreValeur2)
				 ? this.valeur + " appartient au segment  ["+ordreValeur1+","+ordreValeur2+"] "
				 :this.valeur + " n'appartient pas au segment ["+ordreValeur1+","+ordreValeur2+"] ";
		

		message ="Longueur du segment ["+ordreValeur1+","+ordreValeur2+"] : "+ (this.abscisseA+this.abscisseB);
		
		return message+ "\n"+message2;
	}

}
