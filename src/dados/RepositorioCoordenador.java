package dados;

import java.util.ArrayList;

import entidades.Coordenador;

public class RepositorioCoordenador implements IRepositorioCoordenador {
	private static RepositorioCoordenador instancia;
    private ArrayList<Coordenador> repositorio;

    public RepositorioCoordenador() {
        repositorio = new ArrayList<Coordenador>();
    }    

  
    public static final RepositorioCoordenador getInstancia(){
        if(instancia == null){
           instancia = new RepositorioCoordenador();
        }
        
        return instancia;
    }
    
    @Override
    public void addCoordenador(Coordenador coordenador) {
    		this.repositorio.add(coordenador);
 
    
    }

    @Override
    public void atualizarCoordenador(String cpf, String senha) {
        int usuarioAux = buscarCoordenador(cpf);
        repositorio.get(usuarioAux).setSenha(senha);        
    }

    
    @Override
    public boolean removerCoordenador(String cpf) {
        boolean sucesso = false;
        int CoordenadorAux = buscarCoordenador(cpf);
        if(CoordenadorAux != -1){
            repositorio.remove(CoordenadorAux);
            sucesso = true;
        }
        return sucesso;
    }

    @Override
    public int buscarCoordenador(String cpf) {
        for(int i=0; i<this.repositorio.size(); i++){
            if(this.repositorio.get(i).getCpf().equals(cpf)){
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public ArrayList<Coordenador> getLista() {
        return repositorio;
    }



}
