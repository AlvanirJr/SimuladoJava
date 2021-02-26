package dados;

import java.util.ArrayList;

import entidades.Simulado;

public interface IRepositorioSimulado {
	 public void addSimulado(Simulado simulado );
	 //public RepositorioSimulado getInstancia();
	 public Simulado simulado(int id);
	 public ArrayList<Simulado> getLista();
	 public int buscaSimulado(int idSimulado);
}
