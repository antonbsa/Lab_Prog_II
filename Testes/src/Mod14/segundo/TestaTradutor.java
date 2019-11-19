package Mod14.segundo;

import java.io.*;

public class TestaTradutor {
	public static void main(String[] args) {
		Tradutor t = new Tradutor();
		try {
			t.carregaPalavras("palavras.txt");	
			t.traduzArquivo("entrada.txt", "saida.txt");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
