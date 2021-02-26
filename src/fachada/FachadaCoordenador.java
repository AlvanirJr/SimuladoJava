package fachada;

import java.util.ArrayList;

import entidades.Aluno;
import entidades.Coordenador;
import entidades.Curso;
import entidades.Professor;
import entidades.Questao;
import entidades.Simulado;
import exececoes.CursoException;
import exececoes.QuestaoNaoCadastradaException;
import exececoes.SimuladoNaoEncontradoException;
import exececoes.UsuarioInexistenteException;
import exececoes.UsuariojaCadastrado;
import negocio.ILoginUsuario;
import negocio.NegocioCoordenador;
import negocio.NegocioQuestao;
import negocio.NegocioSimulado;

public class FachadaCoordenador {
	private NegocioCoordenador negocioCoordenador;
	private NegocioSimulado negocioSimulado;
	private NegocioQuestao negocioQuestao;
	private ILoginUsuario loginCoordenador;
	
	
	public FachadaCoordenador() {
		this.negocioCoordenador = new NegocioCoordenador();
		this.negocioSimulado = new NegocioSimulado();
		this.negocioQuestao = new NegocioQuestao();
		this.loginCoordenador = new NegocioCoordenador();
	}
	
	/**
	 * Login para coordenador
	 * @param cpf
	 * @param senha
	 * @throws UsuarioInexistenteException
	 */
	public boolean loginCoordenador(String cpf, String senha) throws UsuarioInexistenteException {
		return 	loginCoordenador.login(cpf, senha);
	}
	/**
	 * Cadastro de Coordenador
	 * @param coordenador
	 * @return
	 * @throws UsuariojaCadastrado
	 */
	public boolean addCoordenador(Coordenador coordenador) throws UsuariojaCadastrado {
		return negocioCoordenador.adicionarCoordenador(coordenador);
	}
	/**
	 * Cadastro de Aluno realizado pelo coordenador
	 * @param aluno
	 * @return
	 * @throws UsuariojaCadastrado
	 */
	public boolean addAluno(Aluno aluno) throws UsuariojaCadastrado {
		return negocioCoordenador.cadastrarAluno(aluno);
	}
	/**
	 * Cadastro de Professor
	 * @param professor
	 * @return
	 * @throws UsuariojaCadastrado
	 */
	public boolean addProfessor(Professor professor) throws UsuariojaCadastrado {
		return negocioCoordenador.cadastrarProfessor(professor);
	}
	
	/**
	 * cadastro de curso
	 * @param curso
	 * @return
	 * @throws CursoException
	 */
	public boolean addCurso(Curso curso) throws CursoException {
		return negocioCoordenador.cadastrarCurso(curso);
	}
	/**
	 * remoção de aluno
	 * @param cpf
	 * @return
	 * @throws UsuarioInexistenteException
	 */
	public boolean removerAluno(String cpf) throws UsuarioInexistenteException {
		return negocioCoordenador.removerAluno(cpf);
	}
	
	/**
	 * Remoção de professor
	 * @param cpf
	 * @return
	 * @throws UsuarioInexistenteException
	 */
	public boolean removerProfessor(String cpf) throws UsuarioInexistenteException {
		return negocioCoordenador.removerProfessor(cpf);
	}
	/**
	 * Coordendor cria um simulado
	 * @param simulado
	 * @return
	 */
	public boolean criarSimulado(Simulado simulado) {
		return negocioSimulado.criarSimulado(simulado);
	}
	/**
	 * cadastra uma questão no simulado
	 * @param idQuestao
	 * @param idSimulado
	 * @return
	 * @throws SimuladoNaoEncontradoException 
	 * @throws QuestaoNaoCadastradaException 
	 */
	public boolean inserirQuestao(int idQuestao, int idSimulado) throws SimuladoNaoEncontradoException, QuestaoNaoCadastradaException {
		return negocioSimulado.inserirQuestao(idQuestao, idSimulado);

	}
	/**
	 * retorna lista de simulados
	 * @return
	 */
	public ArrayList<Simulado> lista(){
		return negocioSimulado.listaSimulado();
	}
	
	public ArrayList<Questao> listaQuestao(){
		return negocioQuestao.listadeQuestoes();
	}
	
	
}
