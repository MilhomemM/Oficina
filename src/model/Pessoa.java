package model;

import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private String rg;
	private String cpf;
	private String sexo;
	private Date nascimento;

	public Pessoa(String nome, String rg, String cpf, String sexo,
			Date nascimento) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String filtroCPF() {
		String CPF = this.getCpf();
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}
	
	public String getNascimentoString() {
		Data dt = new Data();
		return dt.filtroData(this.getNascimento());
	}
}
