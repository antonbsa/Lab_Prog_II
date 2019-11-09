package SimulacaoLoja;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

//import br.unisinos.prog2.listasencaceadas.Queue;
//import br.unisinos.prog2.listasencaceadas.UnderflowException;

public class Simulacao {
	
	protected int clientesAtendidos;
	protected int tempoMaximoDeEspera;
	protected float tempoMedio;
	protected float tamanhoMedio;
	
	
	/**
	 * Inicializa as vari�veis para computar
	 * os dados da simula��o
	 */
	Simulacao(){
		
		clientesAtendidos 	= 0;
		tempoMedio			= 0.0f;
		tamanhoMedio		= 0.0f;
		tempoMaximoDeEspera	= 0;
	}
	
	
	/**
	 * M�todo auxiliar que sorteia um numero randomico entro 0 e 3
	 */
	protected int sorteiaNumero(){		
		Random r = new Random();
		return r.nextInt(4);
	}
	
	
	/**
	 * Executa a simulacao.
	 * Simula o fluxo de clientes na loja de acordo como especificado no 
	 * enunciado do exerc�cio
	 */
	public void simulaFluxo(int tempo){
		
		int tempoCorrente 	= 0;
		int somaDosTempos 	= 0;
		int tempoDeEspera 	= 0;
		int tamanhoFila		= 0;
		
		Queue filaClientes = new Queue();
		
		try{
			while (tempoCorrente < tempo){
				if (!filaClientes.isEmpty()){					
					Cliente c = (Cliente) filaClientes.dequeue();
					tempoDeEspera = tempoCorrente - c.getTempoChegada();
					if (tempoDeEspera > tempoMaximoDeEspera){
						tempoMaximoDeEspera = tempoDeEspera;
					}
					somaDosTempos 		= somaDosTempos + tempoDeEspera;
					clientesAtendidos 	= clientesAtendidos + 1;
				}
				tamanhoFila   = tamanhoFila + filaClientes.size();
				int numero = sorteiaNumero();	
				if (numero == 1){
					filaClientes.enqueue(new Cliente(tempoCorrente));
				}
				else if (numero == 2){
					filaClientes.enqueue(new Cliente(tempoCorrente));
					filaClientes.enqueue(new Cliente(tempoCorrente));
				}
				tempoCorrente = tempoCorrente + 1;
			}
		}
		catch (UnderflowException e){
			System.out.println(e);
		}
		tempoMedio 		= (float) somaDosTempos / tempo;
		tamanhoMedio 	= (float) tamanhoFila / tempo;
	}
	
	
	/**
	 * Gera o arquivo de sa�da com os dados da simula��o
	 */
	public void geraArquivoDeSaida(String nomeDoArquivo){
		try {
		
			FileWriter  fw = new FileWriter(nomeDoArquivo);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("Número de clientes atendidos: " 	+ clientesAtendidos);
			pw.println("Tempo médio de espera na fila: " 	+ tempoMedio);
			pw.println("Tempo máximo de espera na fila: " 	+ tempoMaximoDeEspera);
			pw.println("Tamanho médio da fila: " 			+ tamanhoMedio);
			
			pw.close();
			
		} catch (IOException e) {
			System.out.println("Erro ao abrir o arquivo: " + e);
		}
	}
}
