package generatixExercicios;
import java.math.*;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia = new Scanner(System.in);
	
	int a, b, c; double r, s, d;
	
	System.out.println("Tecle o valor de A: ");
	a = leia.nextInt();
	
	System.out.println("Tecle o valor de B: ");
	b = leia.nextInt();
	
	System.out.println("Tecle o valor de C: ");
	c = leia.nextInt();
	
	r =(a+b) * (a+b);
	System.out.println("O valor de R �: "+ r);
	
	s =(b+c) * (b=c);
	System.out.println("O valor de S �: "+ s);
	
	d = (r+s) / 2;
    
	System.out.println("O valor de D �: "+ d);
	
	
	leia.close();
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
