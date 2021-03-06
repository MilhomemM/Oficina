package model;

public abstract class Veiculo {
	private Cliente proprietario;
	private String placa;
	private int ano;
	private String marca;
	private String modelo;
	private String cor;
	private String chassi;
	private String cidade;
	private String estado;

	public Veiculo(Cliente proprietario, String placa, int ano, String marca, String modelo, String cor, String chassi,
			String cidade, String estado) {
		super();
		this.proprietario = proprietario;
		this.placa = placa;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.chassi = chassi;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Cliente getProprietario() {
		return proprietario;
	}

	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean equals(Veiculo v) {
		if (this.getPlaca().equals(v.getPlaca()) || (this.getChassi().equals(v.getChassi())))
			return true;
		else
			return false;
	}
	
	public String toString(){
		String veiculo;
		veiculo = "Placa: " + this.getPlaca() + "\n" + "Marca: " + this.getMarca() + "\n" + 
		"Modelo: " + this.getModelo() + "\n" + "Cor: " + this.getModelo() + "\n" + "Chassi: " + this.getChassi() + "\n" +
		"Cidade: " + this.getCidade() + "\n" + "Estado: " + this.getEstado() + "\n";
		
		return veiculo;
	}
}
