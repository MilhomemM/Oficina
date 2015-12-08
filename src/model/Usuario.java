package model;

public class Usuario {
	private String login;
	private String senha;

	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean equals(Usuario u) {
		if (this.getLogin().equals(u.getLogin()))
			return true;
		else
			return false;
	}

	public String toString() {
		String usuario;
		usuario = "Login: " + this.getLogin() + "\n" + "Senha: " + this.getSenha() + "\n";
		return usuario;
	}
}
