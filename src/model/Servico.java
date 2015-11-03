package model;

public abstract class Servico {
	private String codigo;
	private String tipoVeiculo;
	private String descricao;
	private double preco;

	public Servico(String codigo, String tipoVeiculo, String descricao, double preco) {
		this.codigo = codigo;
		this.tipoVeiculo = tipoVeiculo;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String gerarCodigo(int numero)
	{
		String codigoPrefix = "SERV";
		String codigoSuffix = "";
		String codigoNovo;
		for(int i = 0; i < 4 - String.valueOf(numero).length(); i++)
		{
			codigoSuffix = codigoSuffix + "0";
		}
		codigoSuffix = codigoSuffix + String.valueOf(numero);
		codigoNovo = codigoPrefix + codigoSuffix;
		this.setCodigo(codigoNovo);
		return codigoNovo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
