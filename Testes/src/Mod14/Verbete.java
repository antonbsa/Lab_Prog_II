package Mod14;

public class Verbete implements Comparable {

	protected String palavra;
	protected String traducao;
 	
	public Verbete(String palavra, String traducao) {
		this.palavra = palavra;
		this.traducao = traducao;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String getTraducao() {
		return traducao;
	}

	public void setTraducao(String traducao) {
		this.traducao = traducao;
	}

	public int compareTo(Object o) {
		Verbete v = (Verbete) o;
		return v.getPalavra().compareTo(this.getPalavra());
	}	
}
