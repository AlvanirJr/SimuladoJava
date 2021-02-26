package entidades;

public class Curso {
	private String nome;
	private String unidadeAcademica;
	private int idCurso = 0;
	private static int sequence = 0;
	
	public Curso(String nome, String unidadeAcademica) {
		this.idCurso = sequence++;
		this.nome = nome;
		this.unidadeAcademica =  unidadeAcademica;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the unidadeAcademica
	 */
	public String getUnidadeAcademica() {
		return unidadeAcademica;
	}

	/**
	 * @param unidadeAcademica the unidadeAcademica to set
	 */
	public void setUnidadeAcademica(String unidadeAcademica) {
		this.unidadeAcademica = unidadeAcademica;
	}

	/**
	 * @return the idCurso
	 */
	public int getIdCurso() {
		return idCurso;
	}

	/**
	 * @param idCurso the idCurso to set
	 */
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}


	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", unidadeAcademica=" + unidadeAcademica + ", idCurso="+ idCurso + "]";
	}

	
	
	
}
