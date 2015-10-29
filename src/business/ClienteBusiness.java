package business;

import java.util.ArrayList;

import model.Cliente;

public class ClienteBusiness {
	private ArrayList<Cliente> banco;

	public ClienteBusiness() {
		this.banco = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getBanco() {
		return this.banco;
	}

	public boolean adicionar(Cliente novo) {
		return this.banco.add(novo);
	}
}
