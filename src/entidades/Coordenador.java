package entidades;

import exececoes.CampoVazioException;
import exececoes.CpfApenasNumerosException;
import exececoes.SenhaTamanhoMinimoException;
import exececoes.TamanhoException;

public class Coordenador extends Professor {
	private String codCurso;
	
	public Coordenador(String nome, String cpf, String senha, String email, Curso curso, AreaAtuacao areaAtuacao, String codCurso) throws CampoVazioException, CpfApenasNumerosException, TamanhoException, SenhaTamanhoMinimoException{
		super(nome, cpf, senha, email, curso, areaAtuacao);
		this.codCurso = codCurso;
		validarMatricula();
		
		// TODO Auto-generated constructor stub
	}
	
	 
    public String validarMatricula() throws CampoVazioException{
        char[] cod = codCurso.toCharArray();
        if(codCurso.isEmpty() ){
            throw new CampoVazioException();
        }
        this.codCurso = codCurso;
        return codCurso;
    }


	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return codCurso;
	}


	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.codCurso = matricula;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coordenador [matricula=" + codCurso + "]";
	}

	
	


}
