package exececoes;

public class UsuarioInexistenteException extends Exception {

	public UsuarioInexistenteException() {
		super("Usuario n�o encontrado!!");
	}
}
