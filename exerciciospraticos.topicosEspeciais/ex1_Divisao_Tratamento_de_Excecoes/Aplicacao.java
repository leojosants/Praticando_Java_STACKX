package exerciciospraticos.topicosEspeciais.ex1_Divisao_Tratamento_de_Excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		char resp = 'x';
		
		try {
			System.out.println("\nINFORME DOIS VALORES INTEIROS");
			
			do {
				
				System.out.print("\nInforme o primeiro valor: ");
				int valorA = leitor.nextInt();
				
				System.out.print("Informe o primeiro valor: ");
				int valorB = leitor.nextInt();		
				
				Divisao d = new Divisao(valorA, valorB);
				int resultado = d.resultado();
				
				System.out.println(d.toString() + resultado);
				
				System.out.print("\nQuer continuar [S/N]? ");
				resp = leitor.next().toUpperCase().charAt(0);
				
				while(resp != 'S' && resp != 'N') {
					System.out.print("--> Opção invalida, tente novamente [S/N]: ");
					resp = leitor.next().toUpperCase().charAt(0);
				}
				
				if (resp == 'N') {
					break;
				}
				
			} while (resp != 'N');
			
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("\n--> ERRO: Entrada inválida de dados;");
		}
		finally {
			System.out.println("-=- Fim do programa -=-");
		}
		
		leitor.close();
		
	}// fim main
	
//	public static int divisao(Scanner leitor) {
//		int resultado = 0;
//		
//		try {
//			int resultado = divisao(leitor);
//			System.out.println(resultado);
//		} 
//		catch (ArithmeticException  e) {
//			System.out.println("Erro: não é possivel realizar divisão por zero");
//		}
//		catch (InputMismatchException   e) {
//			System.out.println("Erro: entrada de dados inválida");
//		}
//		
//			System.out.print("Informe o primeiro valor: ");
//			int valorA = leitor.nextInt();
//			
//			System.out.print("Informe o primeiro valor: ");
//			int valorB = leitor.nextInt();
//			
//			resultado = valorA / valorB;
//			
//			return resultado;		
//	}

}
