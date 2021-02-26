package dados;

import java.util.ArrayList;

import entidades.Coordenador;

public interface IRepositorioCoordenador {
	public  void addCoordenador(Coordenador coordenador);
	//public RepositorioCoordenador getInstancia();
	public void atualizarCoordenador(String cpf, String senha);
	public boolean removerCoordenador(String cpf);
	public int buscarCoordenador(String cpf);
	public ArrayList<Coordenador> getLista();
}
