package HerancaPolimorfismo;

public class Cavalo extends Animal {

	private String raca;

	public Cavalo (String nome, int idade, String raca) {
		super(nome, idade);

		this.raca = raca;

	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}





}