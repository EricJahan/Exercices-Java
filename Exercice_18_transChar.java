package Exercice_18_transChar;

import java.util.Scanner;

class Exercice_18_transChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.println("Entrez un nombre entre 1 et 256");
		int entUs = sc.nextInt(); //entrée util
		
	if (entUs > 0 && entUs < 256) //limites 
	{
		
		char pouyu = (char) entUs; // comp des carac

		
		System.out.println(entUs);
		System.out.println(pouyu);
	}
	
	else 
		{
		System.out.println("Mauvaise entrée saisie");
		}
	
	}

}
