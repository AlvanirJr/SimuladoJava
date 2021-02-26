package entidades;

import exececoes.*;


public class Professor extends Usuario {
	private AreaAtuacao areaAtuacao;
	
	
	public Professor(String nome, String cpf, String senha, String email, Curso curso, AreaAtuacao areaAtuacao) throws CpfApenasNumerosException, TamanhoException, CampoVazioException, SenhaTamanhoMinimoException {
		super(nome, cpf, senha, email, curso);
		this.areaAtuacao = areaAtuacao;
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the disciplina
	 */
	public AreaAtuacao getAreaAtuacao() {
		return areaAtuacao;
	}


	/**
	 * @param disciplina the disciplina to set
	 */
	public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
}
