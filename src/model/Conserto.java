package model;

import java.util.ArrayList;
import java.util.Date;

public class Conserto {
	private Cliente proprietario;
	private Veiculo veiculo;
	private Date data;
	ArrayList<Servico> servicos;
	private double total;

	public Conserto(Cliente proprietario, Veiculo veiculo, Date data, ArrayList<Servico> servicos, double total) {
		this.proprietario = proprietario;
		this.veiculo = veiculo;
		this.data = data;
		this.servicos = servicos;
		this.total = total;
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