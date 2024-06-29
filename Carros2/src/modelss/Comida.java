package modelss;

public class Comida {

	public String sabor;
	public String cor;
	public String peso;
	public int qtt;

	public void esfria() {
		System.out.println("Esfriando ... sshhhh");
	}

	@Override
	public String toString() {
		return "Sabor: " + this.sabor + ", Cor: " + this.cor + ", Peso: " + this.peso +", Qtd: " + this.qtt;
	}

}


