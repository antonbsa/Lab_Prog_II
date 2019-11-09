package TrabMod3;

public class Aluno{
    protected String nome;
    protected Float notaGA;
    protected Float notaGB;
    
    public Aluno(String nome, Float notaGA, Float notaGB){
        this.nome = nome;
        this.notaGA = notaGA;
        this.notaGB = notaGB;
    }
    
    // Métodos Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        n = nome;
    }
    
    // Métodos GA
    public Float getGa(){
        return notaGA;
    }
    public void setGa(float ga){
        ga = notaGA;
    }
    
    // Métodos GB
    public Float getGb(){
        return notaGB;
    }
    public void setGb(float gb){
        gb = notaGB;
    }
    
    //Método Calcula Nota Final
    public Float notaFinal() {
    	return ((notaGA * 0.33f) + (notaGB * 0.67f));
    }
    
    // Método Exibe Dados
    public void exibeDados(){
    System.out.println(nome + ", " + notaGA + ", " + notaGB);
    }
}