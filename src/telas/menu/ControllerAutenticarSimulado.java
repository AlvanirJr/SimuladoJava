/*
package telas.menu;

import exececoes.SimuladoNaoEncontradoException;
import exececoes.UsuarioInexistenteException;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import dados.*;
import fachada.FachadaAluno;

public class ControllerAutenticarSimulado implements Initializable {
    public TextField cpf;
    public TextField id;
    public TextArea listaSimulado;
    public Button voltarAct;
    public Button okAct;
    public TextField eventos;
    FachadaAluno fachadaAluno = new FachadaAluno();




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }



    public void voltarAct(ActionEvent actionEvent) {
    }

    public void okAct(ActionEvent actionEvent) {
        try {
            Boolean condicao = fachadaAluno.AutenticarSimulado(Integer.parseInt(id.getText()), cpf.getText());
            if(condicao == true){
                mainMenu.mudancaTela("responder");
            }
        } catch (SimuladoNaoEncontradoException e) {
            eventos.setText(e.getMessage());
        } catch (UsuarioInexistenteException e) {
            eventos.setText(e.getMessage());
        }

    }

    public void listarSimulado(){
        ArrayList lista = fachadaAluno.listaSimulado();
        listaSimulado.setText(lista.toString());
    }
}
*/