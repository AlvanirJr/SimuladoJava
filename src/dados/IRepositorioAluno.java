package dados;

import java.util.ArrayList;

import entidades.Aluno;

public interface IRepositorioAluno {
	
	public void addAluno(Aluno aluno);
	//RepositorioAluno getInstancia();
	public void atualizarAluno(String cpf, String senha, String email);
	public boolean removerAluno(String cpf);
	public int buscarAluno(String cpf);
	public ArrayList<Aluno> getLista();
	
	
}
