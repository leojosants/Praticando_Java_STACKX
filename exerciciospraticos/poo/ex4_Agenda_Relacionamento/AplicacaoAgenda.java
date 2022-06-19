package exerciciospraticos.poo.ex4_Agenda_Relacionamento;

public class AplicacaoAgenda {

	public static void main(String[] args) {

		Pessoa leo = new Pessoa("Leo", "38", 1.17);
		Pessoa leonardo = new Pessoa("Leonardo", "58", 1.40);
		Pessoa lucas = new Pessoa("Lucas", "48", 2.17);
		Pessoa leon = new Pessoa("Leon", "58", 2.40);

		FuncoesAgenda funcoesA = new FuncoesAgenda();

		System.out.println("\n-=-ARMAZENANDO PESSOA-=-");
		funcoesA.ArmazenarPessoa(leo);
		funcoesA.ArmazenarPessoa(leonardo);
		funcoesA.ArmazenarPessoa(lucas);
		funcoesA.ArmazenarPessoa(leon);

		System.out.println("\n-=-REMOVENDO PESSOA-=-");
		funcoesA.removerPessoa(leo);
		funcoesA.removerPessoa(leonardo);

		System.out.println("\n-=-BUSCANDO POSIÇÃO DA PESSOA-=-");
		System.out.println("\tPosição da Pessoa '" + lucas.getNome() + "': " + funcoesA.buscarPessoa(lucas));

		System.out.println("\n-=-BUSCANDO PESSOA POR POSIÇÃO-=-");
		funcoesA.imprimirPessoa(1);

		System.out.println("\n-=-IMPRIMINDO AGENDA-=-");
		funcoesA.imprimirAgenda();
	}

}
