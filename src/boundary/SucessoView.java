package boundary;

import java.io.IOException;

import db.DB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SucessoView {
	
	@FXML
	public void onActionBtOk(ActionEvent event) {
		try {
		Parent root = FXMLLoader.load(getClass().getResource("/boundary/CadastroPessoaView.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.setTitle("GreenBox - Implementação Java");
		stage.setResizable(false);
		stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onActionBtSair () {
		DB.closeConnection();
		System.out.println("Fechei o Banco de Dados");
		System.exit(0);
	}
}
