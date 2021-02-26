package entidades;
import exececoes.*;
public class Questao {
	private  int id;
	private static int idQuestao = 0;
    private String enunciado;
    private String afirmativaA;
    private String afirmativaB;
    private String afirmativaC;
    private String afirmativaD;
    private String afirmativaE;
    private String resposta;
    private int nivel;
    private AreaAtuacao area;

    public Questao(String enunciado, String a, String b, String c, String d, String e, String resposta, int nivel, AreaAtuacao area) throws IdQuestaoException, CampoVazioException, AlternativasException, RespostaException {
        this.id = idQuestao++;
        this.enunciado = enunciado;
        this.afirmativaA = a;
        this.afirmativaB = b;
        this.afirmativaC = c;
        this.afirmativaD = d;
        this.afirmativaE = e;
        this.resposta = resposta;
        this.nivel = nivel;
        this.area =  area;
        validarEnuciado();
        validarAlternativaA();
        validarAlternativaB();
        validarAlternativaC();
        validarAlternativaD();
        validarAlternativaE();
        validarResposta();
    }
    

    public String validarEnuciado() throws CampoVazioException{
        
        if(enunciado.isEmpty()){
            throw new CampoVazioException();
        
              }
      this.enunciado = enunciado;
      return enunciado;
        
    } 
  
    
    //Validação da Alternativa A
    public String validarAlternativaA() throws AlternativasException{
        if(afirmativaA.isEmpty()){
            throw new AlternativasException();
            
        }
        this.afirmativaA = afirmativaA;
        return afirmativaA;

    }
    
        //Validação da Alternativa B
    public String validarAlternativaB() throws AlternativasException{
        if(afirmativaB.isEmpty()){
            throw new AlternativasException();
            
        }
        this.afirmativaB = afirmativaB;
        return afirmativaB;

    }
    
        //Validação da Alternativa C
    public String validarAlternativaC() throws AlternativasException{
        if(afirmativaC.isEmpty()){
            throw new AlternativasException();
            
        }
        this.afirmativaC = afirmativaC;
        return afirmativaC;

    }
    
        //Validação da Alternativa D
    public String validarAlternativaD() throws AlternativasException{
        if(afirmativaD.isEmpty()){
            throw new AlternativasException();
            
        }
        this.afirmativaD = afirmativaD;
        return afirmativaD;

    }
    
    //Validação da Alternativa E    
    public String validarAlternativaE() throws AlternativasException{
        if(afirmativaE.isEmpty()){
            throw new AlternativasException();
            
        }
        this.afirmativaE = afirmativaE;
        return afirmativaE;

    }
    
    //Validar resposta
    public String validarResposta() throws RespostaException{
        char [] vetorResposta = resposta.toCharArray();
        if(vetorResposta.length != 1){
            throw new RespostaException();
        }
        this.resposta = resposta;
        return resposta;
        
    }
            
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getA() {
        return afirmativaA;
    }

    public void setA(String a) {
        this.afirmativaA = a;
    }

    public String getB() {
        return afirmativaB;
    }

    public void setB(String b) {
        this.afirmativaB = b;
    }

    public String getC() {
        return afirmativaC;
    }

    public void setC(String c) {
        this.afirmativaC = c;
    }

    public String getD() {
        return afirmativaD;
    }

    public void setD(String d) {
        this.afirmativaD = d;
    }

    public String getE() {
        return afirmativaE;
    }

    public void setE(String e) {
        this.afirmativaE = e;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getNivel() {

        return nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;

    }

    @Override
    public String toString() {
        return  "Questao: " + id + " - " + enunciado + '\n' +
                "A - " + afirmativaA + '\n'+
                "B - " + afirmativaB + '\n'+
                "C - " + afirmativaC + '\n'+
                "D - " + afirmativaD + '\n'+
                "E - " + afirmativaE;
    }
    
}
