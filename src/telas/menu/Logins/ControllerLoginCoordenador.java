package telas.menu.Logins;

import exececoes.UsuarioInexistenteException;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import negocio.NegocioCoordenador;
import telas.menu.mainMenu;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLoginCoordenador implements Initializable {
    public TextField login;
    public PasswordField senha;
    public Button entrar;
    public TextField erros;
    public Button voltar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void entrarAct(ActionEvent actionEvent) {
        erros.clear();
        String Clogin = login.getText();
        String Csenha = senha.getText();
        NegocioCoordenador negocioCoordenador = new NegocioCoordenador();

        try {
            Boolean condicao = negocioCoordenador.login(Clogin,Csenha);
            if (condicao == true){
                mainMenu.mudancaTela("menuCoordenador");
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
