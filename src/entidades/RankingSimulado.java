package entidades;

import java.util.ArrayList;

import dados.IRepositorioHistorico;
import dados.IRepositorioSimulado;
import dados.RepositorioHistorico;
import dados.RepositorioSimulado;
import exececoes.SimuladoNaoEncontradoException;


public class RankingSimulado extends Ranking{
	private IRepositorioHistorico repositorioHistorico;
	private ArrayList<String> lista;
	private IRepositorioSimulado repositorioSimulado;
	

	public RankingSimulado() {
		this.lista = new ArrayList<>();
		this.repositorioHistorico = RepositorioHistorico.getInstancia();
		this.repositorioSimulado = RepositorioSimulado.getInstancia();
	}

	/**
	 * Metodo usado para fazer o ranking por questões corretas em cada Simulado respondido
	 */
	@Override
	public ArrayList<String> gerarRanking(int idSimulado) throws SimuladoNaoEncontradoException {
		verificarId(idSimulado);
		String resultado;
	    int total = 0;
	        ArrayList<Historico> p = new ArrayList<Historico>();
	        p = repositorioHistorico.getPorSimulado(idSimulado);
	        for(int i = 0; i< p.size(); i++){
	           
	            total = p.get(i).getAcertos();
	            
	            resultado = (i+1 +" CPF: " + p.get(i).getCpfAluno() +" Total de Acertos: " + total);
	            
	            lista.add(resultado);
	        }
	        
	        return lista;
	}
	
	
	public void verificarId(int idSimulado) throws SimuladoNaoEncontradoException {
		int busca = repositorioSimulado.buscaSimulado(idSimulado);
		if(busca == -1) {
			throw new SimuladoNaoEncontradoException();
		}
	}
	
	
	


}
