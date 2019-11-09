package Mod2;
public class Livro {

		protected String titulo;
		protected String autor;
		protected String ISBN;
		
		protected double valor;
		
		public Livro(String titulo, String autor, String ISBN, double valor) {
				this.titulo = titulo;
				this.autor = autor;
				this.ISBN = ISBN;
				this.valor = valor;
		}
		
		public double valorDoImposto() {
				return valor * 0.05;
		}
		
		public double valorDoItem() {
				return (valor * 0.9) + valorDoImposto();
		}
}
