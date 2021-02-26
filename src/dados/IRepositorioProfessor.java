package dados;

import java.util.ArrayList;

import entidades.Professor;

public interface IRepositorioProfessor {
	public  void addProfessor(Professor professor);
	//public RepositorioProfessor getInstancia();
	public void atualizarProfessor(String cpf, String senha);
	public boolean removerProfessor(String cpf);
	public int buscarProfessor(String cpf);
	public ArrayList<Professor> getLista();
}
