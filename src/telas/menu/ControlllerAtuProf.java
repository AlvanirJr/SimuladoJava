package telas.menu;

import fachada.FachadaProfessor;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ControlllerAtuProf implements Initializable {
    public TextField cpf;
    public TextField email;
    public PasswordField senha;
    public Button atualizar;
    public Button voltar;
    public TextField eventos;
    private FachadaProfessor fachadaProfessor = new FachadaProfessor();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void atualizar(ActionEvent actionEvent) {
        String msg = fachadaProfessor.updateProfessor(cpf.getText(),senha.getText());
        eventos.setText(msg);

    }

    public void voltar(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuProfessor");
    }
}
