package Exercice_19_triBulles;

class Exercice_19_triBulles {

	public static void main(String[] args) {

		int tab[]= new int [8]; //init du tableau a 8 entrées

		for (int i = 0 ; i < tab.length ; i++) // boucle parcour tableau
		{
			tab[i] = (int) (Math.random() * 100 + 1); // génération du random entré dans le tab
			System.out.print(" " + tab[i]); // 
		}

		for(int i = 0 ; i < tab.length ; i++) //boucle parcours tab
		{

			for (int j = 0 ; j < tab.length-1 ; j++) //2boucle parcours pour trier
			{

				if (tab[j] > tab[j+1]) { //tri
					int temp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = temp;
				}
			}
		}
		System.out.println("\n");
		for (int i = 0 ; i < tab.length ; i++) 
		{

			System.out.print(" " + tab[i]); // afficher la boucle
		}
	}
}