package fachada;

import java.util.ArrayList;

import entidades.Ranking;
import entidades.RankingPontuacao;
import entidades.RankingSimulado;
import entidades.Simulado;
import exececoes.QuestaoNaoCadastradaException;
import exececoes.SimuladoNaoEncontradoException;
import exececoes.UsuarioInexistenteException;
import negocio.ILoginUsuario;
import negocio.NegocioAluno;
import negocio.NegocioHistorico;
import negocio.NegocioSimulado;

public class FachadaAluno {
	private NegocioAluno negocioAluno;
	private NegocioHistorico negocioHistorico;
	private ILoginUsuario loginAluno;
	private Ranking rankingPontos;
	private Ranking rankingSimulado;
	private NegocioSimulado negocioSimulado;





	public FachadaAluno() {
		this.negocioAluno = new NegocioAluno();
		this.loginAluno = new NegocioAluno();
		this.rankingPontos =  new RankingPontuacao();
		this.rankingSimulado = new RankingSimulado();
		this.negocioHistorico =  new NegocioHistorico();
		this.negocioSimulado = new NegocioSimulado();



	}

	public boolean loginAluno(String cpf, String senha) throws UsuarioInexistenteException  {
		return loginAluno.login(cpf, senha);
	}

	public boolean responderSimulado(int idSimulado, String cpf) throws SimuladoNaoEncontradoException, UsuarioInexistenteException {
		return negocioAluno.responderSimulado(idSimulado, cpf);

	}
	public ArrayList<String> resultadoSimulado(int idSimulado, String cpf) throws UsuarioInexistenteException, SimuladoNaoEncontradoException{
		return negocioAluno.simuladoResultado(idSimulado, cpf);
	}

	public String atualizaAluno(String cpf, String senha, String email) {
		return negocioAluno.atualizarAluno(cpf, senha, email);
	}

	public ArrayList<String> rankingPontos(int idSimulado) throws SimuladoNaoEncontradoException{
		return rankingPontos.gerarRanking(idSimulado);
	}

	public ArrayList<String> rankingSimulado(int idSimulado) throws SimuladoNaoEncontradoException{
		return rankingSimulado.gerarRanking(idSimulado);
	}
	public void historicoAluno(String cpf) throws UsuarioInexistenteException {
		negocioHistorico.historicoAluno(cpf);
	}
	public void historicoSimulado(int idSimulado) throws SimuladoNaoEncontradoException {
		negocioHistorico.historicoSimulado(idSimulado);
	}
	public ArrayList<Simulado> listaSimulado(){
		return negocioSimulado.listaSimulado();
	}
}
