package telas.menu.MenuCoordenador;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import telas.menu.mainMenu;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMenuCoordenador implements Initializable {

    public Button addAluno;
    public Button addProfessor;
    public Button voltar;
    public Button removerAlu;
    public Button criarSimulado;
    public Button adicionarQ;
    public Button removerProf;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void addAlunoAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("cadAluno");
    }

    public void addProfessorAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("cadProfessor");
    }

    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuPrincipal");
    }

    public void RemoverAluAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("removerAluno");
    }



    public void criarSimuladoAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("criarSimulado");
    }

    public void adicionarQAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("AddQ");
    }

    public void removerProfAct(ActionEvent actionEvent) {mainMenu.mudancaTela("removerProf");
    }
}
