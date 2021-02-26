package mainSimulado;

import java.util.Date;

import dados.RepositorioAluno;
import dados.RepositorioCoordenador;
import dados.RepositorioQuestao;
import entidades.*;
import exececoes.AlternativasException;
import exececoes.CampoVazioException;
import exececoes.CpfApenasNumerosException;
// import exececoes.EmailInvalidoException;
import exececoes.IdQuestaoException;
import exececoes.QuestaoNaoCadastradaException;
import exececoes.RespostaException;
import exececoes.SenhaTamanhoMinimoException;
import exececoes.SimuladoNaoEncontradoException;
import exececoes.TamanhoException;
import exececoes.UsuarioInexistenteException;
import exececoes.UsuariojaCadastrado;
import fachada.FachadaAluno;
import fachada.FachadaCoordenador;
import fachada.FachadaProfessor;
import negocio.*;

/**
 * Usado para realizar os testes do sistema
 *
 * @author Alvanir Júnior
 *
 */
public class MainTeste {

    public static void main(String args[])throws UsuarioInexistenteException, CpfApenasNumerosException, TamanhoException, CampoVazioException,SenhaTamanhoMinimoException, IdQuestaoException, AlternativasException, RespostaException, UsuariojaCadastrado, SimuladoNaoEncontradoException, QuestaoNaoCadastradaException  {
        String enunciado, a,b,c,d,e;

        //    FachadaAluno fa =  new FachadaAluno();
        NegocioQuestao nq = new NegocioQuestao();
        NegocioAluno na = new NegocioAluno();
        FachadaProfessor fp = new FachadaProfessor();
        FachadaCoordenador fc =  new FachadaCoordenador();
        FachadaAluno fachadaAluno =  new FachadaAluno();
        NegocioCoordenador nc = new NegocioCoordenador();
        NegocioProfessor np =  new NegocioProfessor();
        RepositorioAluno rp = new RepositorioAluno();
        String data = "2000" ;
        NegocioSimulado ns = new NegocioSimulado();
        Curso curso = new Curso("Ciencia da Computação", "UFRPE-UAG");
        Curso curso2 = new Curso("Ciencia da Computação", "UFRPE-UAG");
        AreaAtuacao area = new AreaAtuacao("Programaçao", curso);
        Aluno aluno = new Aluno("Alvanir", "08283519450", "123456", "alvanirjr95@gmail.com", curso, "2018.1");
        Aluno aluno1 = new Aluno("Junior", "08283519451", "123456", "alvanirjr95@gmail.com", curso, "2018.2");
        Coordenador coordenador = new Coordenador("Rodrigo", "12345678901", "teste11", "alaldalda", curso, area, "12344");
        Professor professor = new Professor("Thais", "99991111921", "12345678", "tata@gmail.com", curso, area);
        Simulado simulado = new Simulado("Simulado1", data);
        Simulado simulado2 = new Simulado("Simulado2", data);


        fc.addCoordenador(coordenador);
        //fc.addCoordenador(coordenador);
        //System.out.println(fc.addProfessor(professor));
        fc.addAluno(aluno1);
        fc.addAluno(aluno);
        //fc.addAluno(aluno);
        //System.out.println(fp.loginProfessor(professor.getCpf(), professor.getSenha()));
        //np.login("99991111921", "12345678");

        Questao q = new Questao("Quem é considereado o pai da computação?", "Alan turing", "Bill Gates", "Rodrigo Gusmão", "Ronaldo", "Pele", "a", 1, area);
        Questao q1 = new Questao("Qual desses não é um sistema operacional?", "java", "unix", "linux", "ios", "android", "a", 10, area);
        Questao q2 =  new Questao("O que é hardware?", "É a parte física do computador", "É a parte lógica do computador", "É a parte biológica do computador", "É o windows 95", "É uma página de livro", "a", 3, area);

        fp.cadastrarQuestao(q);
        fp.cadastrarQuestao(q1);
        fp.cadastrarQuestao(q2);
        //System.out.println(fc.listaQuestao());
        fc.criarSimulado(simulado);
        fc.criarSimulado(simulado2);
        fc.inserirQuestao(0, 0);
        fc.inserirQuestao(1, 0);
        fc.inserirQuestao(2, 0);
        fachadaAluno.responderSimulado(0, aluno1.getCpf());
        System.out.println(fachadaAluno.resultadoSimulado(0, aluno1.getCpf()));
        fachadaAluno.responderSimulado(0, aluno.getCpf());
        System.out.println(fachadaAluno.resultadoSimulado(0, aluno.getCpf()));
        System.out.println(fachadaAluno.rankingPontos(0));
        System.out.println(fachadaAluno.rankingSimulado(0));


    }
}
