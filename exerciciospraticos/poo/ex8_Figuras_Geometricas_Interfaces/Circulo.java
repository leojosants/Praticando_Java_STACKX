package exerciciospraticos.poo.ex8_Figuras_Geometricas_Interfaces;

public class Circulo implements FigurasGeometricas {

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
