package negocio;

import dados.IRepositorioAreaAtuacao;
import dados.IRepositorioProfessor;
import dados.RepositorioAreaAtuacao;

import dados.RepositorioProfessor;
import entidades.AreaAtuacao;

import exececoes.UsuarioInexistenteException;

public class NegocioProfessor implements ILoginUsuario {
	private IRepositorioProfessor repositorioProfessor;
	private IRepositorioAreaAtuacao repositorioAreaAtuacao;
	
	
	public NegocioProfessor() {
		this.repositorioProfessor = RepositorioProfessor.getInstancia();
		this.repositorioAreaAtuacao = RepositorioAreaAtuacao.getInstancia();
	}
	
	@Override
    public boolean login(String cpf, String senha) throws UsuarioInexistenteException{
        boolean sucesso = false;
        int busca =  repositorioProfessor.buscarProfessor(cpf);
        if(busca != -1) {
        for(int i=0; i<this.repositorioProfessor.getLista().size(); i++){
            if(this.repositorioProfessor.getLista().get(i).getCpf().equals(cpf)){
                if(this.repositorioProfessor.getLista().get(i).getSenha().equals(senha)){
                    sucesso = true;
                }
            }
        }
    }
        else {
        throw new UsuarioInexistenteException();
        }
        return sucesso;
        
    }
    public boolean cadastrarDisciplina(AreaAtuacao area) {
    	boolean confirmacao;
    	int aux = repositorioAreaAtuacao.buscarArea(area.getidDisciplina());
		if(aux == -1) {
			repositorioAreaAtuacao.addArea(area);
			confirmacao = true;
		}
		else {
			confirmacao =  false;
		}
		return confirmacao;
    }
    
    public String atualizarProfessor(String cpf, String senha) {
    	int aux = repositorioProfessor.buscarProfessor(cpf);
    	String confirmacao =  null;
    	if(aux != -1) {
    		repositorioProfessor.atualizarProfessor(cpf, senha);
    		confirmacao = "Dados atualizados com sucesso";
    	}
    	else {
    		confirmacao = "Os dados informadados não foram atualizados";
    	}
    	return confirmacao;
    }
}
