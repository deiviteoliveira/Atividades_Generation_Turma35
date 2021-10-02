package generatixExercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Tecle o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Tecle o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Tecle o valor de C: ");
		c = leia.nextDouble();
		
		System.out.println("Tecle o valor de D: ");
		d = leia.nextDouble();
		
		System.out.println("Tecle o valor de E: ");
		e = leia.nextDouble();
		
		System.out.println("Tecle o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c*e - b*f))/((a*e) - (b*d));
		y = ((a*f) - (c*d))/((a*e) - (b*d));
		
		System.out.println("Tecle o valor de X é: "+x);
		
		System.out.println("Tecle o valor de Y é: "+ y);
		
		leia.close();
		
		
		
		
		
		
		
		
		
		
	}

}
