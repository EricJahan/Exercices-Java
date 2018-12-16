package Exercice_13_CaracChaine;

import java.util.Scanner;

import sun.launcher.resources.launcher;

public class Exercice_13_CaracChaine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		
		System.out.println("Veuillez entrer une phrase : ");
		String phrase = sc.nextLine();
		
		System.out.println("Indiquez une lettre : ");
		String lettre = sc.nextLine();
		
		
		for (int i=0; i<phrase.length(); i++) {
		
	if (phrase.charAt(i) == lettre.charAt(0)) 
		{
		count++;
		}
		}
	System.out.println("Il y a " + count + "x la lettre \""+ lettre + "\" dans : " + phrase);
	}

}


//String monString = "ceci est un exemple d'utilisation de la méthode toCharArray()";

//un tableau de char
//char[] chars = monString.toCharArray();