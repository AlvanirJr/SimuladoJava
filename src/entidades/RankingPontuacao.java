package entidades;

import java.util.ArrayList;

import dados.IRepositorioHistorico;
import dados.IRepositorioSimulado;
import dados.RepositorioHistorico;
import dados.RepositorioSimulado;
import exececoes.SimuladoNaoEncontradoException;

public class RankingPontuacao extends Ranking {
	private IRepositorioHistorico repositorioHistorico;
	private IRepositorioSimulado repositorioSimulado;
	private ArrayList<String> lista;

	public RankingPontuacao() {
		this.lista = new ArrayList<>();
		this.repositorioHistorico = RepositorioHistorico.getInstancia();
		this.repositorioSimulado = RepositorioSimulado.getInstancia();
		
	}

	/**
	 * Metodo usado para gerar um ranking com peso sobre os niveis das questões que foram cadastradas
	 */
	@Override
	public ArrayList<String> gerarRanking(int idSimulado) throws SimuladoNaoEncontradoException{
		 verificarId(idSimulado);
	     int total = 0;
	     String listaCompleta;
	     ArrayList<Historico> p = new ArrayList<Historico>();
	     p = repositorioHistorico.getPorSimulado(idSimulado);
	     for(int i = 0; i< p.size(); i++){
	           
	           total = p.get(i).getPontuacaoTotal();
	           listaCompleta = (i+1 +" CPF: " + p.get(i).getCpfAluno() +" Pontuação total: " + total+'\n');
	           lista.add(listaCompleta);    
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
