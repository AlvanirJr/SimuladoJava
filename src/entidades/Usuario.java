package entidades;

import exececoes.*;

public class Usuario {
	private String nome;
	private String cpf;
	private String senha;
	private String email;
	private Curso curso;
	
	
	public Usuario(String nome, String cpf, String senha, String email, Curso curso) throws CpfApenasNumerosException, TamanhoException, CampoVazioException, SenhaTamanhoMinimoException {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.email = email;
		this.curso = curso;
		validarCpf();
		validarNome();
		validarSenha();
	}
	
	
	//Validaçao para Cpf
	
	@SuppressWarnings("unused")
	private String validarCpf() throws CpfApenasNumerosException, TamanhoException {
		char [] cpfVetor = cpf.toCharArray();
		if(cpfVetor.length < 11) {
			throw new TamanhoException(cpfVetor.length);
		}
		for(int i=0; i<cpfVetor.length; i++) {
			if(!Character.isDigit(cpfVetor[i])) {
				throw new CpfApenasNumerosException();
			}			
		}		
		//this.cpf = cpf;
		return cpf;
	}
	
	/**
	 * Usado para validar o campo senha, assim permitindo no minimo 6 caracteres
	 * @return
	 * @throws SenhaTamanhoMinimoException
	 */
	 public String validarSenha() throws SenhaTamanhoMinimoException{
			char[] senhaVetor = senha.toCharArray();
			if(senhaVetor.length < 6 && senha.isEmpty() ) {
				throw new SenhaTamanhoMinimoException(senhaVetor.length);
			}
		
			//this.senha = senha;
			return senha;
		}
	 
	 
     public String validarNome() throws CampoVazioException{
         char[] nomeVetor = nome.toCharArray();
         if(nome.isEmpty() ){
             throw new CampoVazioException();
         }
         this.nome = nome;
         return nome;
     }


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}


	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}


	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}


	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Usuario{" +
				"nome='" + nome + '\'' +
				"email= " + email +'\''+ 
				", cpf='" + cpf + '\'' +
				", senha='" + senha + '\'';
				
	}
	 
}
