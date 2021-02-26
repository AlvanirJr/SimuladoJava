package dados;

import java.util.ArrayList;

import entidades.AlunoSimulado;

public interface IRepositorioRespostaAluno {
	public void addRespostaAluno(AlunoSimulado As);
	//public  RepositorioRespostaAluno getInstancia();
	public ArrayList compararResposta( );
	public ArrayList<AlunoSimulado> getRepositorioAlunoSimulados();
}
