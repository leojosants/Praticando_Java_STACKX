package exerciciospraticos.poo.ex3;

public class Aplicacao {

	public static void main(String[] args) {

		ElevadorV2 e = new ElevadorV2();
		e.inicializar(2, 2);
		e.entrar(1);
		e.subir(1);
		e.descer(2);
		e.descer(1);
		e.entrar(1);
		e.subir(2);
		e.subir(1);
		
		
		e.status();

	}

}
