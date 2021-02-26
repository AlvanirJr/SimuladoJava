package dados;

import java.util.ArrayList;

import entidades.AreaAtuacao;



public class RepositorioAreaAtuacao implements IRepositorioAreaAtuacao{
	private static RepositorioAreaAtuacao instancia;
	private ArrayList<AreaAtuacao> listaArea;
	
	public RepositorioAreaAtuacao() {
		this.listaArea = new ArrayList<AreaAtuacao>();
	}
	
	
    public static final RepositorioAreaAtuacao getInstancia(){
        if(instancia == null){
           instancia = new RepositorioAreaAtuacao();
        }
        
        return instancia;
    }
    
    @Override
    public void addArea(AreaAtuacao area) {
    	int confirma = buscarArea(area.getidDisciplina());
    	if(confirma == -1) {
    		this.listaArea.add(area);
    	}
    
    }
    
    @Override
    public int buscarArea(int idDisciplina) {
        for(int i=0; i<this.listaArea.size(); i++){
            if(this.listaArea.get(i).getidDisciplina() == (idDisciplina)){
                return i;
            }
        }
        return -1;
    }
    
    
    @Override
    public ArrayList<AreaAtuacao> getLista() {
        return listaArea;
    }

	@Override
	public void atualizarArea(String area, int idCurso) {
        int aux = buscarArea(idCurso);
        listaArea.get(aux).setArea(area);
		
	}
	@Override
	 public boolean removerArea(int idArea) {
	        boolean sucesso = false;
	        int aux = buscarArea(idArea);
	        if(aux != -1){
	            listaArea.remove(idArea);
	            sucesso = true;
	        }
	        return sucesso;
	    }

	 

    
    
}
