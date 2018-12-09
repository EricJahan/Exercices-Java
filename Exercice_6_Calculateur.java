import java.util.Scanner;

class Exercice_6_Calculateur {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez le premier nombre entre -1000 et 1000");
		int ent1 = sc.nextInt();
		
		System.out.println("Entrez le deuxième nombre entre -1000 et 1000");
		int ent2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Entrez votre opérateur");
		String operateur = sc.nextLine();
		
		if ((ent1 >= -1000) && (ent1 <= 1000) && (ent2 >= -1000) && (ent2 <= 1000))
		{
			switch (operateur)
			{
				case "+":
					System.out.println(ent1 + " + " + ent2 + " = " + (ent1 + ent2));
					break;
				case "*":
					System.out.println(ent1 + " x " + ent2 + " = " + (ent1 * ent2));
					break;
					
				case "-":
					System.out.println(ent1 + " - " + ent2 + " = " + (ent1 - ent2));
					break;
					
				case "/":
					if ((ent1 !=0) && (ent2 !=0)) 
					{
					System.out.println(ent1 + " / " + ent2 + " = " + (ent1 / ent2));	
					}
					else 
					{
					System.out.println("On ne peut pas diviser par 0 !");
					}
					break;
				default:
					System.out.println("mauvais opérateur entrée : addition faite.");
					System.out.println(ent1 + " + " + ent2 + " = " + (ent1 + ent2));
			}
		}
		else 
			{
				System.out.println("!!! WARNING !!! Self-destruction initiated !!!");
				int leTempsEnMillisecondes=500;
		         
				//décompte récupéré sur internet
		        for (int i=10;i>0;i--) {// de 10 => à 0 
		            try {
		                Thread.sleep (leTempsEnMillisecondes);
		            }
		            catch (InterruptedException e) {
		                System.out.print("Erreur");
		            }
		            System.out.print(""+i+" ");
			}
		
		}
		
	}
}
