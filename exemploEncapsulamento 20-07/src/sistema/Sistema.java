package sistema;

import java.util.ArrayList;
import java.util.Scanner;

import model.Pessoa;

public class Sistema {

	static ArrayList<Pessoa> pessoas = new ArrayList<>();

	public static int gerarProximoId() {

		int id = 0;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getId() > id) {
				id = pessoa.getId();
			}
		}
		return id + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Bem-Vindo ao Sistema");
			System.out.println("1. Adicionar Pessoa");
			System.out.println("2. Listar");
			System.out.println("3. Atualizar");
			System.out.println("4. deletar");
			System.out.println("9. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				Pessoa p = new Pessoa();
				System.out.println("Qual o nome ?");
				p.setNome(sc.next());
				System.out.println("Qual o CPF ?");
				p.setCpf(sc.next());
				System.out.println("Qual a idade ?");
				p.setIdade(sc.nextInt());
				System.out.println("Qual o tipo de cabelo ?");
				p.setCabelo(sc.next());
				System.out.println("Estado de vida da pessoa cadastrada: Está atualmente viva? (true/false) ");
				p.setVivo(sc.nextBoolean());
				
				
				p.setId(gerarProximoId()); // Define o ID único da pessoa
				pessoas.add(p);

				System.out.println("Pessoa Cadastrada");
				System.out.println("-------------------------------");

				break;
			}

			case 2: {
				// listar
				if (pessoas.isEmpty()) { // Verifica se a lista está vazia
					System.out.println("Nada para listar");
					System.out.println("");
				} else {

					for (Pessoa pessoa : pessoas) {
						System.out.println("Código ID: " + pessoa.getId());
						System.out.println("Nome: " + pessoa.getNome());
						System.out.println("Cpf: " + pessoa.getCpf());
						System.out.println("Idade: " + pessoa.getIdade());
						System.out.println("Tipo de cabelo: " + pessoa.getCabelo());
						System.out.print("Estado de vida: ");
						
						if(pessoa.isVivo()) {
							System.out.print("Vivo");
						}else {
							System.out.print("Morto");
						}
						System.out.println("");
						System.out.println("-------------------------------");
					}
				}
				break;
			}
			case 3: {
				// atualizar
				System.out.println("Digite o ID para atualizar");
				int idAtualizar = sc.nextInt();

				Pessoa pessoaAtualizada = new Pessoa();

				System.out.println("Qual o seu nome? ");
				pessoaAtualizada.setNome(sc.next());

				System.out.println("Qual o seu Cpf?");
				pessoaAtualizada.setCpf(sc.next());
				
				System.out.println("Qual o estado de vida ? true(vivo) false(morto)");
				
				System.out.println("Pessoa atualizada com sucesso!");
				System.out.println("-------------------------------");

				// Itera sobre a lista de pessoas e atualiza a pessoa com o ID correspondente
				for (Pessoa pessoa : pessoas) {
					if (pessoa.getId() == idAtualizar) {
						pessoaAtualizada.setId(pessoa.getId()); // Mantém o mesmo ID
						pessoas.set(pessoas.indexOf(pessoa), pessoaAtualizada); // Atualiza o adesivo na lista
					}
				}
				break;
			}
			case 4: {
				// deletar
				System.out.println("Qual Id deseja deletar ?");
				 int idDeletar = sc.nextInt(); 
				 
				 pessoas.removeIf(pessoa -> pessoa.getId() == idDeletar);
				 
				break;
			}

			case 9: {
				System.exit(0);
				break;

			}
			
			default: // Caso padrão: Opção inválida
                System.out.println("Opção inválida! Tente novamente.");
                System.out.println("");

			}
		} while (true);

	}

}
