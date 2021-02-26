package telas.menu.RemoverProfessor;

import exececoes.UsuarioInexistenteException;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import fachada.FachadaCoordenador;
import telas.menu.mainMenu;


public class ControllerRemoverProfessor implements Initializable {
    public TextField cpf;
    public TextField erros;
    public Button voltar;
    public Button remover;
    protected FachadaCoordenador fachadaCoordenador = new FachadaCoordenador();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuCoordenador");
    }

    public void removerAct(ActionEvent actionEvent) {
        try {
            fachadaCoordenador.removerProfessor(cpf.getText());
        } catch (UsuarioInexistenteException e) {
            erros.setText(e.getMessage());
        }

    }
}
