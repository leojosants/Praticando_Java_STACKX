package exerciciospraticos.poo.ex1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner leitor = new Scanner(System.in);
			
			List<FolhaDePagamento> folhap = new ArrayList<FolhaDePagamento>();
		
			for (int i = 1; i <= 10; i++) {
				System.out.printf("DADOS DO # %dº FUNCIONARIO", i);
				
				int codigo = lerCodigo(leitor);
				int numHoras = lerNumHoras(leitor);
				char categoria = lerCategoria(leitor);
				char turno = lerTurno(leitor);
				
				Funcionario func = new Funcionario(codigo, categoria, turno);

				FolhaDePagamento folha = new FolhaDePagamento(func);
				folha.setNumHorasTrabmes(numHoras);
				folhap.add(folha);
			
				System.out.println();
			}
			
			System.out.println("LISTAGEM DE FUNCIONARIOS");
			for (FolhaDePagamento folhaDePagamento : folhap) {
				System.out.println(folhaDePagamento);
			}

			leitor.close();
		} 
		catch (InputMismatchException e) {
			System.out.println("---> ERRO, entrada de dados inválida.");
		} 
		finally {
			System.out.println("-=- Fim do programa");
		}

	}// fim main

	public static int lerCodigo(Scanner leitor) {

		System.out.print("\n- Código: ");
		int codigo = leitor.nextInt();
		return codigo;

	}
	//

	public static int lerNumHoras(Scanner leitor) {
		System.out.print("- Número de horas trabalhadas no mês: ");
		int numHoraTrab = leitor.nextInt();
		return numHoraTrab;
	}
	//

	public static char lerCategoria(Scanner leitor) {
		char cat = 'X';

		if (cat != 'M' && cat != 'V' && cat != 'N') {
			System.out.print("- Categoria [M]-Matutino [V]-Vespertino [N]-Noturno: ");
			cat = leitor.next().toUpperCase().charAt(0);

			while (cat != 'M' && cat != 'V' && cat != 'N') {
				System.out.print("--> Erro, insira somente [M/V/N]: ");
				cat = leitor.next().toUpperCase().charAt(0);
			}

		}

		return cat;

	}
	//

	public static char lerTurno(Scanner leitor) {
		char turno = 'X';

		if (turno != 'N' && turno != 'O') {
			System.out.print("- Turno [O]-Operario [G]-Gerente]: ");
			turno = leitor.next().toUpperCase().charAt(0);

			while (turno != 'O' && turno != 'G') {
				System.out.print("--> Erro, insira somente [O/P]: ");
				turno = leitor.next().toUpperCase().charAt(0);
			}

		}

		return turno;

	}
	//
	

}
