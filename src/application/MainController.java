package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
@FXML
private Label lblCadastrar;
@FXML
private TextField txtNome;
@FXML
private TextField txtSobrenome;
@FXML
private TextField txtidade;
@FXML
private PasswordField txtPassword;

public void Cadastrar(ActionEvent event) throws IOException {
	if(txtNome.getText().equals("Pedro") && txtSobrenome.getText().equals("Cortez") && txtPassword.getText().equals("140586")) {
		lblCadastrar.setText("Cadastro Realizado.");
		txtNome.setText("");
		/*Parent root = FXMLLoader.load(getClass().getResource("/application/Sucesso.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show(); */
		
	}else {
		lblCadastrar.setText("Erro no Cadastro.");
		/*Parent root = FXMLLoader.load(getClass().getResource("/application/Erro.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();*/
	}
	limparCampos();
}
public void limparCampos() {
	txtNome.setText("");
	txtSobrenome.setText("");
	txtidade.setText("");
	txtPassword.setText("");
	
}

}
