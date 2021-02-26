package telas.menu.AtualizarAluno;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import negocio.NegocioAluno;
import telas.menu.mainMenu;

public class ControllerAtualizarAluno implements Initializable {
    public TextField eventos;
    private NegocioAluno negocioAluno = new NegocioAluno();
    public TextField cpf;
    public TextField senha;
    public TextField email;
    public Button cadastro;
    public Button voltar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void cadastrarGet(ActionEvent actionEvent) {
        String campo = negocioAluno.atualizarAluno(cpf.getText(),senha.getText(),email.getText());
        eventos.setText(campo);

    }

    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuAluno");
    }
}
