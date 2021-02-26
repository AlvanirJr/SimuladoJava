package dados;

import java.util.ArrayList;

import entidades.Questao;

public interface IRepositorioQuestao {
	public ArrayList<Questao> getLista();
	//public RepositorioQuestao getInstancia();
	public void addQuestao(Questao questao);
	public boolean existeQuestao(int id);
	public Questao buscarQuestao(int id);
	public int verificarId(int id);
	public ArrayList<Questao> getListaQuestao();
}
