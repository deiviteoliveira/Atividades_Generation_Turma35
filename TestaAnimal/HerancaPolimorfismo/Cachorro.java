package HerancaPolimorfismo;



public class Cachorro extends Animal {

	private String raca;
	private boolean vacinado;

	public Cachorro (String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;

	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}







}
