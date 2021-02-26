package entidades;

import java.util.Date;

import exececoes.CampoVazioException;
import exececoes.CpfApenasNumerosException;
import exececoes.SenhaTamanhoMinimoException;
import exececoes.TamanhoException;

public class Aluno extends Usuario {
	private String anoIngresso;
	public Aluno(String nome, String cpf, String senha, String email, Curso curso, String anoIngresso) throws CpfApenasNumerosException, TamanhoException, CampoVazioException, SenhaTamanhoMinimoException {
		super(nome, cpf, senha, email, curso);
		this.anoIngresso = anoIngresso;
		
		// TODO Auto-generated constructor stub
	}



}
