package model;

public abstract class Servico {
	private String tipoVeiculo;
	private String descricao;
	private double preco;

	public Servico(String tipoVeiculo, String descricao, double preco) {
		this.tipoVeiculo = tipoVeiculo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
