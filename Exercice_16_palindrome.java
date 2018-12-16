package Exercice_16_palindrome;

import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

import com.sun.java.swing.plaf.motif.resources.motif;
import com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory;

public class Exercice_16_palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //appel du scanner
		String entUs; // variable d'entrée utilisateur
		
		System.out.println("Entrez un palindrome :"); //question
		entUs = sc.nextLine(); // enrtrée de la question
		
		int longueur = entUs.length(); // variable initialisé a la longueur du mot entré
		int i, debut, fin, mid;// variables de comparaisons et de base
		
		debut = 0; //variable commence a l'index zéro
		fin = longueur -1; // fin moins un a cause de l'index 0
		mid = (debut + fin)/2;//Divise le mot en deux pour avoir son milieu
		
		for (i = debut; i <= mid; i++) {//i parcour le mot du début au milieu et ajoute 1 a chaque lettre
			if (entUs.charAt(debut) == entUs.charAt(fin)) { // si le charactere du début est le même que le dernier
				debut++; // alors ajoute 1 a "debut"
				fin--;// alors ajoute 1 a "fin"
			}
			else { //sinon 
				break; // s'arrête
			}
		}
		if (i == mid + 1) { //si sont égaux alors 
			System.out.println("Bravo ! C'est bien un palindrome");
		}
		else { // si ils ne sont pas égaux alors 
			System.out.println("Vas regarder sur internet ce qu'est un palindrome.....");
		}
	}

}
