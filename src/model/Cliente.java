package model;

import java.util.Date;

public class Cliente extends Pessoa {
	private String email;
	private String telefone;

	public Cliente(String nome, String rg, String cpf, String sexo, Date nascimento, String email, String telefone) {
		super(nome, rg, cpf, sexo, nascimento);
		this.email = email;
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public String getRg() {
		// TODO Auto-generated method stub
		return super.getRg();
	}

	@Override
	public void setRg(String rg) {
		// TODO Auto-generated method stub
		super.setRg(rg);
	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}

	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}

	@Override
	public String getSexo() {
		// TODO Auto-generated method stub
		return super.getSexo();
	}

	@Override
	public void setSexo(String sexo) {
		// TODO Auto-generated method stub
		super.setSexo(sexo);
	}

	@Override
	public Date getNascimento() {
		// TODO Auto-generated method stub
		return super.getNascimento();
	}

	@Override
	public String getNascimentoString() {
		Data dt = new Data();
		return dt.filtroData(this.getNascimento());
	}

	@Override
	public void setNascimento(Date nascimento) {
		// TODO Auto-generated method stub
		super.setNascimento(nascimento);
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	public boolean equals(Cliente c) {
		if (this.getCpf().equals(c.getCpf()) || this.getRg().equals(c.getRg()))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		String cliente;
		cliente = "Nome: " + this.getNome() + "\n"+
		"RG: " + this.getRg() + "\n"+
		"CPF: " + this.getCpf() +"\n" +
		"Sexo: " + this.getSexo() + "\n" +
		"Nascimento: " + this.getNascimentoString() + "\n" +
		"Email: " + this.getEmail() + "\n"+
		"Telefone: " + this.getTelefone() + "\n";
		
		return cliente;
	}

}
