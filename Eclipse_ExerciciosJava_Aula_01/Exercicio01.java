package generatixExercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner leia = new Scanner(System.in);
	   
	   int diaAtual, mesAtual, anoAtual, diaNascimento, mesNascimento, anoNascimento, Total;
	   
	   System.out.println("Informe seu dia de anivers�rio: ");
	   diaNascimento = leia.nextInt();
	   
	   
	   System.out.println("Informe o n�mero do m�s de seu nascimento: ");
	   mesNascimento = leia.nextInt();
	   
	   System.out.println("Informe o ano do seu anivers�rio: ");
	   anoNascimento = leia.nextInt();
	   
	   System.out.println("Informe o dia atual: ");
	   diaAtual = leia.nextInt();
	   
	   System.out.println("Informe o m�s atual: ");
	   mesAtual = leia.nextInt();
	   
	   System.out.println("Informe o Ano atual: ");
	   anoAtual = leia.nextInt();
	   
	   Total = (anoAtual - anoNascimento) * 365 + (mesAtual * 30 + diaAtual) - (mesNascimento * 30 + diaNascimento);
	   
	   System.out.println("Sua idade em dias �: " + Total);
			   
	   
		leia.close();
	
	}
	

}
