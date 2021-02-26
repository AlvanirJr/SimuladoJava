package dados;

import java.util.ArrayList;

import entidades.Historico;

public interface IRepositorioHistorico {
	public boolean Add(Historico historicos);
	//public RepositorioHistorico getInstancia();
	public ArrayList getPorSimulado(int idSimulado);
	public ArrayList getPorAluno(String cpf);
	public ArrayList getPontuacao();
    public ArrayList<Historico> getListaHistorico();
}
