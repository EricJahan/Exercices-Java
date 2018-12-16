package Exercice_14_transMaj;

import java.util.Scanner;

public class Exercice_14_transMaj {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //init du scanner d'entrée

		System.out.println("Veuillez entrer un mot : "); // question
		String phrase = sc.nextLine(); // entrée utilisateur 

		System.out.println(phrase.toUpperCase());  // maj du mot entier 

		String uppCase = ""; 
		Scanner lineScan = new Scanner(phrase); //scanning de la phrase entrée 
		/*while(lineScan.hasNext()) //boucle de scan
		{
			String word = lineScan.next(); //
			uppCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; // 
		}
		System.out.println(uppCase.trim());*/
	}
}