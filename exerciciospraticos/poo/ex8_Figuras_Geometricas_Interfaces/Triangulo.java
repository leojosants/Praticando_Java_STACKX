package exerciciospraticos.poo.ex8_Figuras_Geometricas_Interfaces;

public class Triangulo implements FigurasGeometricas {

	private Double altura;
	private Double largura;
	
	public Triangulo(Double largura, Double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.altura * this.largura) / 2;
	}

}
