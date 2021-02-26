package exececoes;

public class QuestaoNaoCadastradaException extends Exception{
	public QuestaoNaoCadastradaException() {
		super("Questão não esta presente no sistema, tente novamente");
	}

}
