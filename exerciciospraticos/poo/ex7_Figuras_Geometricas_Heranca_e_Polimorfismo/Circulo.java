package exerciciospraticos.poo.ex7_Figuras_Geometricas_Heranca_e_Polimorfismo;

public class Circulo extends FigurasGeometricas {

	private Double raio;

	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}

}
