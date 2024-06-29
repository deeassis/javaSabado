package VerificaNumero;

public class Repeticao {

	public static void main(String[] args) {

		// For => Repita
		// Declarando, Condição, i = i + 1;
		for (int i = 0; i <= 10; i += 2) {

			System.out.print(" ");

		}

		for (int i = 0; i <= 5; i++) {
			System.out.println(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

		}

		System.out.println();
		for (int a = 5; a >= 0; a--) {
			System.out.println(" ");
			
			for (int b = 0; b <= a; b++) {
				System.out.print("*");
			}
		}

	}

}
