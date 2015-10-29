package business;

import java.util.ArrayList;

import model.Conserto;

public class ConsertoBusiness {
	private ArrayList<Conserto> banco;

	public ConsertoBusiness() {
		this.banco = new ArrayList<Conserto>();
	}

	public ArrayList<Conserto> getBanco() {
		return this.banco;
	}

	public boolean adicionar(Conserto novo) {
		return this.banco.add(novo);
	}
}
