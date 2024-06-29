package VerificaNumero;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		
		int i = 0;
		//Enquanto, i for menor que 10
		//codigo executa
		
		//!= diferente
		
		Scanner canner = new Scanner (System.in);
		while (i != 9) {
			System.out.println("MENU TESTE");
			System.out.println("9 - SAIR");
			i = canner.nextInt();
		switch (i) {
		case 9: {
			System.out.println("Saindo do sistema");
			break;
		}
		default:
			System.out.println("Opçao invalida");
			
		}
		}

	}

}
