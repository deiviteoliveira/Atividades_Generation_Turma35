package AtividadesLaçodeRepetição;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner ler = new Scanner(System.in);
		int num, soma=0;
		
		float media=0, cont=0;
		
		System.out.println("\nDIGITE UM NÚMERO INTEIRO: ");
		num = ler.nextInt();
		
		if(num % 3 ==0 && num != 0);
		
		{
			
			soma=soma+num;
			cont++;
			
		}
		 while(num != 0) {
			 System.out.println("DIGITE UM NÚMERO INTEIRO: ");
			 num = ler.nextInt();
			 
			 if(num % 3==0 && num != 0) {
				 
				 soma =soma+num;
				 cont++;
				 
				 
			 }

			 
		 }
		media = soma/cont;
		
		
		ler.close();
	}

}
