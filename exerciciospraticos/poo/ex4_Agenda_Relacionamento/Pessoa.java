package exerciciospraticos.poo.ex4_Agenda_Relacionamento;

public class Pessoa {

	private String nome;
	private String idade;
	private Double altura;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String idade, Double altura) {
		super();
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

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "\tNome: " + nome 
				+ ", Idade: " + idade 
				+ String.format(", Altura: %.2f", altura);
	}

	
}
