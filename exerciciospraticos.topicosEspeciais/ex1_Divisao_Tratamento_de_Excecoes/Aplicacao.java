package exerciciospraticos.topicosEspeciais.ex1_Divisao_Tratamento_de_Excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		try {
			int resultado = divisao(leitor);
			System.out.println(resultado);
		} 
		catch (ArithmeticException  e) {
			System.out.println("Erro: não é possivel realizar divisão por zero");
		}
		catch (InputMismatchException   e) {
			System.out.println("Erro: entrada de dados inválida");
		}
		
		leitor.close();
		
	}// fim main
	
	public static int divisao(Scanner leitor) {
		int resultado = 0;
		
			System.out.print("Informe o primeiro valor: ");
			int valorA = leitor.nextInt();
			
			System.out.print("Informe o primeiro valor: ");
			int valorB = leitor.nextInt();
			
			resultado = valorA / valorB;
			
			return resultado;		
	}

}
