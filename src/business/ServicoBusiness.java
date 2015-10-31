package business;

import java.util.ArrayList;

import model.Funilaria;
import model.Mecanica;
import model.Pintura;
import model.Servico;

public class ServicoBusiness {
	private ArrayList<Servico> banco;

	public ServicoBusiness() {
		this.banco = new ArrayList<Servico>();
	}

	public ArrayList<Servico> getBanco() {
		return this.banco;
	}

	public int getSize() {
		return this.banco.size();
	}

	public boolean adicionar(Servico novo) {
		return this.banco.add(novo);
	}

	public Servico pesquisarCodigo(String codigo) {
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCodigo().equalsIgnoreCase(codigo))
				return this.banco.get(i);
		}
		return null;
	}

	public ArrayList<Servico> pesquisarTipoVeiculo(String tipoVeiculo) {
		ArrayList<Servico> resultado = new ArrayList<Servico>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getTipoVeiculo().equalsIgnoreCase(tipoVeiculo)) {
				resultado.add(this.banco.get(i));
			}
		}

		return resultado;
	}

	public ArrayList<Servico> pesquisarTipoServico(String tipoServico) {
		ArrayList<Servico> resultado = new ArrayList<Servico>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		if (tipoServico.equalsIgnoreCase("Pintura")) {
			for (int i = 0; i < this.getSize(); i++) {
				if (this.banco.get(i) instanceof Pintura) {
					resultado.add(this.banco.get(i));
				}
			}
		} else if (tipoServico.equalsIgnoreCase("Mecanica")) {
			for (int i = 0; i < this.getSize(); i++) {
				if (this.banco.get(i) instanceof Mecanica) {
					resultado.add(this.banco.get(i));
				}
			}
		} else if (tipoServico.equalsIgnoreCase("Funilaria")) {
			for (int i = 0; i < this.getSize(); i++) {
				if (this.banco.get(i) instanceof Funilaria) {
					resultado.add(this.banco.get(i));
				}
			}
		}

		return resultado;
	}

	public ArrayList<Servico> pesquisarDescricao(String descricao) {
		ArrayList<Servico> resultado = new ArrayList<Servico>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getDescricao().equalsIgnoreCase(descricao)) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public ArrayList<Servico> pesquisarPreco(double min, double max) {
		ArrayList<Servico> resultado = new ArrayList<Servico>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getPreco() >= min && this.banco.get(i).getPreco() <= max) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public ArrayList<Servico> pesquisarCor(String cor) {
		ArrayList<Servico> resultado = new ArrayList<Servico>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i) instanceof Pintura) {
				if (((Pintura) this.banco.get(i)).getCor().equalsIgnoreCase(cor)) {
					resultado.add(this.banco.get(i));
				}
			}
		}
		return resultado;
	}

	public ArrayList<Servico> pesquisarPeca(String peca) {
		ArrayList<Servico> resultado = new ArrayList<Servico>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i) instanceof Pintura) {
				if (((Pintura) this.banco.get(i)).getPeca().equalsIgnoreCase(peca)) {
					resultado.add(this.banco.get(i));
				}
			}
			else if (this.banco.get(i) instanceof Funilaria) {
				if (((Funilaria) this.banco.get(i)).getPeca().equalsIgnoreCase(peca)) {
					resultado.add(this.banco.get(i));
				}
			}
				
		}
		return resultado;
	}
}
