package exececoes;

public class SenhaTamanhoMinimoException extends Exception{
	

    private int tamanho;

    public SenhaTamanhoMinimoException(int t) {
	super("!Senha invalido! \ncont�m: " + t + " digitos\n!Senha CONT�M 6 DIGITOS!");
	this.tamanho = t;
    }
	
    public int getTamanho() {
	return tamanho;
    }  
}
