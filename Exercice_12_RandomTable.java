class Exercice_12_RandomTable {

	public static void main(String[] args) {

		int alpha, beta, omega, zeta, vegeta;

		int tab1[] = {alpha, beta, omega, zeta, vegeta};
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = (int) (Math.random()*100 + 0);
		}
				
		System.out.println("Valeur de Alpha est : " + tab1[0]);
		System.out.println("Valeur de beta est : " + tab1[1]);
		System.out.println("Valeur de omega est : " + tab1[2]);
		System.out.println("Valeur de zeta est : " + tab1[3]);
		System.out.println("Valeur de vegeta est : " + tab1[4]);
		
	}
}
