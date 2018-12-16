
package Exercice_15_majChaine;

import java.util.Scanner;

public class Exercice_15_majChaine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un mot : ");
        String pouya = sc.nextLine();
        if (pouya.length() > 5) {
        System.out.println(pouya.substring(pouya.length() -3));
        System.out.println(pouya.substring(2, pouya.length() -3));
        }
        else {
        	System.out.println("Tu sais pas lire une consigne ?!?!");
        }
    }
}