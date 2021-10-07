package ExerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		
		 //Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		//	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		//	diagonal, ou seja, diagonal principal.
		 

		
		
		
		Scanner ler = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int sElementos = 0;
		int sDiagonalPrincipal = 0;

		System.out.println("PREENCHENDO MATRIZ [lnh][col]");
		System.out.println("....................................");
		for (int i=0; i<3; i++) {
			for(int t=0; t<3; t++) {
				System.out.printf("Digite o valor das posições [%d][%d]: ", (i+1), (t+1));
				matriz[i][t] = ler.nextInt();

				sElementos += matriz[i][t];

				if (i==t) {
					sDiagonalPrincipal += matriz[i][t];
				}
			}

		}
		System.out.println("....................................");
		System.out.printf("\nA SOMA DOS ELEMENTOS DA MATRIZ É: %d", sElementos);
		System.out.printf("\nA SOMA DA DIAGONAL PRINCIPAL DA MATRIZ É: %d", sDiagonalPrincipal);

		
		ler.close();

	}

}	