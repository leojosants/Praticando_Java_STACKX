package exerciciospraticos.poo.ex4_Agenda_Relacionamento;

import java.util.ArrayList;

public class FuncoesAgenda {

	public FuncoesAgenda() {
		super();
	}

	private static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

	public static ArrayList<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public void ArmazenarPessoa(Pessoa p) {
		listaPessoas.add(p);
		System.out.println("\tPessoa '" + p.getNome() + "' armazenada com sucesso");
	}

	public void removerPessoa(Pessoa nome) {
				listaPessoas.remove(nome);
				System.out.println("\tPessoa '" + nome.getNome() + "' removida com sucesso");
	}
	
	public int buscarPessoa(Pessoa nome) {
		int index = 0;
		
		for (Pessoa pessoa : listaPessoas) {
				index = listaPessoas.indexOf(nome);
		}
		return index;
	}
	
	public void imprimirAgenda() {
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa.toString());
		}
	}
	
	public void imprimirPessoa(int index) {
			System.out.println("\tPessoa na posição " + index + ": " + listaPessoas.get(index).getNome());
	}
	
}
