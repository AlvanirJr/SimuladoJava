package exececoes;

public class CpfApenasNumerosException extends Exception{

    public CpfApenasNumerosException() {
        super("Erro: Apenas n�meros podem ser digitados!");
    }    
}
