package TrabMod6;

public class AvaliadorExpressao {
	private String expressao;
	//private Stack<String> pilha = new StaticStack<>(10);

	public AvaliadorExpressao(String exp) {
		this.expressao = exp;
	}

	public AvaliadorExpressao() {
	}

	public String getExpressao() {
		return this.expressao;
	}

	public void setExpressao(String exp) {
		this.expressao = exp;
	}

	
//	  public void empilha(String str) {
//		this.pilha.push(str);
//	}

	public boolean ehInteiro(String s) {
		char[] c = s.toCharArray();
		boolean aux = true;
		for (int i = 0; i < c.length; i++)
			if (!Character.isDigit(c[i])) {
				aux = false;
				break;
			}
		return aux;
	}

//	public void calculo(String op) {
//		if (pilha.numElements() != 1) {
//			String num1 = pilha.pop();
//			String num2 = pilha.pop();
//			if (op.equals("+")) {
//				int resultado = Integer.valueOf(num1) + Integer.valueOf(num2);
//				String resultadoFinal = String.valueOf(resultado);
//				pilha.push(resultadoFinal);
//			} else if (op.equals("-")) {
//				int resultado = Integer.valueOf(num1) - Integer.valueOf(num2);
//				String resultadoFinal = String.valueOf(resultado);
//				pilha.push(resultadoFinal);
//			} else if (op.equals("*")) {
//				int resultado = Integer.valueOf(num1) * Integer.valueOf(num2);
//				String resultadoFinal = String.valueOf(resultado);
//				pilha.push(resultadoFinal);
//			} else if (op.equals("/")) {
//				int resultado = Integer.valueOf(num1) / Integer.valueOf(num2);
//				String resultadoFinal = String.valueOf(resultado);
//				pilha.push(resultadoFinal);
//			} else if (op.equals("%")) {
//				int resultado = Integer.valueOf(num1) % Integer.valueOf(num2);
//				String resultadoFinal = String.valueOf(resultado);
//				pilha.push(resultadoFinal);
//			} else
//				System.out.println("Deu ruim");
//			System.out.println(pilha.toString());
//		}else {
//			System.out.println("Quantidade de Operadores Inv�lido!");
//			System.out.println(pilha.toString());
//		}
	}
