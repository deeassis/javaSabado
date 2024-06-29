package sistema;

import models.Veiculo;

public class Carro {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo("audi");
		//variavel de referencia 
		Veiculo c;
		//new = vira um objeto e passa atre caracteristicas
		c = new Veiculo("Marca");
		
		//array de objetos
		// 0,1,2,3,4
		Veiculo[] veiculos = new Veiculo[5];
		
		//criando objeto
		Veiculo veiculo = new Veiculo("Mitsubish");
		veiculo.cor = "verde";
		veiculo.qtdRodas = 42;
		
		veiculos[2] = veiculo; //armazenando veiculo na posição2
		Veiculo veiculos2 = new Veiculo ("gwm");
		veiculos2.cor = "preto";
		veiculos2.qtdRodas = 4;
		
		
		
		veiculos[3] = veiculos2;
		//lenght => tamanho
		//0 < 5
		for(int i =0; i < veiculos.length; i++) {
			System.out.println(veiculos[i].marca);
		}
	}
}
