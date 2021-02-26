
package negocio;

import java.util.ArrayList;
import java.util.Scanner;

import dados.IRepositorioAluno;
import dados.IRepositorioQuestao;
import dados.IRepositorioRespostaAluno;
import dados.IRepositorioSimulado;
import dados.RepositorioAluno;
import dados.RepositorioQuestao;
import dados.RepositorioRespostaAluno;
import dados.RepositorioSimulado;
import entidades.Questao;
import entidades.Simulado;
import entidades.Aluno;
import entidades.AlunoSimulado;
import entidades.Historico;
import exececoes.QuestaoNaoCadastradaException;
import exececoes.SimuladoNaoEncontradoException;
import exececoes.UsuarioInexistenteException;

public class NegocioAluno implements ILoginUsuario {
    private IRepositorioAluno repositorioAluno;
    private IRepositorioRespostaAluno repositorioRespostaAluno;
    private IRepositorioSimulado repositorioSimulado;
    private IRepositorioQuestao repositorioQuestao;
    private NegocioHistorico negocioHistorico;
    private String resposta;
    private ArrayList<String> resultadoFinal;


    public NegocioAluno() {
        this.repositorioAluno = RepositorioAluno.getInstancia();
        this.repositorioRespostaAluno = RepositorioRespostaAluno.getInstancia();
        this.repositorioSimulado = RepositorioSimulado.getInstancia();
        this.repositorioQuestao = RepositorioQuestao.getInstancia();
        this.negocioHistorico = new NegocioHistorico();
        this.resultadoFinal = new ArrayList<String>();
        this.resposta = resposta;


    }


    @Override
    public boolean login(String cpf, String senha) throws UsuarioInexistenteException {
        int busca = repositorioAluno.buscarAluno(cpf);
        boolean sucesso = false;
        if (busca != -1) {
            for (int i = 0; i < this.repositorioAluno.getLista().size(); i++) {
                if (this.repositorioAluno.getLista().get(i).getCpf().equals(cpf)) {
                    if (this.repositorioAluno.getLista().get(i).getSenha().equals(senha)) {
                        sucesso = true;
                    }
                }
            }

        } else {
            //sucesso =  false;
            throw new UsuarioInexistenteException();
        }
        return sucesso;
    }


    /**
     * Usado para que o aluno possa responder o simulado
     *
     * @param idSimulado
     * @param cpf
     * @return
     * @throws SimuladoNaoEncontradoException
     * @throws QuestaoNaoCadastradaException
     */
    //Inserir exeção caso idSimulado ou CPf não sejam encontrados
    public boolean responderSimulado(int idSimulado, String cpf) throws SimuladoNaoEncontradoException, UsuarioInexistenteException {
        boolean cao;
        autenticarSimulado(idSimulado, cpf);
        Simulado verId = repositorioSimulado.simulado(idSimulado);
        int verCpf = repositorioAluno.buscarAluno(cpf);
        if (verId != null && verCpf != -1) {
            ArrayList<String> listaResposta = new ArrayList<String>();
            for (Integer questao : verId.getListaQuestao()) {
                Questao impQuestao = repositorioQuestao.buscarQuestao(questao);
                if (impQuestao != null) {
                    System.out.println(impQuestao.toString());
                    Scanner sc = new Scanner(System.in);
                    System.out.println("\nQual a alternativa correta:");
                    resposta = sc.next();
                    listaResposta.add(resposta);

                }
            }
            repositorioRespostaAluno.addRespostaAluno(new AlunoSimulado(listaResposta, cpf));
            cao = true;
        } else {

            cao = false;
        }
        return cao;
    }


    /**
     * Assim o aluno pode ver o resultado do simuludo que se foi respondido
     *
     * @param idSimulado
     * @param cpf
     * @return
     * @throws SimuladoNaoEncontradoException
     * @throws QuestaoNaoCadastradaException
     */
    public ArrayList<String> simuladoResultado(int idSimulado, String cpf) throws UsuarioInexistenteException, SimuladoNaoEncontradoException {
        autenticarSimulado(idSimulado, cpf);
        resultadoFinal.clear();
        Simulado verId = repositorioSimulado.simulado(idSimulado);
        int verCpf = repositorioAluno.buscarAluno(cpf);
        if (verId != null && verCpf != -1) {
            ArrayList<Integer> listaPontuacao = new ArrayList<>();
            ArrayList<String> lista = new ArrayList<String>();
            for (Integer idQuestao : verId.getListaQuestao()) {
                Questao questao = repositorioQuestao.buscarQuestao(idQuestao);
                int i = verId.getListaQuestao().indexOf(questao.getId());
                String resultado = "Questao " + questao.getId() + ":";
                if (questao.getResposta().equals(repositorioRespostaAluno.compararResposta().get(i))) {
                    resultado += "correta." + "\n";
                    listaPontuacao.add(questao.getNivel());
                } else {
                    resultado += "Errada - Alternativa Correta: " + questao.getResposta() + "\n";
                    listaPontuacao.add(0);
                }
                resultadoFinal.add(resultado.toString().replace(", ", ""));


            }
            negocioHistorico.inserirHistorico(verId, cpf, listaPontuacao);
        }

        return resultadoFinal;


    }

    /**
     * Verifica se aluno esta cadastrado para que se possa realizar a alteração dos seus dados
     *
     * @param cpf
     * @param senha
     * @param email
     * @return
     */

    public String atualizarAluno(String cpf, String senha, String email) {
        int aux = repositorioAluno.buscarAluno(cpf);
        String confirmacao = null;
        if (aux != -1) {
            repositorioAluno.atualizarAluno(cpf, senha, email);
            confirmacao = "Dados atualizados com sucesso";
        } else {
            confirmacao = "Os dados informadados não foram atualizados";
        }
        return confirmacao;
    }



    /*
     * Lembrar da chamda polimorfica do metodo de login!!!!!!!
     */


    public void autenticarSimulado(int idSimulado, String cpf) throws UsuarioInexistenteException, SimuladoNaoEncontradoException {
        int buscaaluno = repositorioAluno.buscarAluno(cpf);
        int buscaSimualado = repositorioSimulado.buscaSimulado(idSimulado);
        if (buscaaluno == -1) {
            throw new UsuarioInexistenteException();
        } else if (buscaSimualado == -1) {
            throw new SimuladoNaoEncontradoException();
        }

    }
}