package sistema; // Declara que este arquivo pertence ao pacote 'sistema'

import java.util.Scanner;

import models.Veiculo; // Importa a classe 'Veiculo' do pacote 'models'

public class Sistema { // Define a classe pública 'Sistema'

	public static void main(String[] args) { // Define o método principal que será executado ao iniciar o programa
		// Cria uma instância da classe 'Veiculo' e a armazena na variável 'v'
		Veiculo v = new Veiculo();
		v.cor = "candy red"; // Define a cor do veículo 'v'
		v.qtdRodas = 4; // Define a quantidade de rodas do veículo 'v'
		v.marca = "Rolls Royce"; // Define a marca do veículo 'v'
		v.ligando(); // Chama o método 'acelerar' da instância 'v', simulando a aceleração do veículo
		v.acelerando(); // Chama o método 'parar' da instância 'v', simulando a parada do veículo
		v.escreverCarro();

		// Cria outra instância da classe 'Veiculo' e a armazena na variável 'c'
		Veiculo c = new Veiculo();
		c.cor = "amarelo"; // Define a cor do veículo 'c'
		c.qtdRodas = 4; // Define a quantidade de rodas do veículo 'c'
		c.marca = ("Lamborghini");
		c.ligando(); // Chama o método 'acelerar' da instância 'c', simulando a aceleração do veículo
		c.acelerando(); // Chama o método 'parar' da instância 'c', simulando a parada do veículo
		c.escreverCarro(); // Chama o método 'escrever carro' da instância 'c'

	}
}