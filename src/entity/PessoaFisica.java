package entity;

public class PessoaFisica extends Pessoa {

	private String nome;
	private String cpf;
	
	public PessoaFisica () {
		super();
	}
	
	public PessoaFisica(String email, String senha, String confirmarSenha, String nome, String cpf) {
		super(email, senha, confirmarSenha);
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
