package simplonExoTableaux;

import java.util.Arrays;

public class simplonTableau {
	
	public static int[][]somme(int[][]a, int[][]b)
	{
		int[][]tabFinal = new int[ a.length][a[0].length];
		for(int i =0; i< a.length;i++) 
		{
			for(int y = 0; y<a[i].length;y++) 
			{
				tabFinal[i][y]= a[i][y]+ b[i][y];
			}
		}

		return tabFinal;
	}
	
	
	public static void echange(int[][]m,int i1, int j1, int i2,int j2) 
	{
		
			int temp = m[i1][j1];
			m[i1][j1] =m[i2][j2];
			m[i2][j2] = temp;	
	}
	
	public static int[][] transposee(int[][]m)
	{
		int i1= m.length;
		int j1 =m[0].length;
		

		int [][]m1 = new int [j1][i1];
		
		for(int i = 0;i<m1.length;i++)
		{
			for(int y = 0;y<m1[i].length;y++) 
			{
				
				m1[i][y]=m[y][i];

			}
		}
		
		return m1;
	}
	
	public static void retourneeEtTransposee(int[][]m)
	{
		int i1= m.length;
		int j1 =m[0].length;
		

		int [][]m1 = new int [j1][i1];
		
		for(int i =0; i< m1.length;i++) 
		{
			for(int y = 0; y<m1[i].length;y++) 
			{
				m1[i][y]=m[y][i];
				System.out.print(m1[i][y]);
			}
			System.out.println();
		}
		
		
	}
	/*
	public static int[][] retourneeEtTransposee(int[][]m) 
	{
		int i1= m.length;
		int j1 =m[0].length;
		
		
	    
	 
	    for(int i=0; i< m.length; i++)
	    {
	    	for(int y = 0;y<m[i].length/2;y++)
	    	{
	    		int tmp = m[i][y];
	    		m[i][y] = m[m.length-i-1][m[i].length-y-1];
	    		m[m.length-i-1][m[i].length-y-1] = tmp;
	    		
	    		
	    		//aux =t[i][j];
	    		//t[i][j]=t[i][m-i+1]
	    		//t[i][j]=aux;
	    		
	    		
	    		System.out.print(m[i][y]);
			}
			System.out.println();
	    }		
	}
		
*/
	public static void echangeLignes(int[][]m, int i1, int i2)
	{
		
		for(int i =0; i< m.length;i++) 
		{
			for(int y = 0; y<m[i].length;y++) 
			{
				if(i == i1)
				{
					int[]tbaTampon = new int[m[i].length];
					
					tbaTampon[i] = m[i][y];
					m[i][y]= m[i2][y];
					m[i2][y] = tbaTampon[i];
					
				}

				System.out.print(m[i][y]);
			}
			System.out.println();
		}

	}
	
	
	public static int[][]produit(int[][]a, int[][]b)
	{
		int [][]resultat = new int[a.length][a[0].length];
		
		
		for(int i = 0 ; i<a.length;i++) 
		{
			for(int y = 0;y<a[i].length;y++) 
			{
				resultat[i][y]= a[i][y]*b[i][y];
			}
		}
		
		
		return resultat;
	}
	
	
	
	public static int plusGrandeColonne(int[][]tab)
	{
		 
		
		 int maxVal =0;
		int []tableauDesSommes = new int[tab[0].length];
		int indiceMax = 0;
		
		
		

		for (int i = 0; i < tab[0].length; i++)
		{
		int compteur= 0;

		for (int j = 0; j < tab.length; j++)
		{
		compteur += tab[j][i];

		}
		tableauDesSommes[i] = compteur;
		System.out.println("Colonne numero  : " + (i+1) + " somme : "+compteur);

		}

		
		
		indiceMax = valeurMax(tableauDesSommes);
		
		
		return indiceMax;
	}
	
	
	public static int valeurMax(int[]tab) 
	{
		int maxVal= tab[0];
		int indice = 0;;
		for(int i = 0; i < tab.length; i++)
		{

		         if( tab[i]> maxVal)
		         {
		        	 maxVal=tab[i];
		           indice = i;
		         }
			
		}
		return indice;
	}

	public static void main(String[] args)
	{
	    int[] tabTest = {1, 2, 3, 4, 5, 6};
	    System.out.println("Tableau avant l'inversion: " + Arrays.toString(tabTest));
	 
	    for(int i=0; i< tabTest.length/2; i++){
	        int tmp = tabTest[i];
	        tabTest[i] = tabTest[tabTest.length-i-1];
	        tabTest[tabTest.length-i-1] = tmp;
	    }
	    System.out.println("Tableau après l'inversion: " + Arrays.toString(tabTest));
		
		
		
		System.out.println("\n****************************** TABLEAU 1-10 (INITIALISATION A LA DECLARATION) *************************************\n");
		
		int[]tab = {1,2,3,4,5,6,7,8,9,10};
		
		for( int i =0 ; i<tab.length;i++) 
		{
			
			System.out.println("l'element a l'index numero :  "+i+"  a pour valeur :  "+ tab[i]);
		}
		System.out.println("\n");
		
		System.out.println("\n****************************** TABLEAU 1-10 (INITIALISATION AVEC BOUCLE) *************************************\n");
				
				int[]tab1= new int[10] ;
				
				for( int i =0 ; i<tab.length;i++) 
				{
					tab1[i]=(i+1);
					System.out.println("l'element a l'index numero :   "+i+"   a pour valeur :  "+ tab[i]);
				}
				System.out.println("\n");
				
		System.out.println("\n****************************** SOMME DES ELEMENTS D'UN TABLEAU *************************************\n");
				int somme = 0;
				for( int i =0 ; i<tab.length;i++) 
				{
					System.out.println("j'additionne " +somme+" + "+ tab1[i] + " ma valeur qui se trouve index : " +i);
					somme+= tab1[i];
					
					
				}
				System.out.println("la valeur de mon tableau est de :"+ somme);
				
				
		System.out.println("\n");
		
		System.out.println("\n****************************** SOMME DES MATRICES A ET B *************************************\n");
		
		int[][]tab2= new int[5][5] ;
		int[][]tab3= new int [5][5];
		System.out.println("contenu de mon tableau:  tab2 ");
		int somme2=0;
		for(int i =0; i< tab2.length;i++) 
		{
			for(int y = 0; y<tab2[i].length;y++) 
			{
				tab2[i][y]=(y+1);
				somme2+=tab2[i][y];
				System.out.print(tab2[i][y]);
			}
			System.out.println();
		}
		System.out.println("somme de mon tab2 : "+ somme2);
		
		System.out.println("contenu de mon tableau:  tab3 ");
		int somme3=0;
		for(int i =0; i< tab3.length;i++) 
		{
			for(int y = 0; y<tab3[i].length;y++) 
			{
				tab3[i][y]=(i+1);
				somme3+=tab2[i][y];
				System.out.print(tab3[i][y]);
			}
			System.out.println();
		}
		System.out.println("somme de mon tab2 : "+ somme3);
		
		System.out.println("la somme de mon tableau tab2 + tab3 = "+(somme2 + somme3));
		
		System.out.println("\n****************************** SOMME DES MATRICES DE DEUX TABLEAUX DEUX DIMENSIONS  PASSES EN PARAMETRE DE SOMME()*************************************\n");

		
		 int [][]tab4 = somme(tab2, tab3);
		 System.out.println("contenu de mon tableau:  tab4 ");
			int somme4=0;
			for(int i =0; i< tab4.length;i++) 
			{
				for(int y = 0; y<tab4[i].length;y++) 
				{
					somme4+=tab4[i][y];
					System.out.print(tab4[i][y]);
				}
				System.out.println();
			}
			
			System.out.println("la somme de mon tableau tab4 = "+somme4);
		 
			System.out.println("\n****************************** PERMUTE DANS M LES ELEMENTS D'INDICES (I1,I1) avec (J2,J2)*************************************\n");
			int [][]tab5= { {4,4,4,4},{2,2,2,2} };
			
			System.out.println("\n****************tableau avant permute****************\n");
			
			for(int i =0; i< tab5.length;i++) 
			{
				for(int y = 0; y<tab5[i].length;y++) 
				{
					
					System.out.print(tab5[i][y]);
				}
				System.out.println();
			}
			
			//methode ECHANGE
			echange(tab5,1,2, 0,3);
			
			System.out.println("\n****************tableau apres  permute****************\n");
			
			for(int i =0; i< tab5.length;i++) 
			{
				for(int y = 0; y<tab5[i].length;y++) 
				{
					
					System.out.print(tab5[i][y]);
				}
				System.out.println();
			}
			
			
			System.out.println("\n****************************** MATRICE TRANSPOSEEE*************************************\n");
			
			int [][]tab6= new int [3][6];
			
			
			System.out.println("\n**************** MATRICE ORIGINAL ****************\n");
			for(int i =0; i< tab6.length;i++) 
			{
				for(int y = 0; y<tab6[i].length;y++) 
				{
					tab6[i][y]=(y+1);
					
					System.out.print(tab6[i][y]);
				}
				System.out.println();
			}
			
			System.out.println("\n**************** MATRICE TRANSPOSEE et RETOURNEE****************\n");
			
			int [][]tab7= transposee(tab6);
			
			for(int i =0; i< tab7.length;i++) 
			{
				for(int y = 0; y<tab7[i].length;y++) 
				{
					System.out.print(tab7[i][y]);
				}
				System.out.println();
			}
			 
			 
			 System.out.println("\n****************************** MATRICE TRANSPOSEEE*************************************\n");
			
			 retourneeEtTransposee(tab6);
			 
			 System.out.println("\n****************************** ECHANGE DE LIGNES*************************************\n");
			 int [][]tab8= new int [5][6];
			 System.out.println("\n**************** TABLEAU INITIALISE AVEC DES VALEURS****************\n");
			 
			 for(int i =0; i< tab8.length;i++) 
				{
					for(int y = 0; y<tab8[i].length;y++) 
					{
						tab8[i][y]=(i+1);
						
						System.out.print(tab8[i][y]);
					}
					System.out.println();
				}
			 
			 System.out.println("\n**************** ECHANGE DE LIGNE****************\n");
			 
			 echangeLignes(tab8,0,4);
			 
			 System.out.println("\n****************************** RETOURNE LE PRODUIT DES MATRICES A ET B *************************************\n");

			 
			 int [][]tabA= new int [1][3];
			 System.out.println("\n**************** VALEURS TABLEAU A****************\n");
			 for(int i =0; i< tabA.length;i++) 
				{
					for(int y = 0; y<tabA[i].length;y++) 
					{
						tabA[i][y]=2;
						
						System.out.print(tabA[i][y]);
					}
					System.out.println();
				}
			 
			 System.out.println("\n**************** VALEURS TABLEAU B ****************\n");
			 int [][]tabB= new int [1][3];
			 for(int i =0; i< tabB.length;i++) 
				{
					for(int y = 0; y<tabB[i].length;y++) 
					{
						tabB[i][y]=4;
						
						System.out.print(tabB[i][y]);
					}
					System.out.println();
				}
			 
			 
			 System.out.println("\n**************** RESULTAT DU PRODUIT DE  (TABLEAU B  * TABLEAU B) ****************\n");

			  int [][]tab9 = produit( tabA,tabB);
			  for(int i =0; i< tab9.length;i++) 
				{
					for(int y = 0; y<tab9[i].length;y++) 
					{
						
						
						System.out.print(tab9[i][y]);
					}
					System.out.println();
				}
			  
			  
				System.out.println("\n****************************** RETOURNE LA COLONNE DE M  DONT LA SOMME EST LA PLUS GRANNDE*************************************\n");
				 int [][]tab10 = {{1,1,3},{1,2,30},{1,2,3}};
				
				
				 
				
				 
				 int indicePlusGrand = plusGrandeColonne(tab10);
				 
				 
					 System.out.println("la colonne dont la somme est la plus grande est la col"
					 		+ "*onne numero :  "+(indicePlusGrand+1));
				 
			  
			 
	}

	
}
