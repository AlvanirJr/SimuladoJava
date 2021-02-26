package dados;

import java.util.ArrayList;

import entidades.Historico;;

public class RepositorioHistorico implements IRepositorioHistorico{
	private static RepositorioHistorico instancia;
	private ArrayList<Historico> listaHistorico;
	
	
	public RepositorioHistorico() {
		this.listaHistorico = new ArrayList<Historico>();
	}
	
   
    public static final RepositorioHistorico getInstancia(){
        if(instancia == null){
           instancia = new RepositorioHistorico();
        }
        
        return instancia;
    }
    
    @Override
    public boolean Add(Historico historicos){
        return this.listaHistorico.add(historicos);
         
    }
    
    @Override
    public ArrayList getPorSimulado(int idSimulado){
        ArrayList<Historico> listaSimulado = new ArrayList<>();
        for(Historico item: this.listaHistorico){
            if(item.getIdSimulado() == idSimulado){
                listaSimulado.add(item);
            }
        }
        //System.out.println(listaSimulado);
        return listaSimulado;
        
    }
    @Override
    public ArrayList getPorAluno(String cpf){
        ArrayList<Historico> listaAluno = new ArrayList<>();
        for(Historico item: this.listaHistorico){
            if(item.getCpfAluno().equals(cpf)){
                listaAluno.add(item);
            }
        }
        //System.out.println(listaAluno.toString());
        System.out.println(listaAluno);
        return listaAluno;
    }
    
    @Override
    public ArrayList getPontuacao(){
        ArrayList<Integer> p = new ArrayList<>();
        for(Historico item: this.listaHistorico){
            p.addAll(item.getPontuacao());
            
        }
        return p;
    }
    @Override
    public ArrayList<Historico> getListaHistorico() {
        return listaHistorico;
    }
	
	
}
