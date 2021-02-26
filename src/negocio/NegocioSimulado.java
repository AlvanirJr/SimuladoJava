package negocio;

import java.util.ArrayList;

import dados.IRepositorioQuestao;
import dados.IRepositorioSimulado;
import dados.RepositorioQuestao;
import dados.RepositorioSimulado;
import entidades.Questao;
import entidades.Simulado;
import exececoes.QuestaoNaoCadastradaException;
import exececoes.SimuladoNaoEncontradoException;

public class NegocioSimulado {
	private IRepositorioSimulado repositorioSimulado;
	private IRepositorioQuestao repositorioQuestao;
	
	
	public NegocioSimulado() {
		this.repositorioSimulado = RepositorioSimulado.getInstancia();
		this.repositorioQuestao = RepositorioQuestao.getInstancia();
	}
	
	/**
	 * Aqui é onde o simulado é criado, que so podera ser realizado por o coordenador
	 * @param simulado
	 * @return
	 */
	public boolean criarSimulado(Simulado simulado) {
		repositorioSimulado.addSimulado(simulado);
		return true;
		
	}
	/**
	 * Sera usado para inserir as questões no simulado
	 * @param idQuestao
	 * @param idSimulado
	 * @return
	 */
	public boolean inserirQuestao(int idQuestao, int idSimulado) throws SimuladoNaoEncontradoException, QuestaoNaoCadastradaException {
		autenticarSimulado(idQuestao, idSimulado);
		int busca = repositorioSimulado.buscaSimulado(idSimulado);
			if(busca != -1) {
				Simulado simulado =  repositorioSimulado.simulado(idSimulado);
	        	if(simulado != null){
	        		if(this.repositorioQuestao.existeQuestao(idQuestao) == true){
	        			ArrayList<Integer> lista = new ArrayList<Integer>();
	        			lista.add(idQuestao);
	        			simulado.setListaQuestao(lista);       
	            
	        			return true;
	        		}
	        	}
			}
				else {
					throw new SimuladoNaoEncontradoException();
				
				
		}
        return false;
  }
	
	
	
    public Questao pegarId(int idQuestao){
        return repositorioQuestao.buscarQuestao(idQuestao);
     }
     
    
    /**
     * preprar um metodo para retornar todos os simulados cadastrados no sistema, assim fazendo com que o aluno possa escolher aquele que o convem
     */
    public ArrayList<Simulado> listaSimulado() {
    	  ArrayList<Simulado> q = this.repositorioSimulado.getLista();
	      return q;
    	
    }
    /**
     * função que vai verificar se existe algum erro ao inserir questão no simulado e lançar uma exceção
     * @param idQuestao
     * @param idSimulado
     * @throws QuestaoNaoCadastradaException
     * @throws SimuladoNaoEncontradoException
     */
    public void autenticarSimulado(int idQuestao, int idSimulado) throws QuestaoNaoCadastradaException, SimuladoNaoEncontradoException {
    	int buscaQuestao =  repositorioQuestao.verificarId(idQuestao);
    	int buscaSimualado =  repositorioSimulado.buscaSimulado(idSimulado);
    	if(buscaQuestao == -1) {
    		throw new QuestaoNaoCadastradaException();
    	}
    	else if(buscaSimualado == -1) {
    		throw new SimuladoNaoEncontradoException();
    	}
  
    }
	
}
