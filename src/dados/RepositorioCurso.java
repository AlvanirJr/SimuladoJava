package dados;

import java.util.ArrayList;

import entidades.Curso;


public class RepositorioCurso implements IRepositorioCurso {
	private static RepositorioCurso instancia;
	private ArrayList<Curso> listaCursos;
	
	public RepositorioCurso() {
		this.listaCursos = new ArrayList<Curso>();
	}
	
    
    public static final RepositorioCurso getInstancia(){
        if(instancia == null){
           instancia = new RepositorioCurso();
        }
        
        return instancia;
    }
    @Override
    public void addCurso(Curso curso) {
    	int confirma = buscarCurso(curso.getIdCurso());
    	if(confirma == -1) {
    		this.listaCursos.add(curso);
    	}
    	
    }
    @Override
    public int buscarCurso(int idCurso) {
        for(int i=0; i<this.listaCursos.size(); i++){
            if(this.listaCursos.get(i).getIdCurso() == (idCurso)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public ArrayList<Curso> getLista() {
        return listaCursos;
    }
    
    public boolean removeCurso(int idCurso) {
        boolean sucesso = false;
        int aux = buscarCurso(idCurso);
        if(aux != -1){
            listaCursos.remove(aux);
            sucesso = true;
        }
        return sucesso;
    }
    
	
}
