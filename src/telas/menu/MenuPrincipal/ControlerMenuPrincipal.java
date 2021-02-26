package telas.menu.MenuPrincipal;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import telas.menu.mainMenu;

import java.net.URL;
import java.util.ResourceBundle;

public class ControlerMenuPrincipal implements Initializable {
    public Button aluno;
    public Button coordenador;
    public Button professor;
    public TextField BackCoordenador;
    public Button ok;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void alunoAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("alunoLogin");
    }


    public void Coordenador(ActionEvent actionEvent) {
        mainMenu.mudancaTela("coordenadorLogin");
    }

    public void professorAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("loginProf");
    }

    public void BackCoordenador(ActionEvent actionEvent) {

    }

    public void okAct(ActionEvent actionEvent) {
        String senha = BackCoordenador.getText();
        if (senha.equals("cord01")){
            mainMenu.mudancaTela("cadCoordenador");
        }
    }
}
