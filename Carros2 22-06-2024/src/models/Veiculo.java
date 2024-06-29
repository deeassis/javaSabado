package models; // Declara que este arquivo pertence ao pacote 'models'

public class Veiculo { // Define a classe pública 'Veiculo'

	// Declaração de atributos da classe 'Veiculo'
	public String cor; // A cor do veículo
	public String marca; // A marca do veículo
	public double qtdRodas; // A quantidade de rodas do veículo

	public Veiculo(String marca) {
		this.marca = marca;
		System.out.println(marca);

	}

	// Método para escrever as informações do carro
	public void escreverCarro() {
		System.out.println("Salvando informações"); // Imprime uma mensagem no console
		System.out.println("Marca: " + this.marca); // Imprime a cor do veículo
		System.out.println("Cor: " + this.cor); // Imprime a marca do veículo
		System.out.println("QtdRodas: " + this.qtdRodas); // Imprime a quantidade de rodas do veículo
	}

	// Método para simular a parada do veículo
	public void acelerando() {
		System.out.println("Acelerando ... vruummm"); // Imprime uma mensagem no console indicando que o veículo está
														// parando
	}

	public void ligando() {
		System.out.println("Ligando o veículo "); // Imprime uma mensagem no console simulando o som da aceleração

	}

	public void escreverMarca() {
		System.out.println("Marca: " + this.marca);
	}

	public void escreverMarca(String modelo) {
		System.out.println("Marca: " + this.marca + modelo);
	}
}
