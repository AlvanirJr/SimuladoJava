package exececoes;

public class UsuariojaCadastrado extends Exception{
	private String nome;
	
	public UsuariojaCadastrado() {
		super("Já cadastrado");
	}
	
}
