package exececoes;

public class TamanhoException extends Exception{
    
	private int tamanho;

    public TamanhoException(int t) {
    
    	super("!Cpf invalido! \ncont�m: " + t + " digitos\n!CPF CONT�M 11 DIGITOS!");
    	this.tamanho = t;
    }
	
    public int getTamanho() {
	return tamanho;
    }
	
	
}
