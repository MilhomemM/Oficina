package business;

import java.util.ArrayList;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class VeiculoBusiness {
	private ArrayList<Veiculo> banco;

	public VeiculoBusiness() {
		this.banco = new ArrayList<Veiculo>();
	}

	public ArrayList<Veiculo> getBanco() {
		return this.banco;
	}

	public int getSize() {
		return this.banco.size();
	}

	public boolean adicionar(Veiculo novo) {
		return this.banco.add(novo);
	}

	public Veiculo pesquisarProprietario(String proprietario) {

		if (this.banco == null || this.getSize() == 0) {
			return null;
		}
		for (int i = 0; i < this.getSize(); i++) {

			if (this.banco.get(i).getProprietario().getCpf() == proprietario) {
				System.out.println("business pesquisar1");
				return this.banco.get(i);
			}
		}
		return null;
	}

	public boolean existeCpfProprietario(String cpf) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getProprietario().getCpf().equalsIgnoreCase(cpf)) {
				return true;
			}
		}
		return false;
	}

	public int pesquisarCpfProprietarioIndex(String cpf) {
		if (this.banco == null || this.getSize() == 0)
			return -1;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getProprietario().getCpf().equalsIgnoreCase(cpf)) {
				System.out.println("Entrou no indice Pesquisa");
				return i;
			}
		}
		return -1;
	}

	public Veiculo pesquisarPlacaVeiculo(String placaVeiculo) {

		if (this.banco == null || this.getSize() == 0) {
			return null;
		}

		for (int i = 0; i < this.getSize(); i++) {

			if (this.banco.get(i).getPlaca().equalsIgnoreCase(placaVeiculo)) {
				return this.banco.get(i);
			}
		}
		return null;
	}

	public boolean existePlaca(String placa) {
		if (this.banco == null || this.getSize() == 0) {
			return false;
		}
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getPlaca().equalsIgnoreCase(placa)) {
				return true;
			}
		}
		return false;
	}

	public int pesquisarPlacaVeiculoIndex(String placa) {
		if (this.banco == null || this.getSize() == 0)
			return -1;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("Entrou no indice Pesquisa");
				return i;
			}
		}
		return -1;
	}

	public ArrayList<Veiculo> pesquisarTipo(String tipoVeiculo) {
		ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();

		if (this.banco == null || this.getSize() == 0)
			return null;

		if (tipoVeiculo.equalsIgnoreCase("carro")) {
			for (int i = 0; i < this.getSize(); i++) {
				if (this.banco.get(i) instanceof Carro) {
					resultado.add(this.banco.get(i));
				}
			}
		} else if (tipoVeiculo.equalsIgnoreCase("moto")) {
			for (int i = 0; i < this.getSize(); i++) {
				if (this.banco.get(i) instanceof Moto) {
					resultado.add(this.banco.get(i));
				}
			}
		}

		return resultado;
	}

	public boolean existeTipoVeiculo(Veiculo tipo) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (tipo instanceof Carro) {
				if (this.banco.get(i) instanceof Carro)
					if (((Carro) this.banco.get(i)).getPlaca().equalsIgnoreCase(tipo.getPlaca()))
						if (((Carro) this.banco.get(i)).getAno() == tipo.getAno())
							if (((Carro) this.banco.get(i)).getCor().equalsIgnoreCase(tipo.getCor()))
								if (((Carro) this.banco.get(i)).getMarca().equalsIgnoreCase(tipo.getMarca()))
									return true;
			} else if (tipo instanceof Moto) {
				if (this.banco.get(i) instanceof Moto)
					if (((Moto) this.banco.get(i)).getPlaca().equalsIgnoreCase(tipo.getPlaca()))
						if (((Moto) this.banco.get(i)).getAno() == tipo.getAno())
							if (((Moto) this.banco.get(i)).getCor().equalsIgnoreCase(tipo.getCor()))
								if (((Moto) this.banco.get(i)).getMarca().equalsIgnoreCase(tipo.getMarca()))								
									return true;
			}
		}
		return false;
	}

	public ArrayList<Veiculo> pesquisarMarcaVeiculo(String marcaVeiculo) {
		ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();

		if (this.banco == null || this.getSize() == 0) {
			return null;
		}

		for (int i = 0; i < this.getSize(); i++) {

			if (this.banco.get(i).getMarca().equalsIgnoreCase(marcaVeiculo)) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public boolean existeMarcaVeiculo(String marca) {
		if (this.banco == null || this.getSize() == 0) {
			return false;
		}
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getMarca().equalsIgnoreCase(marca)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Veiculo> pesquisarModeloVeiculo(String modeloVeiculo) {
		ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();

		if (this.banco == null || this.getSize() == 0) {
			return null;
		}

		for (int i = 0; i < this.getSize(); i++) {

			if (this.banco.get(i).getModelo().equalsIgnoreCase(modeloVeiculo)) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;
	}

	public boolean existeModeloVeiculo(String modelo) {
		if (this.banco == null || this.getSize() == 0) {
			return false;
		}
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getModelo().equalsIgnoreCase(modelo)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Veiculo> pesquisaAnoVeiculo(int anoVeiculo) {
		ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();

		if (this.banco == null || this.getSize() == 0) {
			return null;
		}

		for (int i = 0; i < this.getSize(); i++) {

			if (this.banco.get(i).getAno() == anoVeiculo) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;

	}

	public boolean existeAnoVeiculo(int ano) {
		if (this.banco == null || this.getSize() == 0) {
			return false;
		}
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getAno() == ano) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Veiculo> pesquisarCorVeiculo(String corVeiculo) {
		ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();

		if (this.banco == null || this.getSize() == 0) {
			return null;
		}

		for (int i = 0; i < this.getSize(); i++) {

			if (this.banco.get(i).getCor().equalsIgnoreCase(corVeiculo)) {
				resultado.add(this.banco.get(i));
			}
		}
		return resultado;

	}

	public boolean existeCorVeiculo(String cor) {
		if (this.banco == null || this.getSize() == 0) {
			return false;
		}
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCor().equalsIgnoreCase(cor)) {
				return true;
			}
		}
		return false;
	}

	public Veiculo alterar(int posicao, Veiculo novo) {
		return this.banco.set(posicao, novo);
	}

	public Veiculo remover(int posicao) {
		if (posicao < 0 && posicao >= this.getSize())
			return null;
		else
			return this.banco.remove(posicao);
	}


}