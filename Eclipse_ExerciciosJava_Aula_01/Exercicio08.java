package generatixExercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor;
		
		System.out.println("Qual é o valor de fabrica deste carro?: ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
		
		System.out.println("O custo do modelo deste carro ao consumidor é "+ custoConsumidor);
		
		leia.close();
		
		
		
		
	}

}
