package Exercice_23_14Upgrade;

import java.util.Scanner;

class Exercice_23_14Upgrade {

	public static void main(String[] args) {
		uppCase("Transformatio en majuscule via m�thode :"); //cr�ation de la m�thode
	}
	static void uppCase(String Method) {
		Scanner sc = new Scanner(System.in); //init du scanner d'entrée

		System.out.println("Veuillez entrer un mot : "); // question
		String phrase = sc.nextLine(); // entrée utilisateur 

		System.out.println(phrase.toUpperCase());  // maj du mot entier 
		sc.close();
	}
}


