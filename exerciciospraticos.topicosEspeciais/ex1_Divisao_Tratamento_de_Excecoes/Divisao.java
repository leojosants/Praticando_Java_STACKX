package exerciciospraticos.topicosEspeciais.ex1_Divisao_Tratamento_de_Excecoes;

public class Divisao {

	private Integer primeiroValor;
	private Integer segundoValor;

	public Divisao(Integer primeiroValor, Integer segundoValor) {
		this.primeiroValor = primeiroValor;
		this.segundoValor = segundoValor;
	}

	public int resultado() {
		if (segundoValor == 0) {
			throw new ArithmeticException("--> ERRO: N�o � poss�vel realizar divis�o por zero.");
		}
		else {
			return this.primeiroValor / this.segundoValor;
		}
	}

	@Override
	public String toString() {
		return "Resultado de " + primeiroValor + " / " + segundoValor + ": ";
	}

}
