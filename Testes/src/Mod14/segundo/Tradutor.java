package Mod14.segundo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Tradutor {

	protected AvlTree palavras;

	Tradutor(){
		palavras = new AvlTree();
	}


	/*
	 * Carrega o arquivo de palavras.
	 * Para cada linha do arquivo um objeto do tipo Verbete � instanciado
	 * e � inserido na arvore AVL
	 */
	public void carregaPalavras(String arq) throws IOException{

		FileReader fr	 	= new FileReader(arq);
		BufferedReader br 	= new BufferedReader(fr);

		String linha;
		while ((linha = br.readLine()) != null){
			String palavras[] = linha.split(",");
			Verbete novoVerbete = new Verbete(palavras[0],palavras[1]);
			insereVerbete(novoVerbete);
		}
		
	}

	protected void insereVerbete(Verbete v){	
		palavras.insert(v);
	}

	protected Verbete buscaPalavra(String palavra){
		AvlNode node = palavras.search(palavra);
		if (node != null){
			return node.Key;
		}
		return null;
	}	

	public void traduzArquivo(String origem, String destino) throws IOException{
		
		FileReader fr	   = new FileReader(origem);
		BufferedReader br  = new BufferedReader(fr);

		FileWriter fw = new FileWriter(destino);
		PrintWriter pw = new PrintWriter(fw);
		
		String linha;
		while ((linha = br.readLine()) != null){
			String vetorPalavras[] = linha.split(" ");
			for (int i = 0; i < vetorPalavras.length; i++){
				Verbete b = buscaPalavra(vetorPalavras[i]);
				if ( b != null){
					pw.print(b.getTraducao() + " ");
				}
				else{
					pw.print(vetorPalavras[i] + " ");
				}
			}
			pw.println();
		}
		pw.close();
		br.close();
	}

}