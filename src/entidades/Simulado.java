package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Simulado {
	private static int cont = 0;
	private  int idSimulado;
    private String nomeProva;
    private ArrayList<String> gabarito;
    private ArrayList<Integer> listaQuestao;
    private String dataSimulado;

    public Simulado( String nomeProva, String dataSimulado) {
        this.idSimulado = cont++;
        this.nomeProva = nomeProva;
        this.listaQuestao = new ArrayList<Integer>();
        this.gabarito = new ArrayList<String>();
        this.dataSimulado = dataSimulado;

    }

 


    /**
	 * @return the dataSimulado
	 */
	public String getDataSimulado() {
		return dataSimulado;
	}




	/**
	 * @param dataSimulado the dataSimulado to set
	 */
	public void setDataSimulado(String dataSimulado) {
		this.dataSimulado = dataSimulado;
	}




	public int getIdSimulado() {
        return idSimulado;
    }

    public void setIdSimulado(int idSimulado) {
        this.idSimulado = idSimulado;
    }

    public String getNomeProva() {
        return nomeProva;
    }

    public void setNomeProva(String nomeProva) {
        this.nomeProva = nomeProva;
    }

    public ArrayList<Integer> getListaQuestao() {
        return listaQuestao;
    }

    public void setListaQuestao(ArrayList<Integer> listaQuestao) {
        this.listaQuestao.addAll(listaQuestao);
    }

    public ArrayList<String> getGabarito() {
        return gabarito;
    }

    public void setGabarito(ArrayList<String> gabarito) {
        this.gabarito.addAll(gabarito);
    }

    @Override
    public String toString() {
    	return  "Identificador: " +  idSimulado + " - " + "Nome do Simulado: "+ nomeProva + " - " + "Data: "  + dataSimulado +'\n' ;
         
    }
    
    
}
