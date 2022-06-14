package controller.helper;

import boundary.CadastroPessoaView;
import entity.PessoaFisica;

public class CadastroPessoaFisicaHelper {
	
	private final CadastroPessoaView view;

	public CadastroPessoaFisicaHelper(CadastroPessoaView view) {
		this.view = view;
	}
	
	public PessoaFisica obterModelo() {
		String email = view.getTxtEmail().getText();
		String senha = view.getTxtSenha().getText();
		String confirmarSenha = view.getTxtConfirmarSenha().getText();	
		String nome = view.getTxtNome().getText();
		String cpf = view.getTxtCPF().getText();
		
		PessoaFisica modelo = new PessoaFisica(email, senha, confirmarSenha, nome, cpf);
		
		return modelo;
	}
	
	public void setarModelo (PessoaFisica modelo) {
		String nome = modelo.getNome();
		String email = modelo.getEmail();
		String cpf = modelo.getCpf();
		String senha = modelo.getSenha();
		String confirmarSenha = modelo.getConfirmarSenha();
		
		view.getTxtNome().setText(nome);
		view.getTxtEmail().setText(email);
		view.getTxtCPF().setText(cpf);
		view.getTxtSenha().setText(senha);
		view.getTxtConfirmarSenha().setText(confirmarSenha);
	}
	
	public void limparTela () {
		view.getTxtNome().setText("");
		view.getTxtEmail().setText("");
		view.getTxtSenha().setText("");
		view.getTxtConfirmarSenha().setText("");
	}
}
