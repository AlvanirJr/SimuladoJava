package dados;

import java.util.ArrayList;


import entidades.AreaAtuacao;

public interface IRepositorioAreaAtuacao {
	public void addArea(AreaAtuacao area);
	//public RepositorioAreaAtuacao getInstancia();
	public int buscarArea(int idArea);
	public void atualizarArea(String area, int idCurso);
	public boolean removerArea(int idCurso);
	public ArrayList<AreaAtuacao> getLista();
}
