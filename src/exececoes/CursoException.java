package exececoes;

public class CursoException extends Exception {
	public CursoException() {
		super("Curso j� existente, tente novamente");
	}
}
