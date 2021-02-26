package negocio;

import java.util.ArrayList;

import dados.IRepositorioQuestao;
import dados.RepositorioQuestao;
import entidades.Questao;
/**
 * 
 * @author Alvanir Júnior
 *
 */
public class NegocioQuestao {
	private IRepositorioQuestao repositorioQuestao;
	
	
	public NegocioQuestao() {
	
		this.repositorioQuestao = RepositorioQuestao.getInstancia();
	}
	/**
	 * Cadastra a questao e coloca no repositorio de questão 
	 * @param questao
	 * @return
	 */
	public boolean cadastrarQuestao(Questao questao) {
		  boolean verificar;
	        if(questao instanceof Questao){
	        repositorioQuestao.addQuestao(questao);

	        verificar = true;
	        }
	        else{
	            verificar = false;
	        }
	        //System.out.println(verificar);
	        return verificar;
	}
	
		/**
		 * retorna  a lista de questões cadastradas no repositorio
		 */
	   public ArrayList<Questao> listadeQuestoes(){
	        ArrayList<Questao> q = this.repositorioQuestao.getListaQuestao();
	        return q;
	    }
}
