package business;

import java.util.ArrayList;
import java.util.Date;

import model.Conserto;
import model.Data;
import model.Funilaria;
import model.Mecanica;
import model.Pintura;

public class ConsertoBusiness {
	private ArrayList<Conserto> banco;

	public ConsertoBusiness() {
		this.banco = new ArrayList<Conserto>();
	}

	public ArrayList<Conserto> getBanco() {
		return this.banco;
	}

	public int getSize() {
		return this.banco.size();
	}

	public boolean adicionar(Conserto novo) {
		return this.banco.add(novo);
	}

	public Conserto pesquisarCodigo(String codigo) {

		if (this.banco == null || this.getSize() == 0) {
			return null;
		}

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCodigo().equalsIgnoreCase(codigo))
				;
			return this.banco.get(i);
		}
		return null;
	}

	public ArrayList<Conserto> pesquisarCliente(String proprietario) {
		ArrayList<Conserto> resultado = new ArrayList<Conserto>();

		if (this.banco == null || this.getSize() == 0) {
			return null;
		}
		for (int i = 0; i < this.getSize(); i++) {

			if (this.banco.get(i).getVeiculo().getProprietario().getNome().equalsIgnoreCase(proprietario)) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public ArrayList<Conserto> pesquisarVeiculo(String placaVeiculo) {
		ArrayList<Conserto> resultado = new ArrayList<Conserto>();

		if (this.banco == null || this.getSize() == 0) {
			return null;
		}

		for (int i = 0; i < this.getSize(); i++) {

			if (this.banco.get(i).getVeiculo().getPlaca().equalsIgnoreCase(placaVeiculo)) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public ArrayList<Conserto> pesquisarData(Date data) {
		ArrayList<Conserto> resultado = new ArrayList<Conserto>();
		Data dt = new Data();
		if (this.banco == null || this.getSize() == 0) {
			return null;
		}

		for (int i = 0; i < this.getSize(); i++) {

			if (dt.filtroData(this.banco.get(i).getData()).equals(dt.filtroData(data))) {
				resultado.add(this.banco.get(i));
			}
		}

		return resultado;

	}

	public ArrayList<Conserto> pesquisarTipoServico(String tipoServico) {
		ArrayList<Conserto> resultado = new ArrayList<Conserto>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		if (tipoServico.equalsIgnoreCase("Pintura")) {
			for (int i = 0; i < this.getSize(); i++) {
				for (int j = 0; j < this.banco.get(i).getServicos().size(); j++) {

					if (this.banco.get(i).getServicos().get(j) instanceof Pintura) {
						resultado.add(this.banco.get(i));
					}
				}
			}
		} else if (tipoServico.equalsIgnoreCase("Mecanica")) {
			for (int i = 0; i < this.getSize(); i++) {
				for (int j = 0; j < this.banco.get(i).getServicos().size(); j++) {

					if (this.banco.get(i).getServicos().get(j) instanceof Mecanica) {
						resultado.add(this.banco.get(i));
					}
				}

			}
		} else if (tipoServico.equalsIgnoreCase("Funilaria")) {
			for (int i = 0; i < this.getSize(); i++) {
				for (int j = 0; j < this.banco.get(i).getServicos().size(); j++)
					if (this.banco.get(i).getServicos().get(j) instanceof Funilaria) {
						resultado.add(this.banco.get(i));
					}
			}
		}

		return resultado;
	}	
	
	public ArrayList<Conserto> pesquisarPreco(double min, double max) {
		ArrayList<Conserto> resultado = new ArrayList<Conserto>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getTotal() >= min && this.banco.get(i).getTotal() <= max){
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}
}
