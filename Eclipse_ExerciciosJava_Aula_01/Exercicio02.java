package generatixExercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in); 
		
		int idadeAnos, idadeMeses, idadeDias, TotalDias;
		
		System.out.println("Digite quantos dias voc� j� viveu: ");
		TotalDias = leia.nextInt();
		
		idadeAnos = TotalDias/365;
		
		//TotalDias = TotalDias%365
		idadeMeses = (TotalDias%365) / 30;
		
		idadeDias = (TotalDias%365) % 30;
		
		
		System.out.println("A idade �: " + idadeAnos);
		System.out.println("Meses: " + idadeMeses);
		System.out.println("Dias: " + idadeDias);
		
		leia.close();
		
		
		
	
		
		
		
	}

}
