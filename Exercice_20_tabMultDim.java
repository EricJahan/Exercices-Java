package Exercice_20_tabMultDim;

class Exercice_20_tabMultDim {

	public static void main(String[] args) {
		
		int tab[][] = {{4, 89},{34, 234}}; //init du tableau deux dim
		int i, j; 
		
		for (i = 0; i < tab.length ; i++) { // parcour du tableau 1er
		for (j = 0 ; j < tab[i].length ; j++) // parcour du tableau 2eme
		
		System.out.println(tab[i][j]); // affichage des deux tableaux
	
		}
	}
}