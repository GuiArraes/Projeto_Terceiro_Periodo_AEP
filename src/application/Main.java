package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


	@Override
	public void start(Stage stage) throws IOException {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/boundary/CadastroPessoaView.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("GreenBox - Implementação Java");
			stage.setResizable(false);
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args); // Metodo estatico da classe Application que inicializa a aplicação JavaFX 
	}
}
