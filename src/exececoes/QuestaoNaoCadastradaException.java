package exececoes;

public class QuestaoNaoCadastradaException extends Exception{
	public QuestaoNaoCadastradaException() {
		super("Quest�o n�o esta presente no sistema, tente novamente");
	}

}
