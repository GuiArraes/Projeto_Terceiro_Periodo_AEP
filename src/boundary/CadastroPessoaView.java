package boundary;

import java.io.IOException;

import controller.CadastroController;
import entity.PessoaFisica;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroPessoaView {

    @FXML
    private Button btProsseguir;
    
    @FXML
    private TextField txtNome, txtEmail, txtCPF;
    
    @FXML
    private PasswordField txtSenha, txtConfirmarSenha;


	private CadastroController controller;
    
    public CadastroPessoaView() {
    	controller = new CadastroController(this); // Fazendo a DEPENDENCIA DO controller COM A view (Passando a view como parametro para o controller)
    }
    
	@FXML
	public void onActionBtProsseguir(ActionEvent event) {

		try {
			PessoaFisica pf = this.controller.proximaPagina();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/boundary/CadastroEnderecoView.fxml"));
			Parent root = loader.load();

			// Get controller of scene2
			CadastroEnderecoView cadastroEnderecoView = loader.getController();
			// Pass watever data you want. Can have multiple method calls here
			cadastroEnderecoView.recebeInformacao(pf);

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

	public TextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(TextField txtNome) {
		this.txtNome = txtNome;
	}

	public TextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(TextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public TextField getTxtCPF() {
		return txtCPF;
	}

	public void setTxtCPF(TextField txtCPF) {
		this.txtCPF = txtCPF;
	}

	public PasswordField getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(PasswordField txtSenha) {
		this.txtSenha = txtSenha;
	}

	public PasswordField getTxtConfirmarSenha() {
		return txtConfirmarSenha;
	}

	public void setTxtConfirmarSenha(PasswordField txtConfirmarSenha) {
		this.txtConfirmarSenha = txtConfirmarSenha;
	}

}
