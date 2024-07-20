package models;

import sistema.MeiosDeLocomocao;

public class Veiculo extends MeiosDeLocomocao {

	private int rodas;
	private String cor;
	private String modelo;
	
	@Override
	public void locomover() {
		System.out.println("locomovendo ...");
	}
	public void acelerar() {
		System.out.println("acelerando.....");
		System.out.println("vrummmmmmmmmmmm");
	}
	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
