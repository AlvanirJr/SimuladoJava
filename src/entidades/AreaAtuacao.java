package entidades;

public class AreaAtuacao {
	private String area;
	private static int idArea = 0;
	private Curso curso;

	
	
	public AreaAtuacao(String area, Curso curso) {
		this.curso = curso;
		this.area = area;
		idArea++;
		
	}


	/**
	 * @return the nome
	 */
	public String getArea() {
		return area;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setArea(String area) {
		this.area = area;
	}


	/**
	 * @return the periodo
	 */
	public int getidDisciplina() {
		return idArea;
	}


	/**
	 * @param periodo the periodo to set
	 */
	public void setidDisciplina(int idDisciplina) {
		this.idArea = idDisciplina;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Disciplina [area=" + area + ", idDisciplina=" + idArea + ", curso=" + curso + "]";
	}
	
	
	
	
}
