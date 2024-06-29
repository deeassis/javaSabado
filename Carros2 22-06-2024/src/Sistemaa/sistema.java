package Sistemaa;

import java.util.ArrayList;
import java.util.Scanner;

import modelss.Comida;


public class sistema {

	public static void main(String[] args) {
		
		//[]
		ArrayList<Comida> comidas = new ArrayList<Comida>();
		//<>
		//ArrayListe < TYPE > +> Dentro do operador diamante é o tipo
		
		int opcao = 0;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				menu();
				opcao = sc.nextInt();
				if (opcao == 1) {
					//criar
					/***
					 * sabor;
					 * cor;
					 * peso;
					 * qtt;
					 */
					Comida comida = new Comida();
					System.out.println("Qual o sabor?");
					comida.sabor = sc.next();
					System.out.println("Qual a cor?");
					comida.cor = sc.next();
					System.out.println("Qual o peso?");
					comida.peso = sc.next();
					System.out.println("Qual a qtt?");
					comida.qtt = sc.nextInt();
					
					//add outro obj a lista
					comidas.add(comida);
				}else if (opcao ==2 ) {
					//listar a nossa lsita
					//foreach
					//onjeto individual: lista de objetos
					for(Comida comida : comidas){
						System.out.println(comida);
					}
					
					}
			}while (opcao != 9);
		}
	}
	
	static void menu() {
		System.out.println("1- Cadastrar");
		System.out.println("9 - Sair");

		
	}
	

}
