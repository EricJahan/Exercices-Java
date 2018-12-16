package Exercice_23_14Upgrade;

import java.util.Scanner;

class Exercice_23_14Upgrade {

	public static void main(String[] args) {
		uppCase("Transformatio en majuscule via méthode :"); //création de la méthode
	}
	static void uppCase(String Method) {
		Scanner sc = new Scanner(System.in); //init du scanner d'entrÃ©e

		System.out.println("Veuillez entrer un mot : "); // question
		String phrase = sc.nextLine(); // entrÃ©e utilisateur 

		System.out.println(phrase.toUpperCase());  // maj du mot entier 
		sc.close();
	}
}


