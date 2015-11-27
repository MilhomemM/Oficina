package model;

public class Mecanica extends Servico {

	public Mecanica(String codigo, String tipoVeiculo, String descricao, double preco) {
		super(codigo, tipoVeiculo, descricao, preco, descricao, descricao);
		// TODO Auto-generated constructor stub
	}
	
	public Mecanica(String tipoVeiculo, String descricao, double preco) {
		super(tipoVeiculo, descricao, preco, descricao, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return super.getCodigo();
	}

	@Override
	public void setCodigo(String codigo) {
		// TODO Auto-generated method stub
		super.setCodigo(codigo);
	}

	@Override
	public String getTipoVeiculo() {
		// TODO Auto-generated method stub
		return super.getTipoVeiculo();
	}

	@Override
	public void setTipoVeiculo(String tipoVeiculo) {
		// TODO Auto-generated method stub
		super.setTipoVeiculo(tipoVeiculo);
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return super.getDescricao();
	}

	@Override
	public void setDescricao(String descricao) {
		// TODO Auto-generated method stub
		super.setDescricao(descricao);
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return super.getPreco();
	}

	@Override
	public void setPreco(double preco) {
		// TODO Auto-generated method stub
		super.setPreco(preco);
	}
}