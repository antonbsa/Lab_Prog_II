package TrabMod6;

import java.util.Random;

public class Exercicio1 {
	
	//Instanciação do array de numeros
	static int[] list = new int[10];

	public static void main(String [] args) {
		
		
		
		System.out.println("Lista com valores aleatórios gerada (limitada até 1000): \n");
		//Instanciação e atribuição dos valores no array
		Random gerador = new Random();
		
		//Geração aleatória dos valores e impressão
		for(int i = 0; i<10; i++) {
			list[i]=gerador.nextInt(1000);
			System.out.println(list[i]);
		}
		
		//Atribuição de valor da quantidade de números ímpares
		int tam = 0;
		for(int i = 0; i<list.length; i++) {
			if(list[i]%2 == 0) {
				tam ++;
			}
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("\nValores pares da lista(Total de "+tam+" números): \n");
		
		int[] listPar = new int[tam];
		int pos = 0;
			
		//Teste lógico
		for(int i = 0; i<list.length; i++) {
			if(list[i]%2 == 0) {
				listPar[pos] = list[i];
				pos++;
				}
			}
				
		//Impressão do array Par
		for(int i = 0; i<listPar.length; i++) {
		System.out.println(listPar[i]);
		}
	
								

}
}