package exerciciospraticos.poo.ex1;

public class FolhaDePagamento {
	
	private static final Double SALARIO_MINIMO = 450.00;
	private Funcionario funcionario;
	private Integer numHorasTrabmes;
	private Double valorHoraTrab;
	private Double salarioInicial;
	private Double valorAuxAlimentacao;
	private Double salarioFinal;

	public FolhaDePagamento(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Integer getNumHorasTrabmes() {
		return numHorasTrabmes;
	}

	public void setNumHorasTrabmes(Integer numHorasTrabmes) {
		this.numHorasTrabmes = numHorasTrabmes;
	}

	public Double getValorHoraTrab() {
		return valorHoraTrab;
	}

	public Double getSalarioInicial() {
		return salarioInicial;
	}

	public Double getValorAuxAlimentacao() {
		return valorAuxAlimentacao;
	}

	public Double getSalarioFinal() {
		return salarioFinal;
	}

	public static Double getSalarioMinimo() {
		return SALARIO_MINIMO;
	}

	private double calcValorHora() {
		double valorHora = 0.0;

		if (this.funcionario.getCategoria().equals('G')) {
			if (this.funcionario.getTurno().equals('N')) {
				valorHora = SALARIO_MINIMO * 0.18;
			} else if (this.funcionario.getTurno().equals('M') || this.funcionario.getTurno().equals('V')) {
				valorHora = SALARIO_MINIMO * 0.15;
			}
		} else if (this.funcionario.getCategoria().equals('O')) {
			if (this.funcionario.getTurno().equals('N')) {
				valorHora = SALARIO_MINIMO * 0.13;
			} else if (this.funcionario.getTurno().equals('M') || this.funcionario.getTurno().equals('V')) {
				valorHora = SALARIO_MINIMO * 0.1;
			}
		}

		return valorHora;
	}

	public Double calcSalarioInicial() {
		double salIni = 0.0;
		salIni = calcValorHora() * this.getNumHorasTrabmes();
		return salIni;
	}

	public Double calcAuxilioAlimentacao() {
		double auxAl = 0.0;

		if (calcSalarioInicial() <= 300.00) {
			auxAl = calcSalarioInicial() * 0.2;
		} else if (calcSalarioInicial() <= 600.00) {
			auxAl = calcSalarioInicial() * 0.15;
		} else {
			auxAl = calcSalarioInicial() * 0.05;
		}

		return auxAl;
	}

	public Double calcSalarioFinal() {
		double salarioFinal = 0.0;
		salarioFinal = calcSalarioInicial() + calcAuxilioAlimentacao();
		return salarioFinal;
	}

	public void imprimirFolha() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return String.format("\nCódigo: %d%n" + "Número de horas trabalhadas: %d%n" + "Valor da hora: R$ %.2f%n"
				+ "Salário Inicial: R$ %.2f%n" + "Valor auxilio Alimentação: R$ %.2f%n" + "Salario final: R$ %.2f%n",
				funcionario.getCodigo(), this.getNumHorasTrabmes(), calcSalarioInicial(), calcValorHora(),
				calcAuxilioAlimentacao(), calcSalarioFinal());
	}
}
