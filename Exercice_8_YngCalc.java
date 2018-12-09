package Exercice_8_YngCalc;

import java.util.Scanner;

class Exercice_8_YngCalc {
public static void main(String[] args) {
		
	int i= 1;
	int count = 0;
	int age= 1;
	
	Scanner sc = new Scanner(System.in);
		
	while(i<=20)
		{

			System.out.println("Veuillez indiquer votre âge :"); 
			age = sc.nextInt(); 
	if (age <20) 

			{
 			count++; 
			}
		i++; 
		}
		System.out.println("Il y a "+ count + " personnes de moins de 20 ans ");

	}

}
