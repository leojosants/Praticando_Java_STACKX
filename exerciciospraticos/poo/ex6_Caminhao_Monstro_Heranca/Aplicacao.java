package exerciciospraticos.poo.ex6_Caminhao_Monstro_Heranca;

public class Aplicacao {

	public static void main(String[] args) {

		Carro c = new Carro();
		c.m1();
		c.m2();
		System.out.println(c.toString());
		
		System.out.println("----------------------------");

		Caminhao ca = new Caminhao();
		ca.m1();
		ca.m2();
		System.out.println(ca.toString());
		
		System.out.println("----------------------------");
		
		CaminhaoMonstro cm = new CaminhaoMonstro();
		cm.m1();
		cm.m2();System.out.println(cm.toString());
		
	}

}
