package generatixExercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediaFinal;
		
		System.out.println("Tecle a Nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Tecle a Nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Tecle a Nota 3: ");
		nota3 = leia.nextDouble();
		
		mediaFinal = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		System.out.println("A sua média final é: "+ mediaFinal);
		
		leia.close();
		
		
		
		
		
		
		
		
	}

}
