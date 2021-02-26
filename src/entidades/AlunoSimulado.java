package entidades;

import java.util.ArrayList;

public class AlunoSimulado {
	
	private ArrayList<String> respostaAluno;
    private String cpf;

    
    public AlunoSimulado(ArrayList<String> respotaAluno, String cpf){
        this.respostaAluno = respotaAluno;
        this.cpf = cpf;
    }

    public ArrayList<String> getRespostaAluno() {
        return respostaAluno;
    }

    public void setRespostaAluno(ArrayList<String> respostaAluno) {
        this.respostaAluno.addAll(respostaAluno);
    }

    @Override
    public String toString() {
        return "AlunoSimulado{" + "respostaAluno=" + respostaAluno + ", cpf=" + cpf + '}';
    }

}
