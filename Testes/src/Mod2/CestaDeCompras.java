package Mod2;
public class CestaDeCompras {

	public static final int MAXITENS = 10;
	protected ItemDeVenda items [];
	protected int qtdItens;
	
	public CestaDeCompras() {
			this.items = new ItemDeVenda[MAXITENS];
			qtdItens = 0;
	}
	
	public void adicionaItem(ItemDeVenda item) {
			if(qtdItens < MAXITENS) {
				items[qtdItens] = item;
				qtdItens = qtdItens + 1;
		}
	}
}
