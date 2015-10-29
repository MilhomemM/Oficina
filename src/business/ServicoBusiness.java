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

}
