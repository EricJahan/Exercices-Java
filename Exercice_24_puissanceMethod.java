package Exercice_24_puissanceMethod;
import java.util.Scanner;

class Exercice_24_puissanceMethod {

    public static void main(String[] args) {
        puissance("Calcul de puissance"); //cr�ation de la m�thode
    }
    static void puissance(String puissance) {
        Scanner sc = new Scanner(System.in); //init du scann
        
        System.out.println("Entrez un chiffre :");
        int entUs = sc.nextInt(); //entr�e utilisateur
        
        System.out.println(entUs + " Puissance 3 = " + Math.pow(entUs, 3.0)); //sortie du calcul
        sc.close(); // fermeture du scanner 
    }
}