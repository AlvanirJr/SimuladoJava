package dados;

import java.util.ArrayList;

import entidades.Curso;

public interface IRepositorioCurso {
	public void addCurso(Curso curso);
	//public RepositorioCurso getInstancia();
	public int buscarCurso(int idCurso);
	public ArrayList<Curso> getLista();
	public boolean removeCurso(int idCurso);
}
