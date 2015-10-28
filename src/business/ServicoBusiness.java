package business;

import java.util.ArrayList;

import model.Servico;

public class ServicoBusiness {
	private ArrayList<Servico> banco;

	public ServicoBusiness() {
		this.banco = new ArrayList<Servico>();
	}

	public ArrayList<Servico> getBanco() {
		return this.banco;
	}

	public boolean adicionar(Servico novo) {
		return this.banco.add(novo);
	}
}
