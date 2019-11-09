package TrabMod3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteAluno {

	public static Aluno[] carregaAlunos(String arquivo) throws IOException {
	
	Aluno alunos[] = new Aluno[5];
	int indice = 0;
	
	FileReader fr 		= new FileReader(arquivo);
	BufferedReader br 	= new BufferedReader(fr); 
	
	String linha;
	while ((linha = br.readLine()) != null) {
		String campos[] = linha.split(",");
		
		Float nota1 = Float.parseFloat(campos[1]);
		Float nota2 = Float.parseFloat(campos[2]);
		
		Aluno a = new Aluno(campos[0], nota1, nota2);
		
		alunos[indice] = a;
		indice++;

		} return alunos;
	}
	
	
	public static void main(String[] args) {
try {
			
			Aluno alunos[];
			alunos = carregaAlunos("C:\\Users\\Pctator\\Desktop\\Facul\\2º SEM\\Prog II\\Eclipse\\src\\TrabMod3\\alunos.txt");
			
			for (int i=0; i<alunos.length; i++){
				System.out.println(alunos[i].getNome() + ", " + alunos[i].notaFinal());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}