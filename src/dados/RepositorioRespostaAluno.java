package dados;
import entidades.AlunoSimulado;
import java.util.ArrayList;
public class RepositorioRespostaAluno implements IRepositorioRespostaAluno{
	
	 private static RepositorioRespostaAluno instancia;
	 private ArrayList<AlunoSimulado> repositorioAlunoSimulados;
	    
	 
	 public RepositorioRespostaAluno(){
	        this.repositorioAlunoSimulados =  new ArrayList<AlunoSimulado>();
	 }
	 
	 
	 public static final RepositorioRespostaAluno getInstancia(){
	        if(instancia == null){
	           instancia = new RepositorioRespostaAluno();
	        }
	        
	        return instancia;
	    }
	 
	 /**
	  * Resposta do Aluno
	  * @param As
	  */
	 @Override
	public void addRespostaAluno(AlunoSimulado As){
	        this.repositorioAlunoSimulados.add(As);
	    }
	    
	 @Override
	 public ArrayList compararResposta( ){
	        ArrayList<String> lista = new ArrayList();
	        for(AlunoSimulado s: this.repositorioAlunoSimulados){
	           lista = s.getRespostaAluno();
	           //System.out.println(lista);
	        }
	        return lista;
	    }
	 @Override
	  public ArrayList<AlunoSimulado> getRepositorioAlunoSimulados() {
	        return repositorioAlunoSimulados;
	        
	    }
	  

}