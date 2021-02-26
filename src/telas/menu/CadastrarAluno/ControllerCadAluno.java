package telas.menu.CadastrarAluno;
import exececoes.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

//importando classe do negocio
import dados.*;
import entidades.*;
import fachada.FachadaCoordenador;
import telas.menu.mainMenu;

public class ControllerCadAluno implements Initializable {
    public TextField nome;
    public TextField cpf;
    public PasswordField senha;
    public TextField email;
    //checkbox dos cursos
    public CheckBox bcc;
    public CheckBox letras;
    public CheckBox pedagogia;
    public CheckBox agronomia;
    //checkbox das unidades
    public CheckBox uag;
    public CheckBox recife;
    public CheckBox serraTalhada;
    //
    public Button cadastro;
    public TextField saida;
    public TextArea eventos;
    public Button voltar;
    public TextField aIngresso;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void cadastrarGet(ActionEvent actionEvent) {
        String cNome = nome.getText();
        String cCpf = cpf.getText();
        String cSennha = senha.getText();
        String cEmail = email.getText();
        Curso cCurso =criarNovoCurso() ;
        try {
            FachadaCoordenador fachadaCoordenador = new FachadaCoordenador();
            Aluno aluno = new Aluno(cNome,cCpf,cSennha,cEmail,cCurso,aIngresso.getText());
            fachadaCoordenador.addAluno(aluno);
            eventos.setText(" Aluno cadastrado com sucesso");

        }
        catch (TamanhoException a){
            eventos.setText(a.getMessage());
        }
        catch (SenhaTamanhoMinimoException b){
            eventos.setText(b.getMessage());
        }

        catch (CpfApenasNumerosException c ){
            eventos.setText(c.getMessage());
        }
        catch (CampoVazioException d){
            eventos.setText(d.getMessage());
        }
        catch (UsuariojaCadastrado usuariojaCadastrado) {
            eventos.setText(usuariojaCadastrado.getMessage());
        }


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

    public void voltarAct(ActionEvent actionEvent) {
        mainMenu.mudancaTela("menuCoordenador");
    }
}
