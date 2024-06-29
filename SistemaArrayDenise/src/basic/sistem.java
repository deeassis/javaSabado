package basic;

import java.util.ArrayList;
import java.util.Scanner;

import models.Adesivo; // Importa a classe Adesivo do pacote models

public class sistem { // Declaração da classe sistem (nome deveria ser System ou outro nome
						// significativo)
	static ArrayList<Adesivo> adesivos = new ArrayList<Adesivo>(); // Cria um ArrayList para armazenar objetos da classe
	// Adesivo

	public long gerarProximoId() {
		long contador = 0;

		for(Adesivo adesivo : adesivos) {
			//1
			if(adesivo.id> contador) {
				contador = adesivo.id;
		}
		}
		return contador + 1;
	}

	public static void main(String[] args) { // Método principal main
		Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
		boolean funcionando = true; // Variável para controlar se o programa deve continuar rodando

		do { // Inicia um loop do-while para o menu do programa
			System.out.println("Sistema de Gerenciamento de Adesivos de Moto");
			System.out.println("");
			System.out.println("1 - Adicionar adesivos");
			System.out.println("2 - Listar adesivos");
			System.out.println("9 - Sair"); // Exibe opção para sair
			System.out.println("");
			System.out.print("Escolha uma opção: ");
			int opcao = sc.nextInt(); // Lê a opção do usuário

			switch (opcao) { // Inicia um switch para lidar com a opção escolhida
			case 1: {
				Adesivo adesivo = new Adesivo();
				System.out.println("Qual o modelo do adesivo ?");
				adesivo.modelo = sc.next();
				System.out.println("Quais as cores disponiveis?");
				adesivo.cor = sc.next();
				System.out.println("Quantas unidades disponiveis?");
				adesivo.quantidade = sc.nextDouble();
				System.out.println("Qual o valor?");
				adesivo.preco = sc.nextDouble();

				adesivos.add(adesivo);

				System.out.println("Adesivo adicionado com sucesso!");
				System.out.println("-------------------------------");
				break;
			}

			case 2: {
				// Listar
				// Objeto : Lista do objeto
				for (Adesivo adesivo : adesivos) {
					System.out.println("Modelo: " + adesivo.modelo);
					System.out.println("Cor: " + adesivo.cor);
					System.out.println("Quantidades disponiveis: " + adesivo.quantidade);
					System.out.println("Preço: R$ " + adesivo.preco);
					System.out.println("-------------------------------");

				}
				break;
			}

			case 9: { // Caso a opção seja 9
				System.out.println("saindo do sistema ...");
				System.out.println("---------------------");
				funcionando = false; // Define funcionando como false para sair do loop
				break; // Sai do switch
			}
			default:
				System.out.println("Opção inválida! Tente novamente.");
				System.out.println("");
			}
		} while (funcionando != false); // Continua o loop enquanto funcionando for true

		// Fecha o Scanner para liberar recursos
		sc.close();
	}
}
