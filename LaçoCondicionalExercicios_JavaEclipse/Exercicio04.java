package LaçoCondicionalExercicios;

import java.util.Scanner;

import java.math.*;

public class Exercicio04 {

	public static void main(String[] args) {
		

		Scanner ler = new Scanner (System.in);
		
		double num;
		
		System.out.println("Digite um número : ");
		num = ler.nextDouble();
		
		if (num % 2 == 0.0) {
			
		System.out.println("O número informado é par! ");
		System.out.println("Está é a raiz quadrada do número par : " + Math.sqrt(num));
			
	    
		}
		
		else {
			
		System.out.println(num + ": O número é impar. ");
		System.out.println(num + "Este número elevado ao quadrado é: " + Math.pow(num, 2));
			
		
		
	
		}
	
		
		
		
	}


}
