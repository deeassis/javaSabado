package models;

public class Adesivo {

	private String modelo;
	private String cor;
	private double quantidade;
	private double preco;
	
	//long => longo
	//max long => 6 sextalhoes
	//6.000.000.000.000.000.000
	private long id;
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public Double getQuantidade() {
		return this.quantidade;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getPreco() {
		return this.preco;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return this.id;
	}
	
	
}
