package exececoes;

public class CursoException extends Exception {
	public CursoException() {
		super("Curso já existente, tente novamente");
	}
}
