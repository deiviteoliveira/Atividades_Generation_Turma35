package ExerciciosVetoresEMatrizes;


import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
	// Um dado é lançado 10 vezes e o valor correspondente é anotado.
	//  Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
	//  A seguir determine e imprima a média aritmética dos lançamentos,
	// contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	
		
		Scanner leia = new Scanner(System.in);

		int lancamentoDado[] = new int[10];
		int maiorLancamento = 0;
		int contadorMaiorLancamento = 0;
		double somador = 0.0;
		double mediaLancamentos = 0.0;

		for (int i=0; i<lancamentoDado.length; i++) {

			System.out.printf("%dº laçamento: ", i+1);
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
		System.out.printf("MÉDIA: %.2f \nSOMA DOS LANÇAMENTOS: %.0f \nFREQUÊNCIA DO MAIOR LANÇAMENTO: %d",mediaLancamentos, somador, contadorMaiorLancamento);


        leia.close();

	}

}
	
	
