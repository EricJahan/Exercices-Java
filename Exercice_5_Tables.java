package timeTables;

import java.util.Scanner;

public class Exercice_5_Tables {
	public static void main(String[] args)
	{
		int ent1, ent2; //ajout des variables
		System.out.println("Which multiplication table would you like to see ?");//question affichée
		Scanner in = new Scanner(System.in);
		ent1=in.nextInt();	
		System.out.println("Here you are the multiplication table of " + ent1 + ":"); //rappel du multiplicateur demandé
		
		for (ent2=0; ent2<=10;ent2++) //boucle : s'arrête après 10 prints
		{
			System.out.println(ent1+" x " + ent2 + " = " + (ent1*ent2)); //ligne de calcul
		}
		{
			System.out.println("Multiplier fixed at 10"); //text de fin
		}
	}
}