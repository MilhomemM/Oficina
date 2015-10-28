package model;

public class Funilaria extends Servico {
	private String peca;

	public Funilaria(String tipoVeiculo, String descricao, double preco,
			String peca) {
		super(tipoVeiculo, descricao, preco);
		this.peca = peca;
	}

	public String getPeca() {
		return peca;
	}

	public void setPeca(String peca) {
		this.peca = peca;
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
