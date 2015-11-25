package model;

import java.util.Date;

public class Administrador extends Pessoa {
	Usuario usuario;
	String email;

	public Administrador(String nome, String rg, String cpf, String sexo, Date nascimento, String email,
			Usuario usuario) {
		super(nome, rg, cpf, sexo, nascimento);
		this.email = email;
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
	public void setNascimento(Date nascimento) {
		// TODO Auto-generated method stub
		super.setNascimento(nascimento);
	}
}
