package exerciciospraticos.poo.ex3;

public class Elevador {

	private Integer andarAtual;
	private Integer totalAndares;
	private Integer capacidade;
	private Integer totPessoasDentro;

	public Elevador() {
	}

	public Integer getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(Integer andarAtual) {
		this.andarAtual = andarAtual;
	}

	public Integer getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(Integer totalAndares) {
		this.totalAndares = totalAndares;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Integer getTotPessoasDentro() {
		return totPessoasDentro;
	}

	public void setTotPessoasDentro(Integer totPessoasDentro) {
		this.totPessoasDentro = totPessoasDentro;
	}

	public void inicializar(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		this.totPessoasDentro = 0;
		System.out.println("--> Elevador inicializado");
	}

	public void entrar() {
		if (this.getTotPessoasDentro() < this.getCapacidade()) {
			this.totPessoasDentro += 1;
			System.out.println("--> Entrou");
		} else {
			System.out.println("--> Não entrou, elevador cheio");
		}

	}

	public void sair() {
		if (this.getTotPessoasDentro() > 0) {
			this.totPessoasDentro -= 1;
			System.out.println("--> Saiu");
		} else {
			System.out.println("--> Não saiu, elevador já está vazio");
		}
	}

	public void subir() {
		if (this.getAndarAtual() < this.getTotalAndares()) {
			this.andarAtual += 1;
			System.out.println("--> Subiu");
		} else {

			System.out.println("--> Não subiu, elevador já se encontra no último andar.");
		}
	}

	public void descer() {
		if (this.getAndarAtual() > 0) {
			this.andarAtual -= 1;
			System.out.println("--> Desceu");
		} else {

			System.out.println("--> Não desceu, elevador já se encontra no primeiro andar.");
		}
	}
	
	public void status() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return String.format(
				"\n-> Dados do Elevador: \n" + "\t Andar Atual:  %d%n " + "\t Total de andares: %d%n"
						+ "\t Capacidade: %d%n" + "\t Total de pessoas dentro: %d%n",
				andarAtual, totalAndares, capacidade, totPessoasDentro);
	}

}
