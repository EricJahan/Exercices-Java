import java.util.Scanner;

class Exercice_7_Boucle {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); //appel du scanner
		
		 System.out.println("Veuillez entrer un multiple");
		 int mult = sc.nextInt(); // entrée utilisateur
		 
		 System.out.println("Combien de multiple souhaitez-vous ?");
		 int nbMult = sc.nextInt(); // Deuxieme entrée utilisateur
		 
		 for (int i=1; i<=nbMult; i++) //Boucle jusqu'a nbMult
		 {
			 System.out.println(i*mult); //calcul à afficher
		 }
	}

}
