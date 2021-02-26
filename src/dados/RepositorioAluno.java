package dados;
import java.util.ArrayList;

import entidades.Aluno;



public class RepositorioAluno implements IRepositorioAluno {
	private static RepositorioAluno instancia;

    private ArrayList<Aluno> repositorio;

    public RepositorioAluno() {
        repositorio = new ArrayList<Aluno>();
    }    

   
    public static final RepositorioAluno getInstancia(){
        if(instancia == null){
           instancia = new RepositorioAluno();
        }
        
        return instancia;
    }
    
    @Override
    public void addAluno(Aluno aluno) {
    	int confirma = buscarAluno(aluno.getCpf());
    	if(confirma == -1) {
    		this.repositorio.add(aluno);
    	}
    	else {
    		boolean teste =  false;
    	}
    
    }

    @Override
    public void atualizarAluno(String cpf, String senha, String email) {
        int usuarioAux = buscarAluno(cpf);
        repositorio.get(usuarioAux).setSenha(senha);
        repositorio.get(usuarioAux).setEmail(email);
        
    }

    /**
     * trocar metodo para remover acesso assim não dando problema no sistema
     * @param cpf
     * @return
     */
    @Override
    public boolean removerAluno(String cpf) {
        boolean sucesso = false;
        int alunoAux = buscarAluno(cpf);
        if(alunoAux != -1){
            repositorio.remove(alunoAux);
            sucesso = true;
        }
        return sucesso;
    }

    @Override
    public int buscarAluno(String cpf) {
        for(int i=0; i<this.repositorio.size(); i++){
            if(this.repositorio.get(i).getCpf().equals(cpf)){
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public ArrayList<Aluno> getLista() {
        return repositorio;
    }
    

        
    
    
}