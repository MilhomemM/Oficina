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
	private long ultimoCodigoValido;

	public ConsertoBusiness() {
		this.banco = new ArrayList<Conserto>();
		this.ultimoCodigoValido = 1;
	}

	public ArrayList<Conserto> getBanco() {
		return this.banco;
	}

	public int getSize() {
		return this.banco.size();
	}

	public boolean adicionar(Conserto novo) {
		if (this.existeConserto(novo))
			return false;
		else {
			novo.setCodigo(this.gerarCodigo(novo));
			return this.banco.add(novo);
		}
	}

	public String gerarCodigo(Conserto c) {
		String codigo = "";
		codigo = "C" + ultimoCodigoValido;
		for (int i = 0; i < c.getServicos().size(); i++) {
			if (c.getServicos().get(i) instanceof Pintura) {
				codigo = codigo + "P";
			} else if (c.getServicos().get(i) instanceof Funilaria) {
				codigo = codigo + "F";
			} else if (c.getServicos().get(i) instanceof Mecanica) {
				codigo = codigo + "M";
			}
		}
		this.ultimoCodigoValido++;
		return codigo;
	}

	public boolean existeConserto(Conserto c) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (c.equals(this.getBanco().get(i)))
				return true;
		}
		return false;
	}

	public Conserto pesquisarCodigo(String codigo) {
		if (this.banco == null || this.getSize() == 0) {
			return null;
		}
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCodigo().equalsIgnoreCase(codigo))
				return this.banco.get(i);
		}
		return null;
	}

	public boolean existeCodigo(String codigo) {
		if (this.banco == null || this.getSize() == 0) {
			return false;
		}
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCodigo().equalsIgnoreCase(codigo))
				return true;
		}
		return false;
	}

	public int pesquisarCodigoIndex(String codigo) {
		if (this.banco == null || this.getSize() == 0) {
			return -1;
		}

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCodigo().equalsIgnoreCase(codigo))
				return i;
		}
		return -1;
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

	public boolean existeCliente(String proprietario) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getVeiculo().getProprietario().getNome().equalsIgnoreCase(proprietario)) {
				return true;
			}
		}
		return false;
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

	public boolean existeVeiculo(String placaVeiculo) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getVeiculo().getPlaca().equalsIgnoreCase(placaVeiculo)) {
				return true;
			}
		}
		return false;
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

	public boolean existeData(Date data) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		Data dt = new Data();
		for (int i = 0; i < this.getSize(); i++)
			if (dt.filtroData(this.banco.get(i).getData()).equals(dt.filtroData(data)))
				return true;
		return false;
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

	public boolean existeTipoServico(String tipoServico) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		if (tipoServico.equalsIgnoreCase("Pintura")) {
			for (int i = 0; i < this.getSize(); i++)
				for (int j = 0; j < this.banco.get(i).getServicos().size(); j++)
					if (this.banco.get(i).getServicos().get(j) instanceof Pintura)
						return true;
		} else if (tipoServico.equalsIgnoreCase("Mecanica")) {
			for (int i = 0; i < this.getSize(); i++)
				for (int j = 0; j < this.banco.get(i).getServicos().size(); j++)
					if (this.banco.get(i).getServicos().get(j) instanceof Mecanica)
						return true;
		} else if (tipoServico.equalsIgnoreCase("Funilaria")) {
			for (int i = 0; i < this.getSize(); i++)
				for (int j = 0; j < this.banco.get(i).getServicos().size(); j++)
					if (this.banco.get(i).getServicos().get(j) instanceof Funilaria)
						return true;
		}
		return false;
	}

	public ArrayList<Conserto> pesquisarPreco(double min, double max) {
		ArrayList<Conserto> resultado = new ArrayList<Conserto>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getTotal() >= min && this.banco.get(i).getTotal() <= max) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}
	
	public boolean existePreco(double min, double max) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getTotal() >= min && this.banco.get(i).getTotal() <= max) {
				return true;
			}
		}
		return false;
	}

	public Conserto alterar(int posicao, Conserto novo) {
		return this.banco.set(posicao, novo);
	}

	public Conserto remover(int posicao) {
		return this.remover(posicao);
	}
}
