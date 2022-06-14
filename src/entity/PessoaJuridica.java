package entity;

public class PessoaJuridica extends Pessoa {

	
	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String email, String senha, String confirmarSenha, String cnpj, String razaoSocial) {
		super(email, senha, confirmarSenha);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}	
}
