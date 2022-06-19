package exerciciospraticos.poo.ex7_Figuras_Geometricas_Heranca_e_Polimorfismo;

public class Triangulo extends FigurasGeometricas {

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
