package La�oCondicionalExercicios;

import java.util.Scanner;

import java.math.*;

public class Exercicio04 {

	public static void main(String[] args) {
		

		Scanner ler = new Scanner (System.in);
		
		double num;
		
		System.out.println("Digite um n�mero : ");
		num = ler.nextDouble();
		
		if (num % 2 == 0.0) {
			
		System.out.println("O n�mero informado � par! ");
		System.out.println("Est� � a raiz quadrada do n�mero par : " + Math.sqrt(num));
			
	    
		}
		
		else {
			
		System.out.println(num + ": O n�mero � impar. ");
		System.out.println(num + "Este n�mero elevado ao quadrado �: " + Math.pow(num, 2));
			
		
		
	
		}
	
		
		
		
	}


}
