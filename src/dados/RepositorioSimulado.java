package dados;

import java.util.ArrayList;

import entidades.Simulado;

public class RepositorioSimulado implements IRepositorioSimulado {

    private static RepositorioSimulado instancia;
    private ArrayList<Simulado> repositorioSimulado;

    public RepositorioSimulado() {
        repositorioSimulado = new ArrayList<Simulado>();
    }
    
    
    public static final RepositorioSimulado getInstancia(){
        if(instancia == null){
           instancia = new RepositorioSimulado();
        }
        
        return instancia;
    } 
    
    @Override
    public void addSimulado(Simulado simulado ) {
        repositorioSimulado.add(simulado);
    }
    
    @Override
    public Simulado simulado(int id){
        for(int i = 0; i < repositorioSimulado.size(); i++){
            if(repositorioSimulado.get(i).getIdSimulado() == id){
                return this.repositorioSimulado.get(i);
            }

        }
        return null;
    }
    @Override
   public ArrayList<Simulado> getLista() {
        return repositorioSimulado;
    }
    
    @Override
    public int buscaSimulado(int idSimulado) {
        for(int i=0; i<this.repositorioSimulado.size(); i++){
            if(this.repositorioSimulado.get(i).getIdSimulado() == idSimulado){
                return i;
            }
        }
        return -1;
    }
    	
    }

	
	
	

