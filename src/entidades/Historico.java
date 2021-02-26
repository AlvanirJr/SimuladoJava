package entidades;

import java.util.ArrayList;

public class Historico {
	 private int idSimulado;
	 private String cpfAluno;
	 private ArrayList<Integer> pontuacao;
	    
	    
	    
public Historico(int idSimulado, String cpfAluno, ArrayList<Integer> p){
	        this.idSimulado = idSimulado;
	        this.cpfAluno = cpfAluno;
	        this.pontuacao = p;
	    }

	    public int getIdSimulado() {
	        return idSimulado;
	    }

	    public void setIdSimulado(int idSimulado) {
	        this.idSimulado = idSimulado;
	    }

	    public String getCpfAluno() {
	        return cpfAluno;
	    }

	    public void setCpfAluno(String cpfAluno) {
	        this.cpfAluno = cpfAluno;
	    }

	    public ArrayList<Integer> getPontuacao() {
	        return pontuacao;
	    }
	    
	    public int getPontuacaoTotal() {
	        int total = 0;
	        for(Integer i: getPontuacao()){
	            total += i;
	        }
	        return total;
	    }
	    
	    public int getAcertos() {
	    	int total = 0;
	    	for(Integer i:getPontuacao()) {
	    		if(i != 0) {
	    			total += 1;
	    		}
	    		else {
	    			total += 0;
	    		}
	    		
	    	}
	    	return total;
	    }

	    public void setPontuacao(ArrayList<Integer> pontuacao) {
	        this.pontuacao = pontuacao;
	    }

	    @Override
	    public String toString() {
	        return  "Simulado: " + idSimulado + '\n'+
	                "CPF: " + cpfAluno + '\n'+
	                "Pontuação: " + pontuacao ;
	    }

	    //@Override
	    public int compareTo(Object h) {
	       if(this.getPontuacaoTotal() > ((Historico) h).getPontuacaoTotal()){
	           return 1;
	           
	       }
	       else if(this.getPontuacaoTotal() < ((Historico) h).getPontuacaoTotal()){
	           return -1;
	       }
	       return 0;
	    }
}
