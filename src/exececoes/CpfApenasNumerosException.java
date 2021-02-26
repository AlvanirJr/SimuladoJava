package exececoes;

public class CpfApenasNumerosException extends Exception{

    public CpfApenasNumerosException() {
        super("Erro: Apenas números podem ser digitados!");
    }    
}
