package basico;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner canner = new Scanner(System.in);
		int opcao = 0;
		do {
			menu();
			opcao = canner.nextInt();

			double num1 = 0;
			double num2 = 0;

			switch (opcao) {
			case 1:
				System.out.println("Qual o primeiro número?");
				num1 = canner.nextDouble();

				System.out.println("Qual o segundo número?");
				num2 = canner.nextDouble();
				double resultado = somar(num1, num2);
				System.out.println(resultado);
				break;

			case 2:
				System.out.println("Qual o primeiro número?");
				num1 = canner.nextDouble();
				System.out.println("Qual o segundo número?");
				num2 = canner.nextDouble();
				double resultadoSubtrair = subtrair(num1, num2);
				System.out.println(resultadoSubtrair);
				break;

			case 3:
				System.out.println("Qual o primeiro número?");
				num1 = canner.nextDouble();
				System.out.println("Qual o segundo número?");
				num2 = canner.nextDouble();
				double resultadoDividir = dividir(num1, num2);
				System.out.println(resultadoDividir);
				break;
			case 4:
				System.out.println("Qual o primeiro número?");
				num1 = canner.nextDouble();
				System.out.println("Qual o segundo número?");
				num2 = canner.nextDouble();
				double resultadoMultiplicar	= multiplicar(num1, num2);
				System.out.println(resultadoMultiplicar);
				break;
			default:
				break;
			}
		} while (opcao != 9);
	}

	public static double somar(double num1, double num2) {
		double resultado = num1 + num2;
		return resultado;

	}

	public static double subtrair(double num1, double num2) {
		double resultadoSubtrair = num1 - num2;
		return resultadoSubtrair;

	}

	public static double dividir(double num1, double num2) {
		double resultadoDividir = num1 / num2;
		return resultadoDividir;
	}
	
	public static double multiplicar(double num1, double num2) {
		double resultadoMultiplicar = num1 * num2;
		return resultadoMultiplicar; }

	public static void menu() {
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Dividir");
		System.out.println("4 - Multiplicar");
		System.out.println("9 - Sair");
	}

}
