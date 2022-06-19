package exerciciospraticos.poo.ex8_Figuras_Geometricas_Interfaces;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int opc = 0;
		double area = 0.0;
		
		do {
			opcao();
			opc = leitor.nextInt();
			System.out.println();
			
			switch (opc) {
			case 1:
				System.out.print("Informe o Raio: ");
				double raio = leitor.nextDouble();
				
				Circulo c = new Circulo(raio);
				area = c.calcularArea();
				
				System.out.printf("--> Área do Circulo: %.2fcm²%n", area);
				break;

			case 2:
				System.out.print("Informe a Largura: ");
				double largura = leitor.nextDouble();
				
				System.out.print("Informe a Altura: ");
				double altura = leitor.nextDouble();
				
				Quadrado q = new Quadrado(largura, altura);
				area = q.calcularArea();
				
				System.out.printf("--> Área do Quadrado: %.2fcm²%n", area);
				break;
				
			case 3:
				System.out.print("Informe a Largura: ");
				double largura1 = leitor.nextDouble();
				
				System.out.print("Informe a Altura: ");
				double altura1 = leitor.nextDouble();
				
				Retangulo r = new Retangulo(largura1, altura1);
				area = r.calcularArea();
				
				System.out.printf("--> Área do Retangulo: %.2fcm²%n", area);
				break;
				
			case 4:
				System.out.print("Informe a Largura: ");
				double largura2 = leitor.nextDouble();
				
				System.out.print("Informe a Altura: ");
				double altura2 = leitor.nextDouble();
				
				Triangulo t = new Triangulo(largura2, altura2);
				area = t.calcularArea();
				
				System.out.printf("--> Área do Triangulo: %.2fcm²%n", area);
				break;
				
			case 5:
				System.out.println("Saindo");
				break;
				
			default:
				System.out.println("Opção invalida");
				break;
			}
			
		} while(opc != 5);
		
		leitor.close();
		
//		System.out.println("QUADRADO");
//		Quadrado q = new Quadrado(1.5, 3.6);
//		double areaQuadrado = q.calcularArea();
//		System.out.printf("%.2fcm²%n", areaQuadrado);
//		
//		System.out.println("\nRETANGULO");
//		Retangulo r = new Retangulo(1.9, 4.6);
//		double areaRetangulo = r.calcularArea();
//		System.out.printf("%.2fcm²%n", areaRetangulo);
//		
//		System.out.println("\nTRIANGULO");
//		Triangulo t = new Triangulo(4.5, 2.8);
//		double areaTriangulo = t.calcularArea();
//		System.out.printf("%.2fcm²%n", areaTriangulo);
//		
//		System.out.println("\nCIRCULO");
//		Circulo c = new Circulo(2.9);
//		double areaCirculo = c.calcularArea();
//		System.out.printf("%.2fcm²%n", areaCirculo);

	} // fim main

	public static void opcao() {
		System.out.println("\nCalcular ára de qual figura?");

		System.out.println(" 1 - Círculo");
		System.out.println(" 2 - Quadrado");
		System.out.println(" 3 - Retangulo");
		System.out.println(" 4 - Triangulo");
		System.out.println(" 5 - Sair");
		
		System.out.print("Escolha uma opção: ");
	}
	

}
