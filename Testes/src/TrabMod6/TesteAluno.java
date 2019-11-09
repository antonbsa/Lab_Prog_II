package TrabMod6;

public class TesteAluno {

	public static void main(String[] args) {
		int matricula = 1;
		Aluno[] aluno = new Aluno [10];
		
		//Método de atribuição da Classe Aluno
		for(int i = 0; i<aluno.length; i++) {
		aluno[i] = new Aluno(Teclado.leString("Digite o nome do Aluno "+matricula+": "),
							 Teclado.leInt("Digite a idade do aluno "+matricula+": "),
							 matricula);
		System.out.println();
		matricula++;
		}
		
		//Método de impressão dos atributos da Classe Aluno
		for(int i = 0; i<aluno.length; i++) {
			System.out.println("----------------------");
			System.out.println("Dados do Aluno "+aluno[i].getMatricula()+":");
			aluno[i].exibeDados();
		}
		
		//Método para retornar o mais velho
		int maior = aluno[0].getIdade();
		String nomeMaior = aluno[0].getNome();
		for(int i = 0; i<aluno.length; i++) {
			if(aluno[i].getIdade() >= maior)
				maior = aluno[i].getIdade();
				nomeMaior = aluno[i].getNome();
		}
		System.out.println("O aluno mais velho é o(a): "+nomeMaior+", com "+maior+" anos.");
		System.out.println("Fim!");
	}

}
