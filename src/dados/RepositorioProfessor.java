package dados;

import java.util.ArrayList;

import entidades.Aluno;
import entidades.Professor;

public class RepositorioProfessor implements IRepositorioProfessor {
	private static RepositorioProfessor instancia;

    private ArrayList<Professor> repositorio;

    public RepositorioProfessor() {
        repositorio = new ArrayList<Professor>();
    }    
    
    public static final RepositorioProfessor getInstancia(){
        if(instancia == null){
           instancia = new RepositorioProfessor();
        }
        
        return instancia;
    }
    
    
    @Override
    public void addProfessor(Professor professor) {
    	int confirma = buscarProfessor(professor.getCpf());
    	if(confirma == -1) {
    		this.repositorio.add(professor);
    	}
    
    }

    @Override
    public void atualizarProfessor(String cpf, String senha) {
        int usuarioAux = buscarProfessor(cpf);
        repositorio.get(usuarioAux).setSenha(senha);        
    }

    @Override
    public boolean removerProfessor(String cpf) {
        boolean sucesso = false;
        int ProfessorAux = buscarProfessor(cpf);
        if(ProfessorAux != -1){
            repositorio.remove(ProfessorAux);
            sucesso = true;
        }
        return sucesso;
    }

    @Override
    public int buscarProfessor(String cpf) {
        
        for(int i=0; i<this.repositorio.size(); i++){
            if(this.repositorio.get(i).getCpf().equals(cpf)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public ArrayList<Professor> getLista() {
        return repositorio;
    }
        
}
