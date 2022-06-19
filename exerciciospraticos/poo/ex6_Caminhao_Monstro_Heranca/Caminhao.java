package exerciciospraticos.poo.ex6_Caminhao_Monstro_Heranca;

public class Caminhao extends Carro {


	public Caminhao() {}

	public void m1() {
		System.out.println("caminhao1");
	}
	
	public void m2() {
		super.m1();
	}
	
	public String toString() {
		return super.toString() + super.toString();
	}
	
}
