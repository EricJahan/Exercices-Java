
class Exercice_10_Table {

	public static void main(String[] args) {
		int tab1[] = {4,67,25,87};
		double tab2[] = {4.5,67,25.50,87.00};
		char tab3[] = {'r','2','?','+'};
		String tab4[] = {"Robert","Noemie","David","Bertrand"};
		System.out.println("Le premier élément du tab1 est : " + tab1[0]);
		
		tab1[2] = 42; //remplace la donnée  2 du tab1
		System.out.println("Nous avons remplacé la valeur 2 du tab1 qui était 25 par : " + tab1[2]); //Affiche le contenu remplacé de la donnée 2 du tab1
	
			for(int  i = 0; i < tab3.length; i++)
			{
				System.out.println("A l'emplacement " + i + " du tableau nous avons :" + tab3[i]);

			}
			System.out.println("La taille de tab1 est : " + tab1.length);
	}

}
