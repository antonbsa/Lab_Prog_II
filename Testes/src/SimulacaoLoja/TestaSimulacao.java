package SimulacaoLoja;

	public class TestaSimulacao {
		
		public static void main(String[] args) {
			Simulacao sim = new Simulacao();
			sim.simulaFluxo(100);
			sim.geraArquivoDeSaida("saida.txt");
		}
	}
