
package sistema;

	import models.Cliente;

	public class Sistema {

		public static void main(String[] args) {
			Cliente meuCliente = new Cliente();
			meuCliente.nome = "Denise Assis";

			// 0, 1, 2, 3, => 4
			Cliente[] clientes = new Cliente[4];
			clientes[0] = meuCliente;

			// colocar um cliente na posição 2

			Cliente novoCliente = new Cliente();
			novoCliente.nome = "Arthur Rosa";
			clientes[1] = novoCliente;

			// Agora, o array clientes contém dois clientes:
			// clientes[0] -> meuCliente (Denise Assis)
			// clientes[1] -> novoCliente (Arthur Rosa)

			for (int i = 0; i < 4; i++) 
				if (clientes[i] != null) {
					System.out.println(clientes[i].nome);
				} else {
					System.out.println("Não encontrado");
				}
			}

		}

