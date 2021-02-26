package telas.menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainMenu extends Application {
    private static Scene tMenuPrincipal;
    private static Scene tLoginAluno;
    private static Stage stage;
    private static Scene cadAluno;
    private static Scene menuCoordenador;
    private static Scene tMenuAluno;
    private static Scene logCoord;
    private static Scene cadProf;
    private static Scene tLoginProf;
    private static Scene tMenuProf;
    private static Scene tAtAluno;
    private static Scene tCadQuestao;
    private static Scene tRemoverAluno;
    private static Scene tCadCoordenador;
    private static Scene tCriarSimulado;
    private static Scene tCQuestao;
    private static Scene tRemoverProf;
    private static Scene tAtuProf;
    private static Scene tAutenticarSim;
    private static Scene tResponderSim;







    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        Parent menuPrincipal = FXMLLoader.load(getClass().getResource("MenuPrincipal/MenuPrincipal.fxml"));
        tMenuPrincipal = new Scene(menuPrincipal, 700, 600);

        Parent menuALuno = FXMLLoader.load(getClass().getResource("MenuAluno/MenuAluno.fxml"));
        tMenuAluno = new Scene(menuALuno, 800, 600);

        Parent loginAluno = FXMLLoader.load(getClass().getResource("Logins/LoginAluno.fxml"));
        tLoginAluno = new Scene(loginAluno, 800, 600);

        Parent menuProfessor = FXMLLoader.load(getClass().getResource("MenuProfessor/MenuProfessor.fxml"));
        tMenuProf = new Scene(menuProfessor, 800, 600);

        Parent loginProfessor = FXMLLoader.load(getClass().getResource("Logins/LoginProfessor.fxml"));
        tLoginProf = new Scene(loginProfessor, 800, 600);

        Parent  menuCord = FXMLLoader.load(getClass().getResource("MenuCoordenador/MenuCoordenador.fxml"));
        menuCoordenador = new Scene(menuCord, 800, 600);

        Parent loginCoordenador = FXMLLoader.load(getClass().getResource("Logins/LoginCoordenador.fxml"));
        logCoord = new Scene(loginCoordenador, 800, 600);

        Parent cadastrarCorrdenador = FXMLLoader.load(getClass().getResource("CadastroCoordenador/CadCoordenador.fxml"));
        tCadCoordenador = new Scene(cadastrarCorrdenador, 800, 600);

        Parent atualizarAluni = FXMLLoader.load(getClass().getResource("AtualizarAluno/AtualizarAluno.fxml"));
        tAtAluno = new Scene(atualizarAluni, 800, 600);


        Parent cadastraraluno = FXMLLoader.load(getClass().getResource("CadastrarAluno/CadAluno.fxml"));
        cadAluno = new Scene(cadastraraluno, 800, 600);


        Parent cadastrarProf = FXMLLoader.load(getClass().getResource("CadastrarProfessor/CadProfessor.fxml"));
        cadProf = new Scene(cadastrarProf, 800, 600);

        Parent cadastrarQuestao = FXMLLoader.load(getClass().getResource("AdicionarQuestao/TelaQuestao.fxml"));
        tCadQuestao = new Scene(cadastrarQuestao, 800, 600);

        Parent removerAluno = FXMLLoader.load(getClass().getResource("RemoverAluno/RemoverAluno.fxml"));
        tRemoverAluno = new Scene(removerAluno, 800, 600);

        Parent criarSimulado = FXMLLoader.load(getClass().getResource("Simulado/Simulado.fxml"));
        tCriarSimulado = new Scene(criarSimulado, 800, 600);

        Parent adicionarQS = FXMLLoader.load(getClass().getResource("AddQSimulado/AddQSimulado.fxml"));
        tCQuestao = new Scene(adicionarQS, 800, 600);

        Parent removProf = FXMLLoader.load(getClass().getResource("RemoverProfessor/RemoverProfessor.fxml"));
        tRemoverProf = new Scene(removProf, 800, 600);

        Parent atuprof = FXMLLoader.load(getClass().getResource("AtuProf.fxml"));
        tAtuProf = new Scene(atuprof, 800, 600);
/*
        Parent aTS = FXMLLoader.load(getClass().getResource("Autenticar.fxml"));
        tAutenticarSim = new Scene(aTS, 800, 600);

        Parent resp = FXMLLoader.load(getClass().getResource("TelaSimulado.fxml"));
        tResponderSim = new Scene(resp, 800, 600);
        */

        primaryStage.setScene(tMenuPrincipal);
        primaryStage.show();

    }

    public static void mudancaTela(String string) {
        switch (string) {
            case "menuPrincipal":
                stage.setScene(tMenuPrincipal);
                break;
            case "cadAluno":
                stage.setScene(cadAluno);
                break;
            case "menuCoordenador":
                stage.setScene(menuCoordenador);
                break;
            case "coordenadorLogin":
                stage.setScene(logCoord);
                break;
            case "cadProfessor":
                stage.setScene(cadProf);
                break;
            case "loginProf":
                stage.setScene(tLoginProf);
                break;
            case "menuProfessor":
                stage.setScene(tMenuProf);
                break;
            case "alunoLogin":
                stage.setScene(tLoginAluno);
                break;
            case "menuAluno":
                stage.setScene(tMenuAluno);
                break;
            case "atualizarAluno":
                stage.setScene(tAtAluno);
                break;
            case "removerAluno":
                stage.setScene(tRemoverAluno);
                break;
            case "cadQuestao":
                stage.setScene(tCadQuestao);
                break;
            case "cadCoordenador":
                stage.setScene(tCadCoordenador);
                break;
            case "criarSimulado":
                stage.setScene(tCriarSimulado);
                break;
            case "AddQ":
                stage.setScene(tCQuestao);
                break;
            case "removerProf":
                stage.setScene(tRemoverProf);
                break;
            case "atuProf":
                stage.setScene(tAtuProf);
                break;
            case "autenticar":
                stage.setScene(tAutenticarSim);
                break;
            case "responder":
                stage.setScene(tResponderSim);
                break;





        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
