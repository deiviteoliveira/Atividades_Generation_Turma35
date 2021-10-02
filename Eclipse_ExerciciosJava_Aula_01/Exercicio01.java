package generatixExercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner leia = new Scanner(System.in);
	   
	   int diaAtual, mesAtual, anoAtual, diaNascimento, mesNascimento, anoNascimento, Total;
	   
	   System.out.println("Informe seu dia de aniversário: ");
	   diaNascimento = leia.nextInt();
	   
	   
	   System.out.println("Informe o número do mês de seu nascimento: ");
	   mesNascimento = leia.nextInt();
	   
	   System.out.println("Informe o ano do seu aniversário: ");
	   anoNascimento = leia.nextInt();
	   
	   System.out.println("Informe o dia atual: ");
	   diaAtual = leia.nextInt();
	   
	   System.out.println("Informe o mês atual: ");
	   mesAtual = leia.nextInt();
	   
	   System.out.println("Informe o Ano atual: ");
	   anoAtual = leia.nextInt();
	   
	   Total = (anoAtual - anoNascimento) * 365 + (mesAtual * 30 + diaAtual) - (mesNascimento * 30 + diaNascimento);
	   
	   System.out.println("Sua idade em dias é: " + Total);
			   
	   
		leia.close();
	
	}
	

}
