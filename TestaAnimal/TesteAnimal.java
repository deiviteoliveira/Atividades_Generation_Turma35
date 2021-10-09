package TestaAnimal;


import HerancaPolimorfismo.Animal;
import HerancaPolimorfismo.Cachorro;
import HerancaPolimorfismo.Cavalo;
import HerancaPolimorfismo.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {

		Animal cachorro = new Cachorro("Toby", 7, "Viralata");
		Animal cavalo = new Cavalo("Pé de pano", 13, "Frísio");
		Preguica preguica = new Preguica("Sydi", 20, "Choloepus hoffmanni");

		cachorro.correr();
		cachorro.emitirSom("au au au!!");
		System.out.println();
		cavalo.correr();
		cavalo.emitirSom("Rinrinrin");
		System.out.println();
		preguica.subirEmArvore();

	}

}