package sistema;

import java.util.Scanner;

import models.Veiculo;

public class Sistema2 {
	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner(System.in);

	
		Veiculo c = new Veiculo();
		

		
		System.out.println("Qual a marca do seu veiculo? ");
		String marca1 = sc.next();
		c.marca = marca1;

		System.out.println("Qual a cor do seu veiculo? ");
		String cor1 = sc.next();
		c.cor = cor1;

		System.out.println("Quantas rodas seu veículo possui? ");
		double qtdRodas1 = sc.nextDouble();
		c.qtdRodas = qtdRodas1;

		
		c.ligando(); // Chama o método 'acelerar' da instância 'c', simulando a aceleração do veículo
		c.acelerando(); // Chama o método 'parar' da instância 'c', simulando a parada do veículo
		c.escreverCarro(); // Chama o método 'escrever carro' da instância 'c'
		
		sc.close();
	}
}
