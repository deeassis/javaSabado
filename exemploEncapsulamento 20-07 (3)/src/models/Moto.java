package models;

public class Moto extends Veiculo {
	private boolean antenaDePipa;
	private boolean bau;
	private boolean grau;
	private boolean manete;

	@Override
	public void acelerar() {
		System.out.println("cortando de giro");
		System.out.println("randandandan");
	}

	public boolean isAntenaDePipa() {
		return antenaDePipa;
	}

	public void setAntenaDePipa(boolean antenaDePipa) {
		this.antenaDePipa = antenaDePipa;
	}

	public boolean isBau() {
		return bau;
	}

	public void setBau(boolean bau) {
		this.bau = bau;
	}

	public boolean isGrau() {
		return grau;
	}

	public void setGrau(boolean grau) {
		this.grau = grau;
	}

	public boolean isManete() {
		return manete;
	}

	public void setManete(boolean manete) {
		this.manete = manete;
	}

}
