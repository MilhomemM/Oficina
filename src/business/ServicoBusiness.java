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
		if (this.existeServico(novo))
			return false;
		else
			return this.banco.add(novo);
	}

	public boolean existeServico(Servico s) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (s instanceof Pintura) {
				if (this.banco.get(i) instanceof Pintura)
					if (((Pintura) this.banco.get(i)).getTipoVeiculo().equalsIgnoreCase(s.getTipoVeiculo()))
						if (((Pintura) this.banco.get(i)).getDescricao().equalsIgnoreCase(s.getDescricao()))
							if (((Pintura) this.banco.get(i)).getCor().equalsIgnoreCase(((Pintura) s).getCor()))
								if (((Pintura) this.banco.get(i)).getPeca().equalsIgnoreCase(((Pintura) s).getPeca()))
									return true;
			} else if (s instanceof Funilaria) {
				if (this.banco.get(i) instanceof Funilaria)
					if (((Funilaria) this.banco.get(i)).getTipoVeiculo().equalsIgnoreCase(s.getTipoVeiculo()))
						if (((Funilaria) this.banco.get(i)).getDescricao().equalsIgnoreCase(s.getDescricao()))
							if (((Funilaria) this.banco.get(i)).getPeca().equalsIgnoreCase(((Funilaria) s).getPeca()))
								return true;
			} else if (s instanceof Mecanica) {
				if (this.banco.get(i) instanceof Mecanica)
					if (((Mecanica) this.banco.get(i)).getTipoVeiculo().equalsIgnoreCase(s.getTipoVeiculo()))
						if (((Mecanica) this.banco.get(i)).getDescricao().equalsIgnoreCase(s.getDescricao()))
							return true;
			}
		}
		return false;
	}

	public Servico pesquisarCodigo(String codigo) {
		System.out.println("Businesses");
		System.out.println(this.getSize());
		if (this.banco == null || this.getSize() == 0)
			return null;
		for (int i = 0; i < this.getSize(); i++) {
			System.out.println(this.banco.get(i).getCodigo() + " <> " + codigo);
			if (this.banco.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				return this.banco.get(i);
			}
		}
		System.out.println("End");
		return null;
	}

	public int pesquisarCodigoIndex(String codigo) {
		if (this.banco == null || this.getSize() == 0)
			return -1;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getCodigo().equalsIgnoreCase(codigo))
				return i;
		}
		return -1;
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

	public boolean existeDescricao(String descricao) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getDescricao().equalsIgnoreCase(descricao)) {
				return true;
			}
		}
		return false;
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

	public boolean existePreco(double preco) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i).getPreco() == preco) {
				return true;
			}
		}
		return false;
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

	public boolean existeCor(String cor) {
		if (this.banco == null || this.getSize() == 0)
			return false;
		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i) instanceof Pintura)
				if (((Pintura) this.banco.get(i)).getCor().equalsIgnoreCase(cor)) {
					return true;
				}
		}
		return false;
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
			} else if (this.banco.get(i) instanceof Funilaria) {
				if (((Funilaria) this.banco.get(i)).getPeca().equalsIgnoreCase(peca)) {
					resultado.add(this.banco.get(i));
				}
			}

		}
		return resultado;
	}

	public boolean existePeca(String peca) {
		if (this.banco == null || this.getSize() == 0)
			return false;

		for (int i = 0; i < this.getSize(); i++) {
			if (this.banco.get(i) instanceof Pintura) {
				if (((Pintura) this.banco.get(i)).getPeca().equalsIgnoreCase(peca)) {
					return true;
				}
			} else if (this.banco.get(i) instanceof Funilaria) {
				if (((Funilaria) this.banco.get(i)).getPeca().equalsIgnoreCase(peca)) {
					return true;
				}
			}

		}
		return false;
	}

	public Servico alterar(int posicao, Servico novo) {
		if ((posicao < 0 && posicao >= this.getSize()) || novo == null)
			return null;
		else
			return this.banco.set(posicao, novo);
	}

	public Servico remover(int posicao) {
		if (posicao < 0 && posicao >= this.getSize())
			return null;
		else
			return this.banco.remove(posicao);
	}

}
