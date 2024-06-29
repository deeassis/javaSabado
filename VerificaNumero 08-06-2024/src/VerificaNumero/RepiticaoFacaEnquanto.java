package VerificaNumero;

import java.util.Scanner;

public class RepiticaoFacaEnquanto {

	public static void main(String[] args) {
		// FOR - WHILE - DO WHILE
		// REPITA ENQUANTO OU FAÇA ENQUANTO

		int i = 0;
		Scanner sc = new Scanner(System.in);
		//Monkey type -> treinar digitação 
		do {
			System.out.println("Menu - Pizza");
			System.out.println("1 - Cadastrar Pizza");;
			System.out.println("9 - Sair");
			int opcao = sc.nextInt();
			//cadastrar pizza
			
			if (opcao == 1) {
			System.out.println("Nome da Pizza: ");
			//mussarela, abacaxi, portuguesa
			//calabresa, modaDoChefe, romeu e julieta 
			String nome = sc.next();
			System.out.println("Preço da Pizza: ");
			double preco = sc.nextDouble();
		}
		if (opcao == 9) {
			i = 9;
			System.out.println("saindo ...");
		}
		}while(i != 9);
	}
	}
