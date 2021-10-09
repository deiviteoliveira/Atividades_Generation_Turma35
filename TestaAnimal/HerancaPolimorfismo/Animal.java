package HerancaPolimorfismo;

public class Animal {
	private String nome;
	private int idade;

	//CONSTRUTOR
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}


	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	//MÉTODOS
	public void emitirSom(String som) {
		System.out.println(som);
	}

	public void correr() {
		System.out.println("Correndo...");
	}




}