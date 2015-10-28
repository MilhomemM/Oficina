package model;

public abstract class Veiculo {
	private Cliente proprietario;
	private Veiculo veiculo;
	private int ano;
	private String marca;
	private String modelo;
	private String cor;
	private String chassi;
	private String cidade;
	private String estado;

	public Veiculo(Cliente proprietario, Veiculo veiculo, int ano, String marca, String modelo, String cor,
			String chassi, String cidade, String estado) {
		this.proprietario = proprietario;
		this.veiculo = veiculo;
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

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
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
}
