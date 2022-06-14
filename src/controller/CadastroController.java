package controller;

import boundary.CadastroEnderecoView;
import boundary.CadastroPessoaView;
import controller.helper.CadastroEnderecoHelper;
import controller.helper.CadastroPessoaFisicaHelper;
import db.DAO.EnderecoDAO;
import db.DAO.PessoaFisicaDAO;
import entity.Endereco;
import entity.PessoaFisica;

public class CadastroController {

	private CadastroPessoaFisicaHelper helper;
	private CadastroEnderecoHelper helperEndereco;
	
	public CadastroController (CadastroPessoaView view) { //Recebendo os dados da tela (view) por parametro
		this.helper = new CadastroPessoaFisicaHelper(view); //Preparando os dados que estão chegando no controller para passar para os modelo (entity)
	}
	
	public CadastroController (CadastroEnderecoView viewEndereco) {
		this.helperEndereco = new CadastroEnderecoHelper (viewEndereco);
	}

	//Regra de negocio de cadastro de pessoas
	public Endereco enderecoCad () {
		Endereco end = helperEndereco.obterModelo();
		return end;
	}

	public PessoaFisica proximaPagina () {
		//Mudando de Tela (Cadastro --> Endereço)
		PessoaFisica pf = helper.obterModelo();
		return pf;
	}
	
	public void gravarBanco (PessoaFisica pf, Endereco end) {
		PessoaFisicaDAO pfDAO = new PessoaFisicaDAO();
		pfDAO.insert(pf);
		
		EnderecoDAO endDAO = new EnderecoDAO();
		endDAO.insert(end);
	}
}
