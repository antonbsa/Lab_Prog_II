package TrabMod6;

public class Aluno {
	
	private String nome;
	private int idade;
	private int matricula;
	
	public Aluno(String nome, int idade, int matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}
	
	//Métodos SET
	public void setNome(String n) {
		n = nome;
	}
	
	public void setIdade(int i) {
		i = idade;
	}
	
	public void setMatricula(int m) {
		m = matricula;
	}
	
	//Métodos GET
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void exibeDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade+" anos");
		System.out.println("Número de matrícula: "+matricula);
		System.out.println("----------------------");
	}
}
