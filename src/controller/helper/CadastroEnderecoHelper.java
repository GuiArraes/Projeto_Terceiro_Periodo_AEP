package controller.helper;

import boundary.CadastroEnderecoView;
import entity.Endereco;

public class CadastroEnderecoHelper {
	
	private CadastroEnderecoView viewEndereco;
	
	public CadastroEnderecoHelper (CadastroEnderecoView viewEndereco) {
		super ();
		this.viewEndereco = viewEndereco;
	}
	
	public Endereco obterModelo () {
		String cep = viewEndereco.getTxtCEP().getText();
		String logradouro = viewEndereco.getTxtLogradouro().getText();
		String numero = viewEndereco.getTxtNumero().getText();
		String complemento = viewEndereco.getTxtComplemento().getText();
		String bairro = viewEndereco.getTxtBairro().getText();
		String cidade = viewEndereco.getTxtCidade().getText();
		
		Endereco model = new Endereco(cep, logradouro, numero, complemento, bairro, cidade);
		
		return model;
	}
	
	public void setarModelo (Endereco modelo) {
		String cep = modelo.getCep();
		String logradouro = modelo.getLogradouro();
		String numero = modelo.getNumero();
		String complemento = modelo.getComplemento();
		String bairro = modelo.getBairro();
		String cidade = modelo.getCidade();
		
		viewEndereco.getTxtCEP().setText(cep);
		viewEndereco.getTxtLogradouro().setText(logradouro);
		viewEndereco.getTxtNumero().setText(numero);
		viewEndereco.getTxtComplemento().setText(complemento);
		viewEndereco.getTxtBairro().setText(bairro);
		viewEndereco.getTxtCidade().setText(cidade);
	}
	
	public void limparTela () {
		viewEndereco.getTxtCEP().setText("");
		viewEndereco.getTxtLogradouro().setText("");
		viewEndereco.getTxtNumero().setText("");
		viewEndereco.getTxtComplemento().setText("");
		viewEndereco.getTxtBairro().setText("");
		viewEndereco.getTxtCidade().setText("");
	}
}
