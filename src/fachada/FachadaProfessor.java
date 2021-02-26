package fachada;

import java.util.ArrayList;

import entidades.AreaAtuacao;
import entidades.Questao;
import exececoes.UsuarioInexistenteException;
import negocio.ILoginUsuario;
import negocio.NegocioProfessor;
import negocio.NegocioQuestao;

public class FachadaProfessor {
	private NegocioProfessor negocioProfessor;
	private NegocioQuestao negocioQuestao;
	private ILoginUsuario loginProfessor;
	
	public FachadaProfessor() {
		this.negocioProfessor = new NegocioProfessor();
		this.negocioQuestao = new NegocioQuestao();
		this.loginProfessor = new NegocioProfessor();
	}
	
	public boolean loginProfessor(String cpf, String senha) throws UsuarioInexistenteException {
		return loginProfessor.login(cpf, senha);
	}
	
	public boolean addArea(AreaAtuacao area) {
		return negocioProfessor.cadastrarDisciplina(area);
	}
	
	public String updateProfessor(String cpf, String senha) {
		return negocioProfessor.atualizarProfessor(cpf, senha);
	}
	
	public boolean cadastrarQuestao(Questao q) {
		return negocioQuestao.cadastrarQuestao(q);
	}
	public ArrayList<Questao> lista(){
		return negocioQuestao.listadeQuestoes();
	}
}	
