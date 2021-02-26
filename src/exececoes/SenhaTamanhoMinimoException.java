package exececoes;

public class SenhaTamanhoMinimoException extends Exception{
	

    private int tamanho;

    public SenhaTamanhoMinimoException(int t) {
	super("!Senha invalido! \ncontém: " + t + " digitos\n!Senha CONTÉM 6 DIGITOS!");
	this.tamanho = t;
    }
	
    public int getTamanho() {
	return tamanho;
    }  
}
