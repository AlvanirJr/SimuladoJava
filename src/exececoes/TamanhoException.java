package exececoes;

public class TamanhoException extends Exception{
    
	private int tamanho;

    public TamanhoException(int t) {
    
    	super("!Cpf invalido! \ncontém: " + t + " digitos\n!CPF CONTÉM 11 DIGITOS!");
    	this.tamanho = t;
    }
	
    public int getTamanho() {
	return tamanho;
    }
	
	
}
