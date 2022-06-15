package boundary;

import java.io.IOException;

import controller.CadastroController;
import entity.Endereco;
import entity.PessoaFisica;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroEnderecoView {
	
    @FXML
    private Button btCadastrar;
    @FXML
    private TextField txtBairro, txtCEP, txtCidade, txtComplemento, txtLogradouro, txtNumero;
    
    private PessoaFisica pessoaFisica;

	private final CadastroController controller;

    
    public CadastroEnderecoView() {
		controller = new CadastroController (this); //Passando CadastroEnderecoView para o controller
	}
    
    public void recebeInformacao (PessoaFisica pf) {
    	pessoaFisica = new PessoaFisica();

    	this.pessoaFisica.setNome(pf.getNome());
    	this.pessoaFisica.setEmail(pf.getEmail());
    	this.pessoaFisica.setCpf(pf.getCpf());
    	this.pessoaFisica.setSenha(pf.getSenha());
    	this.pessoaFisica.setConfirmarSenha(pf.getConfirmarSenha());
    }
    
	@FXML
    void onActionBtCadastrar(ActionEvent event) {
		try {
			PessoaFisica pf = new PessoaFisica(pessoaFisica.getEmail(), pessoaFisica.getSenha(), pessoaFisica.getConfirmarSenha(), pessoaFisica.getNome(), pessoaFisica.getCpf());
			Endereco end = this.controller.enderecoCad(); //Obtem o model (entity) de Endereco

			this.controller.gravarBanco(pf, end);           

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/boundary/SucessoView.fxml"));
			Parent root = loader.load();
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("GreenBox - Implementação Java");
			stage.setResizable(false);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public TextField getTxtBairro() {
		return txtBairro;
	}

	public void setTxtBairro(TextField txtBairro) {
		this.txtBairro = txtBairro;
	}

	public TextField getTxtCEP() {
		return txtCEP;
	}

	public void setTxtCEP(TextField txtCEP) {
		this.txtCEP = txtCEP;
	}

	public TextField getTxtCidade() {
		return txtCidade;
	}

	public void setTxtCidade(TextField txtCidade) {
		this.txtCidade = txtCidade;
	}

	public TextField getTxtComplemento() {
		return txtComplemento;
	}

	public void setTxtComplemento(TextField txtComplemento) {
		this.txtComplemento = txtComplemento;
	}

	public TextField getTxtLogradouro() {
		return txtLogradouro;
	}

	public void setTxtLogradouro(TextField txtLogradouro) {
		this.txtLogradouro = txtLogradouro;
	}

	public TextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(TextField txtNumero) {
		this.txtNumero = txtNumero;
	}
}
