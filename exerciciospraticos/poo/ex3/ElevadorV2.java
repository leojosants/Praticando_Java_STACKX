package exerciciospraticos.poo.ex3;

public class ElevadorV2 {

	private Integer andarAtual;
	private Integer totalAndares;
	private Integer capacidade;
	private Integer totPessoasDentro;

	public ElevadorV2() {
	}

	private Integer getAndarAtual() {
		return andarAtual;
	}

	private void setAndarAtual(Integer andarAtual) {
		this.andarAtual = andarAtual;
	}

	private Integer getTotalAndares() {
		return totalAndares;
	}

	private void setTotalAndares(Integer totalAndares) {
		this.totalAndares = totalAndares;
	}

	private Integer getCapacidade() {
		return this.capacidade;
	}

	private void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	private Integer getTotPessoasDentro() {
		return totPessoasDentro;
	}

	private void setTotPessoasDentro(Integer totPessoasDentro) {
		this.totPessoasDentro = totPessoasDentro;
	}

	public void inicializar(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		this.totPessoasDentro = 0;
		System.out.println("--> Elevador inicializado");
	}

	public void entrar(int totEntrar) {
		int vagaLivre = this.getCapacidade() - this.getTotPessoasDentro();
		
		if (totEntrar <= 0 || totEntrar > this.getCapacidade()) {
			System.out.println("--> Quantidade para ENTRAR invalida");
		}
		else {
			if (totEntrar <= vagaLivre) {
				this.setTotPessoasDentro(this.getTotPessoasDentro() + totEntrar);
				System.out.printf("--> Entrou %d%n", totEntrar);
			}
			else {
				System.out.println("--> Sem vagas");
			}
		}

	}

	public void sair(int totSair) {
		if (totSair <= 0 || totSair > this.getCapacidade()) {
			System.out.println("--> Quantidade para SAIR invalida");
		}
		else {
			this.setTotPessoasDentro(this.getTotPessoasDentro() - totSair);
			if (this.getTotPessoasDentro() < 0) {
				this.setTotPessoasDentro(0);
			}
			System.out.printf("--> Saiu %d%n", totSair);
		}
		
	}

	public void subir(int totSubir) {
		if (totSubir <= 0 || totSubir > this.getCapacidade()) {
			System.out.println("--> Quantidade para SUBIR invalida");
		}
		else {
			if (this.getAndarAtual() < this.getTotalAndares()) {
				this.setAndarAtual(this.getAndarAtual() + totSubir);
				System.out.printf("--> Subiu %d%n", totSubir);
			}
			else {
				System.out.printf("--> Não é possível subir, elevador ja se encontra no andar %d%n", this.getTotalAndares());
			}
		}
	}

	public void descer(int totDescer) {
		if (totDescer <= 0 || totDescer > this.getCapacidade()) {
			System.out.println("--> Quantidade para DESCER invalida");
		}
		else {
			if (this.getAndarAtual() > 0) {
				this.setAndarAtual(this.getAndarAtual() - totDescer);
				if (this.getAndarAtual() < 0) {
					this.setAndarAtual(0);
				}
				System.out.printf("--> Desceu %d%n", totDescer);
			}
			else {
				System.out.println("--> Não é possível descer, elevador ja se encontra no andar 0");
			}
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
