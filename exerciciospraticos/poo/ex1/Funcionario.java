package exerciciospraticos.poo.ex1;

public class Funcionario {

	private Integer codigo;
	private Character turno;
	private Character categoria;
	
	public Funcionario(Integer codigo, Character turno, Character categoria) {
		this.codigo = codigo;
		this.turno = turno;
		this.categoria = categoria;
	}

	public Integer getCodigo() {
		int cod = (int) (Math.random() * 100);
		return cod + codigo;
	}

	public Character getTurno() {
		return turno;
	}

	public Character getCategoria() {
		return categoria;
	}
	
}
