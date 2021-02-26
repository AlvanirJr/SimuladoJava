package dados;
import java.util.ArrayList;

import entidades.*;
public class RepositorioQuestao implements IRepositorioQuestao {

	private static RepositorioQuestao instancia;
    private ArrayList<Questao> listaQuestao;

    public RepositorioQuestao(){
        this.listaQuestao = new ArrayList();
    }
    
  
    public static final RepositorioQuestao getInstancia(){
        if(instancia == null){
           instancia = new RepositorioQuestao();
        }
        
        return instancia;
    }
    
    @Override
    public ArrayList<Questao> getLista() {
        return listaQuestao;
    }
    
    @Override
    public void addQuestao(Questao questao){
        this.listaQuestao.add(questao);
    }
       
    @Override
    public boolean existeQuestao(int id)  {
  
        for(int i=0; i<this.listaQuestao.size(); i++){
            if(this.listaQuestao.get(i).getId()== id){
                return true;
            }
        }
        return false;

    }
    
    @Override
    public Questao buscarQuestao(int id) {
        for(int i=0; i<this.listaQuestao.size(); i++){
            if(this.listaQuestao.get(i).getId()== id){
                return this.listaQuestao.get(i);
                
            }
        }
       
        return null;
    }

    @Override
    public ArrayList<Questao> getListaQuestao() {
    	return listaQuestao;
    
    }
    @Override
    public int verificarId(int id) {
        for(int i=0; i<this.listaQuestao.size(); i++){
            if(this.listaQuestao.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    
}
