package exerciciospraticos.poo.ex2;

public class Pessoa {

	private String nome;
	private Integer idade;
	private Double altura;

	public Pessoa() {}

	public Pessoa(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void fazerAniversario() {
		this.idade++;
		System.out.println("fez aniversario");
	}

	public void imprimirDados() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return String.format("\nNome: %s%n" + "Idade: %d anos%n" + "Altura: %.2fm", nome, idade, altura);
	}

}
