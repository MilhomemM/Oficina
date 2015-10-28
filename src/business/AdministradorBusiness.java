package business;

import java.util.ArrayList;

import model.Administrador;

public class AdministradorBusiness {
	private ArrayList<Administrador> banco;

	public AdministradorBusiness() {
		this.banco = new ArrayList<Administrador>();
	}

	public ArrayList<Administrador> getBanco() {
		return this.banco;
	}

	public boolean adicionar(Administrador novo) {
		return this.banco.add(novo);
	}
}
