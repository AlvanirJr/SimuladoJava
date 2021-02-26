package telas.menu.MenuAluno;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import telas.menu.mainMenu;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMenuAluno implements Initializable {


    public Button responder;
    public Button atualizar;
    public Button resultado;
    public Button voltar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void responderSimulado(ActionEvent actionEvent) {
        mainMenu.mudancaTela("autenticar");
    }

    public void atualizar(ActionEvent actionEvent) {
        mainMenu.mudancaTela("atualizarAluno");

    }

    public void resultSimulado(ActionEvent actionEvent) {
    }

    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuPrincipal");
    }
}