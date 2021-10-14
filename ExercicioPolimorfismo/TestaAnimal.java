package br.com.generation.ExercicioPolimorfismo;

public class TestaAnimal {
	
	
	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();
		meuCachorro.somAnimal();
		
		Preguica minhaPreguica = new Preguica();
		minhaPreguica.somAnimal();
		
		Cavalo meuCavalo = new Cavalo ();
		meuCavalo.somAnimal();
		

}
}