package Mod2;
public class Eletronico implements ItemDeVenda{

	protected double valor;
	protected String tipo;
	
	public void ProdutoEletronico(double valor, String tipo){
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public double valorDoImposto() {
			return valor * 0.10;
			
	}
	
	public double valorDoItem() {
			return valor + valorDoImposto();
	}
}