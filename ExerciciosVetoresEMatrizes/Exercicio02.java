package ExerciciosVetoresEMatrizes;


import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
	// Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
	//  Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
	//  A seguir determine e imprima a m�dia aritm�tica dos lan�amentos,
	// contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
	
		
		Scanner leia = new Scanner(System.in);

		int lancamentoDado[] = new int[10];
		int maiorLancamento = 0;
		int contadorMaiorLancamento = 0;
		double somador = 0.0;
		double mediaLancamentos = 0.0;

		for (int i=0; i<lancamentoDado.length; i++) {

			System.out.printf("%d� la�amento: ", i+1);
			lancamentoDado[i] = leia.nextInt();
			somador += lancamentoDado[i];

			if (lancamentoDado[i] > maiorLancamento) {
				contadorMaiorLancamento = 0;
			}

			if (lancamentoDado[i] >= maiorLancamento) {
				maiorLancamento = lancamentoDado[i];
				contadorMaiorLancamento++;
			}

		}

		mediaLancamentos = (somador/lancamentoDado.length);	
		System.out.println("-----------------------");
		System.out.printf("M�DIA: %.2f \nSOMA DOS LAN�AMENTOS: %.0f \nFREQU�NCIA DO MAIOR LAN�AMENTO: %d",mediaLancamentos, somador, contadorMaiorLancamento);


        leia.close();

	}

}
	
	
