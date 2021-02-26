package telas.menu.MenuProfessor;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import telas.menu.mainMenu;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMenuProfessor implements Initializable {
    public Button cadQ;
    public Button voltar;
    public Button atuProf;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void cadQ(ActionEvent actionEvent) {
        mainMenu.mudancaTela("cadQuestao");

    }

    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuPrincipal");
    }

    public void atuprof(ActionEvent actionEvent) {
        mainMenu.mudancaTela("atuProf");
    }
}
