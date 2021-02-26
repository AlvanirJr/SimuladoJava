package entidades;

import java.util.ArrayList;

import exececoes.SimuladoNaoEncontradoException;
/**
 * 
 * @author Alvanir Júnior
 * Classe usada para gerar o ranking de alunos, onde so é usada para ser modelo de classe, não pode instanciada e seus metodos so tem assinatura
 * as classes que herdam tendem a implementar esses metodos de forma com sua necessidade, assim tento sobrescrita de metodo
 */
public abstract class Ranking {
	
	public  abstract ArrayList<String> gerarRanking(int idSimulado) throws SimuladoNaoEncontradoException;
	
}
