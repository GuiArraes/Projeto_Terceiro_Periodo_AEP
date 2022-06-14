package entity;

public class Pessoa {
	
	protected String email;
	protected String senha;
	protected String confirmarSenha;
	
	public Pessoa () {
	}
	
	public Pessoa(String email, String senha, String confirmarSenha) {
		this.email = email;
		this.senha = senha;
		this.confirmarSenha = confirmarSenha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}
	
	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}
}
