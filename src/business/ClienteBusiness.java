package business;

import java.util.ArrayList;
import java.util.Date;

import model.Cliente;
import model.Data;

public class ClienteBusiness {
	private ArrayList<Cliente> banco;

	public ClienteBusiness() {
		this.banco = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getBanco() {
		return this.banco;
	}

	public int getSize() {
		return this.banco.size();
	}

	public boolean adicionar(Cliente novo) {
		return this.banco.add(novo);
	}

	public ArrayList<Cliente> pesquisarNome(String nome) {
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getNome().equalsIgnoreCase(nome))
				resultado.add(this.banco.get(i));
		}
		return resultado;
	}

	public ArrayList<Cliente> pesquisarSexo(String sexo) {
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getSexo().equalsIgnoreCase(sexo)) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public ArrayList<Cliente> pesquisarNascimento(Date nascimento) {
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		Data dt = new Data();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < getSize(); i++) {
			if (dt.filtroData(this.banco.get(i).getNascimento()).equals(dt.filtroData(nascimento))) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public Cliente pesquisarRg(String rg) {
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getRg().equalsIgnoreCase(rg)) {

				return this.banco.get(i);
			}
		}
		return null;
	}

	public int pesquisarRgIndex(String rg) {
		if (this.banco == null || this.getSize() == 0)
			return -1;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getRg().equalsIgnoreCase(rg)) {
				return i;
			}
		}
		return -1;
	}

	public Cliente pesquisarCpf(String cpf) {
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCpf().equalsIgnoreCase(cpf)) {
				return this.banco.get(i);
			}
		}
		return null;
	}

	public int pesquisarCpfIndex(String cpf) {
		if (this.banco == null || this.getSize() == 0)
			return -1;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCpf().equalsIgnoreCase((cpf))) {
				return i;
			}
		}
		return -1;
	}

	public ArrayList<Cliente> pesquisarEmail(String email) {

		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getEmail().equalsIgnoreCase(email)) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public ArrayList<Cliente> pesquisarTelefone(String telefone) {
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getTelefone().equalsIgnoreCase(telefone)) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public Cliente alterar(int posicao, Cliente novo) {
		return this.banco.set(posicao, novo);
	}

	public Cliente remover(int posicao) {
		return this.banco.remove(posicao);
	}
}
