package model;

import java.util.ArrayList;
import java.util.Date;

public class Conserto {
	private String codigo;
	private Cliente proprietario;
	private Veiculo veiculo;
	private Date data;
	ArrayList<Servico> servicos;
	private double total;

	public Conserto(String codigo, Cliente proprietario, Veiculo veiculo, Date data, ArrayList<Servico> servicos,
			double total) {
		super();
		this.codigo = codigo;
		this.proprietario = proprietario;
		this.veiculo = veiculo;
		this.data = data;
		this.servicos = servicos;
		this.total = total;
	}

	public Conserto(String codigo, Cliente proprietario, Veiculo veiculo, Date data, Pintura pintura, Mecanica mecanica,
			Funilaria funilaria, double total) {
		super();
		this.codigo = codigo;
		this.proprietario = proprietario;
		this.veiculo = veiculo;
		this.data = data;
		if (pintura != null)
			this.servicos.add(pintura);
		if (mecanica != null)
			this.servicos.add(mecanica);
		if (funilaria != null)
			this.servicos.add(funilaria);
		this.total = total;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Cliente getProprietario() {
		return proprietario;
	}

	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public ArrayList<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}