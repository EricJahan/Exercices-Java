package Exercice_9_AllAgeRem;

import java.util.Scanner;

class Exercice_9_AllAgeRem {

	public static void main(String[] args) 
	{
		//Déclaration de mes variables
		int totUsr = 1;
		int ent0_19 = 0; // variable pour entre 0 et 19 ans
		int ent20_40 = 0; // variable pour entre 20 et 40 ans
		int ent41_99 = 0; // variable pour entre 41 et 99 ans
		int ent100 = 0; // variable pour supérieur à 100 ans
		int entUs = 1;
		
		Scanner scan = new Scanner(System.in);
		
		while(totUsr <= 20)
		{
			System.out.println("Veuillez indiquer votre âge " + totUsr);
			entUs = scan.nextInt();
				if (entUs <= 100) 
				{
					if((entUs > 0) && (entUs <= 19))
					{
						ent0_19++; // sauvegarde de l'age si il se situe entre 0 et 19 ans (strictement inférieur a 20)
					}
					else if((entUs >= 20) && (entUs <= 39))
					{
						ent20_40++; //récupération et stockage de l'age si il se situe entre 20 et 39 ans (strictement inférieur a 40 ans)
					}
					else if ((entUs >= 40) && (entUs <= 99))
					{
						ent41_99++; //récupération et stockage de l'age si il se situe entre 41 et 99 ans (strictement inférieur a 40 ans)
					}
				}
				else {				
					ent100++;
					System.out.println("Vous avez indiqué un âge trop élevé. Le compte s'arrêtera ici.");
					break;
				}
		}
		System.out.println("Il y a " + ent0_19 + " personne(s) qui ont strictement moins de 20 ans.");
		System.out.println("Il y a " + ent20_40 + " personne(s) qui ont entre 20 et 39 ans.");
		System.out.println("Il y a " + ent41_99 + " personne(s) qui ont entre 40 et 99 ans.");
		System.out.println("Il y a " + ent100 + " personne de plus de 100 ans parmis vous qui tente de se rajeunir !!");
	}

}
