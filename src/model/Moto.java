package model;

public class Moto extends Veiculo {
	public Moto(Cliente proprietario, Veiculo veiculo, int ano, String marca, String modelo, String cor, String chassi,
			String cidade, String estado) {
		super(proprietario, veiculo, ano, marca, modelo, cor, chassi, cidade, estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cliente getProprietario() {
		// TODO Auto-generated method stub
		return super.getProprietario();
	}

	@Override
	public void setProprietario(Cliente proprietario) {
		// TODO Auto-generated method stub
		super.setProprietario(proprietario);
	}

	@Override
	public Veiculo getVeiculo() {
		// TODO Auto-generated method stub
		return super.getVeiculo();
	}

	@Override
	public void setVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub
		super.setVeiculo(veiculo);
	}

	@Override
	public int getAno() {
		// TODO Auto-generated method stub
		return super.getAno();
	}

	@Override
	public void setAno(int ano) {
		// TODO Auto-generated method stub
		super.setAno(ano);
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}

	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		super.setMarca(marca);
	}

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return super.getModelo();
	}

	@Override
	public void setModelo(String modelo) {
		// TODO Auto-generated method stub
		super.setModelo(modelo);
	}

	@Override
	public String getCor() {
		// TODO Auto-generated method stub
		return super.getCor();
	}

	@Override
	public void setCor(String cor) {
		// TODO Auto-generated method stub
		super.setCor(cor);
	}

	@Override
	public String getChassi() {
		// TODO Auto-generated method stub
		return super.getChassi();
	}

	@Override
	public void setChassi(String chassi) {
		// TODO Auto-generated method stub
		super.setChassi(chassi);
	}

	@Override
	public String getCidade() {
		// TODO Auto-generated method stub
		return super.getCidade();
	}

	@Override
	public void setCidade(String cidade) {
		// TODO Auto-generated method stub
		super.setCidade(cidade);
	}

	@Override
	public String getEstado() {
		// TODO Auto-generated method stub
		return super.getEstado();
	}

	@Override
	public void setEstado(String estado) {
		// TODO Auto-generated method stub
		super.setEstado(estado);
	}
}
