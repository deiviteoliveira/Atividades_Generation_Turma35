package ExerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio1 {

public static void main(String[] args) {
//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade  
//e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.	
	
		
	Scanner leia = new Scanner(System.in);

	double notas[] = new double[5];
	double mNota = 0.0;

	for (int i=0; i<5; i++) {

		do {

			System.out.printf("Informe a %d� nota: ", i+1);
			notas[i] = leia.nextDouble();

			if(notas[i]<0 || notas[i]>10) {
				System.out.println();
				System.out.println("DIGITE UMA NOTA V�LIDA!");
			}

		} while(notas[i]<0 || notas[i]>10);


		if (notas[i] > mNota) {
			mNota = notas[i];
		}
	}

	System.out.println();
	System.out.printf("A maior nota �: %.2f", mNota);

leia.close();
}



    
	
	
	
			
		
}
		
	
		

	
	


