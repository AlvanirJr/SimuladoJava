/*
package telas.menu;

import dados.RepositorioRespostaAluno;
import entidades.Questao;
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
import fachada.FachadaAluno;
import dados.RepositorioQuestao;
import negocio.NegocioAluno;

public class ControllerTelaSimulado implements Initializable {


    public TextArea enuciado;
    public TextArea letraA;
    public TextArea letraB;
    public TextArea letraC;
    public TextArea LetraE;
    public TextArea LetraD;
    public TextField resposta;
    public TextField id;
    public TextField cpf;
    public Button voltar;
    public Button exibir;
    public TextArea acertos;
    public Button verAcertos;
    private FachadaAluno fachadaAluno = new FachadaAluno();
    private RepositorioQuestao repositorioQuestao = RepositorioQuestao.getInstancia();
    private RepositorioRespostaAluno repositorioRespostaAluno = RepositorioRespostaAluno.getInstancia();
    private NegocioAluno negocioAluno = new NegocioAluno();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public ArrayList exibirEnunciado(){
        ArrayList<String> listaresposta = new ArrayList<String>();
        try {
            ArrayList<Integer> listaIdQuestao = fachadaAluno.pegarListaIdQuestao(Integer.parseInt(id.getText()),cpf.getText());
            for (int i = 0; i< listaIdQuestao.size(); i++) {
                int listaIdQuestao1 = listaIdQuestao.get(i);
                Questao questao = repositorioQuestao.buscarQuestao(listaIdQuestao1);
                System.out.print(questao);
                enuciado.setText(questao.getEnunciado());
                letraA.setText(questao.getA());
                letraB.setText(questao.getB());
                letraC.setText(questao.getC());
                LetraD.setText(questao.getD());
                LetraE.setText(questao.getE());
                listaresposta.add(resposta.getText());
            }
            return listaresposta;
        } catch (UsuarioInexistenteException e) {
            e.printStackTrace();
        } catch (SimuladoNaoEncontradoException e) {
            e.printStackTrace();
        }
        return listaresposta;
    }
    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuCoordenador");
    }

    public void exibir(ActionEvent actionEvent) {
        exibirEnunciado();
    }

    public void verAcertos(ActionEvent actionEvent) {
        try {
            ArrayList<String> acertos1 = negocioAluno.simuladoResultado(Integer.parseInt(id.getText()),cpf.getText());
            acertos.setText(acertos1.toString());
        } catch (UsuarioInexistenteException e) {
            e.printStackTrace();
        } catch (SimuladoNaoEncontradoException e) {
            e.printStackTrace();
        }


    }
}

*/