package telas.menu.Logins;

import exececoes.UsuarioInexistenteException;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import negocio.NegocioAluno;
import telas.menu.mainMenu;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLoginAluno implements Initializable {
    public TextField login;
    public PasswordField senha;
    public Button entrar;
    public TextField erros;
    public Button voltar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void entrarAct(ActionEvent actionEvent) {
        String Clogin = login.getText();
        String Csenha = senha.getText();
        NegocioAluno negocioAluno = new NegocioAluno();

        try {
            Boolean condicao = negocioAluno.login(Clogin,Csenha);
            if (condicao == true){
                mainMenu.mudancaTela("menuAluno");
            }
            else {
                erros.setText("usuario inesitente");
            }
            login.clear();
            senha.clear();

        } catch (UsuarioInexistenteException e) {
            erros.setText(e.getMessage());
        }

    }

    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuPrincipal");
    }
}
