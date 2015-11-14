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
		if (this.existeCpf(novo.getCpf()) || this.existeRg(novo.getRg()))
			return false;
		else
			return this.banco.add(novo);
	}

	public ArrayList<Cliente> pesquisarNome(String nome) {
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (nome.length() <= this.banco.get(i).getNome().length())
				if (this.banco.get(i).getNome().substring(0, nome.length()).equalsIgnoreCase(nome))
					resultado.add(this.banco.get(i));
		}
		return resultado;
	}

	public boolean existeNome(String nome) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getNome().equalsIgnoreCase(nome))
				return true;
		}
		return false;
	}

	public ArrayList<Cliente> pesquisarSexo(String sexo) {
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (sexo.length() <= this.banco.get(i).getSexo().length())
				if (this.banco.get(i).getSexo().substring(0, sexo.length()).equalsIgnoreCase(sexo)) {
					resultado.add(this.banco.get(i));
				}
		}
		return resultado;
	}

	public boolean existeSexo(String sexo) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getSexo().equalsIgnoreCase(sexo)) {
				return true;
			}
		}
		return false;
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

	public boolean existeNascimento(Date nascimento) {
		Data dt = new Data();
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < getSize(); i++) {
			if (dt.filtroData(this.banco.get(i).getNascimento()).equals(dt.filtroData(nascimento))) {
				return true;
			}
		}
		return false;
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

	public boolean existeRg(String rg) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getRg().equalsIgnoreCase(rg)) {
				return true;
			}
		}
		return false;
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

	public boolean existeCpf(String cpf) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCpf().equalsIgnoreCase(cpf)) {
				return true;
			}
		}
		return false;
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

	public boolean existeEmail(String email) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getEmail().equalsIgnoreCase(email)) {
				return true;
			}
		}
		return false;
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

	public boolean existeTelefone(String telefone) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getTelefone().equalsIgnoreCase(telefone)) {
				return true;
			}
		}
		return false;
	}

	public Cliente alterar(int posicao, Cliente novo) {
		if ((posicao < 0 && posicao >= this.getSize()) || novo == null)
			return null;
		else
			return this.banco.set(posicao, novo);
	}

	public Cliente remover(int posicao) {
		if (posicao < 0 && posicao >= this.getSize())
			return null;
		else
			return this.banco.remove(posicao);
	}
}
