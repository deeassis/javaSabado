package sistema;

import models.Carro;
import models.Moto;

public class Sistema {
	public static void main (String[] args) {
		
		Carro carro = new Carro();
		carro.setModelo("Polo Baixo");
		carro.acelerar();
		
		Moto moto = new Moto ();
		moto.setModelo("Gs R1200");
		moto.acelerar();
	}

}
