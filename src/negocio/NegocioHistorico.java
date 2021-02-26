package negocio;

import java.util.ArrayList;

import dados.IRepositorioAluno;
import dados.IRepositorioHistorico;
import dados.IRepositorioSimulado;
import dados.RepositorioHistorico;
import dados.RepositorioSimulado;
import dados.RepositorioAluno;
import entidades.Historico;
import entidades.Simulado;
import exececoes.SimuladoNaoEncontradoException;
import exececoes.UsuarioInexistenteException;

public class NegocioHistorico {
	
	private IRepositorioHistorico repositorioHistorico;
	private IRepositorioAluno repositorioAluno;
	private IRepositorioSimulado repositorioSimulado;
	
	
	public NegocioHistorico() {
		this.repositorioHistorico = RepositorioHistorico.getInstancia();
		this.repositorioAluno = RepositorioAluno.getInstancia();
		this.repositorioSimulado = RepositorioSimulado.getInstancia();
	}
	    
    
    public void inserirHistorico(Simulado s, String cpf, ArrayList<Integer> p){
        this.repositorioHistorico.Add(new Historico(s.getIdSimulado(), cpf, p));   
    }
    
    public void historicoSimulado(int idSimulado) throws SimuladoNaoEncontradoException{
    	int busca = repositorioSimulado.buscaSimulado(idSimulado);
    	if(busca != -1) {
    		this.repositorioHistorico.getPorSimulado(idSimulado);
    	}
    	else {
    		throw new SimuladoNaoEncontradoException();
    	}
    }
    
    public void historicoAluno(String cpf) throws UsuarioInexistenteException{
    	int busca =  repositorioAluno.buscarAluno(cpf);
    	if(busca != -1) {
    		this.repositorioHistorico.getPorAluno(cpf);
    	}
    	else {
    		throw new UsuarioInexistenteException();
    	}
    }
    
}
