package business;

import java.util.ArrayList;
import java.util.Date;

import model.Administrador;
import model.Data;
import model.Usuario;

public class AdministradorBusiness {
	private ArrayList<Administrador> banco;

	public AdministradorBusiness() {
		this.banco = new ArrayList<Administrador>();
	}

	public ArrayList<Administrador> getBanco() {
		return this.banco;
	}

	public int getSize() {
		return this.banco.size();
	}

	public boolean adicionar(Administrador novo) {
		if (!this.existeCpf(novo.getCpf()) && (!this.existeRg(novo.getRg())
				&& (!this.existeEmail(novo.getEmail()) && (!this.existeNomeUsuario(novo.getUsuario().getLogin())))))
			return this.banco.add(novo);
		else
			return false;
	}

	public ArrayList<Administrador> pesquisarNome(String nome) {
		ArrayList<Administrador> resultado = new ArrayList<Administrador>();
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

	public Administrador pesquisarRg(String rg) {
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getRg().equalsIgnoreCase(rg))
				return this.banco.get(i);
		}
		return null;
	}

	public boolean existeRg(String rg) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getRg().equalsIgnoreCase(rg))
				return true;
		}
		return false;
	}

	public int pesquisarRgIndex(String rg) {
		if (this.banco == null || this.getSize() == 0)
			return -1;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getRg().equalsIgnoreCase(rg))
				return i;
		}
		return -1;
	}

	public Administrador pesquisarCpf(String cpf) {
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCpf().equalsIgnoreCase(cpf))
				return this.banco.get(i);
		}
		return null;
	}

	public boolean existeCpf(String cpf) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCpf().equalsIgnoreCase(cpf))
				return true;
		}
		return false;
	}

	public int pesquisarCpfIndex(String cpf) {
		if (this.banco == null || this.getSize() == 0)
			return -1;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCpf().equalsIgnoreCase(cpf))
				return i;
		}
		return -1;
	}

	public ArrayList<Administrador> pesquisarSexo(String sexo) {
		ArrayList<Administrador> resultado = new ArrayList<Administrador>();
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

	public ArrayList<Administrador> pesquisarNascimento(Date nascimento) {
		ArrayList<Administrador> resultado = new ArrayList<Administrador>();
		Data dt = new Data();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (dt.filtroData(this.banco.get(i).getNascimento()).equals(dt.filtroData(nascimento)))
				resultado.add(this.banco.get(i));
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

	public Administrador pesquisarEmail(String email) {
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getEmail().equalsIgnoreCase(email))
				return this.banco.get(i);
		}
		return null;
	}

	public boolean existeEmail(String email) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getEmail().equalsIgnoreCase(email))
				return true;
		}
		return false;
	}

	public int pesquisarEmailIndex(String email) {
		if (this.banco == null || this.getSize() == 0)
			return -1;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getEmail().equalsIgnoreCase(email))
				return i;
		}
		return -1;
	}

	public Administrador pesquisarUsuario(Usuario usuario) {
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getUsuario().getLogin().equals(usuario.getLogin())
					&& this.banco.get(i).getUsuario().getSenha().equals(usuario.getSenha()))
				return this.banco.get(i);
		}
		return null;
	}

	public boolean existeUsuario(Usuario usuario) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getUsuario().getLogin().equals(usuario.getLogin())
					&& this.banco.get(i).getUsuario().getSenha().equals(usuario.getSenha()))
				return true;
		}
		return false;
	}

	public Administrador pesquisarNomeUsuario(String nomeUsuario) {
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getUsuario().getLogin().equals(nomeUsuario))
				return this.banco.get(i);
		}
		return null;
	}

	public boolean existeNomeUsuario(String nomeUsuario) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getUsuario().getLogin().equals(nomeUsuario))
				return true;
		}
		return false;
	}

	public Administrador alterar(int posicao, Administrador novo) {
		return this.banco.set(posicao, novo);
	}

	public Administrador remover(int posicao) {
		return this.remover(posicao);
	}
}
