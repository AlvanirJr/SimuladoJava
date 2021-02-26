package telas.menu.AddQSimulado;

import exececoes.QuestaoNaoCadastradaException;
import exececoes.SimuladoNaoEncontradoException;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import negocio.NegocioSimulado;
import telas.menu.mainMenu;
import dados.RepositorioQuestao;

public class ControllerAddQSimulado implements Initializable {

    public TextField idS;
    public TextField idQ;
    public Button adicionar;
    public Button voltar;
    public TextField saida;
    public TextArea listaQ;
    NegocioSimulado negocioSimulado = new NegocioSimulado();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void adicionarAct(ActionEvent actionEvent) {
        Boolean condicao = null;
        try {
            condicao = negocioSimulado.inserirQuestao(Integer.parseInt(idQ.getText()),Integer.parseInt(idS.getText()));
        } catch (SimuladoNaoEncontradoException e) {
            saida.setText(e.getMessage());
        } catch (QuestaoNaoCadastradaException e) {
            saida.setText(e.getMessage());
        }
        if (condicao == true){
            saida.setText("questão cadastrada");
        }
    }

    public void listaQuestao(){
        RepositorioQuestao repositorioQuestao = RepositorioQuestao.getInstancia();
        ArrayList lista;
        lista = repositorioQuestao.getListaQuestao();
        listaQ.setText(lista.toString());
    }

    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuCoordenador");
    }
}
