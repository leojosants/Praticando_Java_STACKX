package exerciciospraticos.poo.ex6_Caminhao_Monstro_Heranca;

public class CaminhaoMonstro extends Caminhao {

	public CaminhaoMonstro() {}

	public void m1() {
		System.out.println("monstro1");
	}

	public void m2() {
		super.m1();
		super.m2();
	}

	public String toString() {
		return "monstro " + super.toString();
	}

}
