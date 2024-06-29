import java.util.Scanner;

public class MeuSisteminha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		do {
			System.out.println("Menu - Adesivos");
			System.out.println("1 - Cadastrar Adesivo");
			System.out.println("9 - Sair");
			int opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Nome do Adesivo: ");
				String s = " ";
				s = sc.nextLine();
				s += sc.nextLine();
				System.out.print("Preço do Adesivo: R$ ");
				double preco = sc.nextDouble();

				System.out.println(" ");

				System.out.println("Adesivo cadastrado com sucesso!");

			}
			if (opcao == 9) {
				i = 9;
				System.out.println("saindo ...");
			}
		} while (i != 9);


	}

}
