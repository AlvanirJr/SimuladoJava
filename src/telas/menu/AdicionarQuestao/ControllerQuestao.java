package telas.menu.AdicionarQuestao;

import entidades.*;
import exececoes.AlternativasException;
import exececoes.CampoVazioException;
import exececoes.IdQuestaoException;
import exececoes.RespostaException;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import fachada.*;

import dados.*;
import telas.menu.mainMenu;


import java.net.URL;
import java.util.ResourceBundle;



public class ControllerQuestao implements Initializable {
    public TextArea enun;
    public TextField id;
    public TextField nivel;
    public Button enviar;
    public TextArea letraA;
    public TextArea letraB;
    public TextArea letraC;
    public TextArea letraD;
    public TextArea letraE;
    public CheckBox Ra;
    public CheckBox Rb;
    public CheckBox Rc;
    public CheckBox Rd;
    public CheckBox Re;
    public String resposta;
    public Button voltar;
    public TextField atuacao;
    public CheckBox bcc;
    public CheckBox letras;
    public CheckBox pedagogia;
    public CheckBox agronomia;
    public CheckBox uag;
    public CheckBox recife;
    public CheckBox serraTalhada;
    public TextField disciplina;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public boolean enviarGet(ActionEvent actionEvent) {
        boolean condicao = false;

        //tratamento dos itens
        String Venum = enun.getText();
        String VletraA = letraA.getText();
        String VletraB = letraB.getText();
        String VletraC = letraC.getText();
        String VletraD = letraD.getText();
        String VletraE = letraE.getText();
        String Vid = id.getText();
        String Vnivel = nivel.getText();
        int Vteste = Integer.parseInt(Vnivel);//conversao da variavel Vnivel para inteiro


        //tratamento do checkbox
        if(Ra.isSelected()){
            resposta = "a";
        }
        if(Rb.isSelected()){
            resposta = "b";
        }
        if(Rc.isSelected()){
            resposta = "c";
        }
        if(Rd.isSelected()){
            resposta = "d";
        }
        if(Re.isSelected()){
            resposta = "e";
        }


        try {
            FachadaProfessor fachadaProfessor = new FachadaProfessor();
            Questao questao = new Questao(Venum,VletraA,VletraB,VletraC,VletraD,VletraE,resposta,Integer.parseInt(Vnivel),criarNovaArea());
            fachadaProfessor.cadastrarQuestao(questao);
            id.setText(String.valueOf(questao.getId()));

        }
        catch (CampoVazioException|IdQuestaoException|RespostaException|AlternativasException e ){
            id.setText("erro");

        }
        return true;
    }


    public String selecionarCurso(){
        String cCurso;
        if (bcc.isSelected()){
            return  "BCC";
        }
        else if (letras.isSelected()){
            return  "letras";
        }
        else if (pedagogia.isSelected()){
            return  "pedagogia";
        }
        else if (agronomia.isSelected()){
            return  "agronomia";
        }
        else {
            return "";
        }
    }


    public String selecionarUniAcademica(){
        if (uag.isSelected()){
            return  "uag";
        }
        else if (recife.isSelected()){
            return  "recife";
        }
        else if (serraTalhada.isSelected()){
            return  "serra talhada";
        }
        else {
            return "";
        }

    }
    public Curso criarNovoCurso(){
        Curso curso = new Curso(selecionarCurso(),selecionarUniAcademica());
        return curso;
    }


    public AreaAtuacao criarNovaArea(){
        String Cdisciplina = disciplina.getText();
        AreaAtuacao areaAtuacao = new AreaAtuacao(Cdisciplina,criarNovoCurso());
        return areaAtuacao;
    }


    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuProfessor");
    }



}

