package business;

import java.util.ArrayList;

import model.Veiculo;

public class VeiculoBusiness {
	private ArrayList<Veiculo> banco;

	public VeiculoBusiness() {
		this.banco = new ArrayList<Veiculo>();
	}

	public ArrayList<Veiculo> getBanco() {
		return this.banco;
	}

	public boolean adicionar(Veiculo novo) {
		return this.banco.add(novo);
	}
}