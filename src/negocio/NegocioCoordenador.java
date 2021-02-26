package negocio;



import dados.*;
import entidades.*;
import exececoes.*;

public class NegocioCoordenador implements ILoginUsuario {
	private IRepositorioAluno repositorioAluno;
	private IRepositorioCoordenador repositorioCoordenador;
	private IRepositorioProfessor repositorioProfessor;
	private IRepositorioCurso repositorioCurso;
	
	
	public NegocioCoordenador() {
		this.repositorioAluno = RepositorioAluno.getInstancia();
		this.repositorioCoordenador = RepositorioCoordenador.getInstancia();
		this.repositorioProfessor = RepositorioProfessor.getInstancia();
		this.repositorioCurso = RepositorioCurso.getInstancia();
	}
	
	
	
	/**
	 * Inserir um novo coordenador no sistema
	 * @param coordenador
	 * @return
	 */
	public boolean adicionarCoordenador(Coordenador coordenador) throws UsuariojaCadastrado {
		boolean confirmacao;
		int aux = repositorioCoordenador.buscarCoordenador(coordenador.getCpf());
		if(aux == -1) {
			//System.out.println("Aqui");
			repositorioCoordenador.addCoordenador(coordenador);
			confirmacao = true;
		}
		else {
			throw new UsuariojaCadastrado();
			
		}
		return confirmacao;
		
	}
	
	/**
	 * O coordenador é responsavél pelo cadastro dos alunos que estão selecionador para realizar o ENADE
	 * @param aluno
	 * @return
	 */
	public boolean cadastrarAluno(Aluno aluno) throws UsuariojaCadastrado{
		boolean confirmacao;
		int aux = repositorioAluno.buscarAluno(aluno.getCpf());
		if(aux == -1) {
			repositorioAluno.addAluno(aluno);
			confirmacao = true;
		}
		else {
			throw new UsuariojaCadastrado();
		}
		return confirmacao;
		
	}
		/**
		 * O coordenador vai cadastrando os porfessores de acordo com a necessidade de cada simulado.
		 * @param professor
		 * @return
		 */
	
	public boolean cadastrarProfessor(Professor professor) throws UsuariojaCadastrado {
		boolean confirmacao;
		int aux = repositorioProfessor.buscarProfessor(professor.getCpf());
		if(aux == -1) {
			repositorioProfessor.addProfessor(professor);
			confirmacao = true;
		}
		else {
			throw new UsuariojaCadastrado();
		}
		return confirmacao;
		
	}
	/**
	 * Cadastro de curso so pode ser realizado pelo coordenador 
	 * @param curso
	 * @return
	 */
	public boolean cadastrarCurso(Curso curso) throws CursoException {
		boolean confirmacao;
		int aux = repositorioCurso.buscarCurso(curso.getIdCurso());
		if(aux == -1) {
			repositorioCurso.addCurso(curso);
			confirmacao = true;
		}
		else {
			
			throw new CursoException();
		}
		return confirmacao;
	}
	

	
	/**
	 * Apenas o coordenador sera responsavcel pela remoção de qualquer um dos usuarios	
	 * @param professor
	 * @return
	 * @throws UsuarioInexistenteException
	 */
    public boolean removerProfessor(String cpf) throws UsuarioInexistenteException {
        boolean sucesso = false;
        int professorAux = repositorioProfessor.buscarProfessor(cpf);
        if(professorAux != -1){
            repositorioProfessor.removerProfessor(cpf);
            return true;
        }

        else {
            throw new UsuarioInexistenteException();
        }
    }
    
    
    /**
     * Coordenador pode remover qualquer aluno do sistema
     * @param cpf
     * @return
     * @throws UsuarioInexistenteException
     */
    
    public boolean removerAluno(String cpf) throws UsuarioInexistenteException {
        boolean sucesso = false;
        int alunoAux = repositorioAluno.buscarAluno(cpf);
        if(alunoAux != -1){
            repositorioAluno.removerAluno(cpf);
            return true;
        }

        else {
            throw new UsuarioInexistenteException();
        }
    }
    
    /**
     * Sistema responsavel por autenticar o acesso do usuario Coordenador no sistema, caso não esteja cadastrado lança uma execeção informando que o usuario
     * não foi encotrado
     * @param cpf
     * @param senha
     * @return
     * @throws UsuarioInexistenteException
     */
    @Override
    public boolean login(String cpf, String senha) throws UsuarioInexistenteException{
    	int busca =  repositorioCoordenador.buscarCoordenador(cpf);
        boolean sucesso =false;
        if(busca != -1) {
        for(int i=0; i<this.repositorioCoordenador.getLista().size(); i++){
            if(this.repositorioCoordenador.getLista().get(i).getCpf().equals(cpf)){
                if(this.repositorioCoordenador.getLista().get(i).getSenha().equals(senha)){
                    return sucesso =  true;
                	}
            	}
        	}	
        }
        else {
        	throw new UsuarioInexistenteException();
        }
        return sucesso;
    }
    
    
	
	

}
