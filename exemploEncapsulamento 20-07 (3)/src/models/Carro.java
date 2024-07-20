package models;

public class Carro extends Veiculo {
	private String som;
	private boolean airbag;
	private boolean suspensaoAr;
	private String PortaMala;

	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public boolean isSuspensaoAr() {
		return suspensaoAr;
	}

	public void setSuspensaoAr(boolean suspensaoAr) {
		this.suspensaoAr = suspensaoAr;
	}

	public String getPortaMala() {
		return PortaMala;
	}

	public void setPortaMala(String portaMala) {
		PortaMala = portaMala;
	}


}
