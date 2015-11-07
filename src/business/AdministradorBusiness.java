package business;

import java.util.ArrayList;
import java.util.Date;

import model.Administrador;
import model.Data;



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
		return this.banco.add(novo);
	}
	
	
	public ArrayList<Administrador> pesquisarNomeCompleto(String nomeCompleto) {
		ArrayList<Administrador> resultado = new ArrayList<Administrador>();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getNome().equalsIgnoreCase(nomeCompleto))
				resultado.add(this.banco.get(i));
		}
		return resultado;
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
	
	public int pesquisarRgIndex(String rg){
		if(this.banco == null || this.getSize() == 0)
			return -1;
		for(int i = 0;i < this.getSize(); i++) {
			if(this.banco.get(i).getRg().equalsIgnoreCase(rg))
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
	
	public int pesquisarCpfIndex(String cpf){
		if(this.banco == null || this.getSize() == 0)
			return -1;
		for(int i = 0;i < this.getSize(); i++) {
			if(this.banco.get(i).getCpf().equalsIgnoreCase(cpf))
				return i;
		}
		return -1;
	}
	
	public Administrador pesquisarUsuario(String nomeUsuario) {
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getUsuario().getLogin().equalsIgnoreCase(nomeUsuario))
				return this.banco.get(i);
		}
		return null;
	}
	
	public ArrayList<Administrador> pesquisarSexo(String sexo) {
		ArrayList<Administrador> resultado = new ArrayList<Administrador>();
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getSexo().equalsIgnoreCase(sexo))
				resultado.add(this.banco.get(i));
		}
		return resultado;
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
	
	public Administrador alterar(int posicao, Administrador novo) {
		return this.banco.set(posicao, novo);
	}

	public Administrador remover(int posicao) {
		return this.remover(posicao);
	}
}

