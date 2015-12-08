package model;

import java.util.ArrayList;
import java.util.Date;

public class Conserto {
	private String codigo;
	private Veiculo veiculo;
	private Date data;
	ArrayList<Servico> servicos;
	private double total;

	public Conserto(String codigo, Veiculo veiculo, Date data, ArrayList<Servico> servicos, double total) {
		super();
		this.codigo = codigo;
		this.veiculo = veiculo;
		this.data = data;
		this.servicos = servicos;
		this.total = total;
	}

	public Conserto(Veiculo veiculo, Date data, ArrayList<Servico> servicos, double total) {
		super();
		this.veiculo = veiculo;
		this.data = data;
		this.servicos = servicos;
		this.total = total;
	}

	public Conserto(String codigo, Veiculo veiculo, Date data, Pintura pintura, Mecanica mecanica, Funilaria funilaria,
			double total) {
		super();
		this.codigo = codigo;
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

	public Conserto(Veiculo veiculo, Date data, Pintura pintura, Mecanica mecanica, Funilaria funilaria, double total) {
		super();
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

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Date getData() {
		return data;
	}

	public String getDataString() {
		Data dt = new Data();
		return dt.filtroData(data);
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

	public String getTotalString(){
		String total = String.format("%.2f", this.getTotal());
		total.replace('.', ',');
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean equals(Conserto c) {
		if (this.getCodigo().equals(c.getCodigo())
				|| (this.getVeiculo().equals(c.getVeiculo()) && (this.getDataString().equals(c.getDataString()))))
			return true;
		else
			return false;
	}

	public String toString() {
		String conserto;
		Data dt = new Data();
		conserto = "Codigo: " + this.getCodigo() + "\n" + "Data: " + dt.filtroData(this.getData()) + "\n";
		for (int i = 0; i < this.getServicos().size(); i++) {
			if (this.servicos.get(i) instanceof Pintura)
				conserto += "Pintura {\n";
			else if (this.servicos.get(i) instanceof Funilaria)
				conserto += "Funilaria {\n";
			else if (this.servicos.get(i) instanceof Mecanica)
				conserto += "Mecanica {\n";
			conserto += this.servicos.get(i).toString();
			conserto += "}\n";
		}
		conserto += "Total: " + this.getTotalString();

		return conserto;
	}
}