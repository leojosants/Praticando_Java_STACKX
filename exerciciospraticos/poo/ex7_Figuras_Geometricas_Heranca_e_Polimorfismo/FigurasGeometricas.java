package exerciciospraticos.poo.ex7_Figuras_Geometricas_Heranca_e_Polimorfismo;

public abstract class FigurasGeometricas {

	public Double largura;
	public Double altura;
	
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public abstract double calcularArea();
	
}
