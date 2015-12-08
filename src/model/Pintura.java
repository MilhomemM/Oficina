package model;

public class Pintura extends Servico {
	private String cor;
	private String peca;

	public Pintura(String tipoVeiculo, String descricao, double preco, String cor, String peca) {
		super(tipoVeiculo, descricao, preco);
		this.cor = cor;
		this.peca = peca;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPeca() {
		return peca;
	}

	public void setPeca(String peca) {
		this.peca = peca;
	}

	public boolean equals(Pintura p) {
		if (super.equals(p) && this.getCor().equalsIgnoreCase(p.getCor())
				&& this.getPeca().equalsIgnoreCase(p.getPeca()))
			return true;
		else
			return false;
	}
}
