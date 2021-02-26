package telas.menu.Simulado;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import fachada.FachadaCoordenador;
import entidades.*;
import telas.menu.mainMenu;

public class ControllerSimulado implements Initializable {
    public TextField nome;
    public TextField data;
    public Button voltar;
    public TextField id;
    FachadaCoordenador fachadaCoordenador = new FachadaCoordenador();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void criarAct(ActionEvent actionEvent) {
        int cId;
        Simulado simulado = new Simulado(nome.getText(),data.getText());
        cId = simulado.getIdSimulado();
        id.setText(String.valueOf(cId));
        fachadaCoordenador.criarSimulado(simulado);
    }

    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuCoordenador");
    }
}