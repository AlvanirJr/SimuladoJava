package negocio;

import exececoes.UsuarioInexistenteException;

public interface ILoginUsuario {
	public boolean login(String cpf, String senha) throws UsuarioInexistenteException;
}
