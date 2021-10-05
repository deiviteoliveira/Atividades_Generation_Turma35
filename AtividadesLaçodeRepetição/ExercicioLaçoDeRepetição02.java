package AtividadesLaçodeRepetição;

import java.util.Scanner;

public class ExercicioLaçoDeRepetição02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		Scanner ler = new Scanner(System.in);
		
		int par = 0, impar = 0, numeros;
		
		for(int n = 0; n <= 10; n++) {
			System.out.println("Digite o numero: " );
			numeros = ler.nextInt();
			
			
			if(numeros % 2 == 0) {
				par ++;				
				
			
			}
			
			else if (numeros % 2 != 0) {
				
				 impar ++;
				 
				 
			}
			
			
			
		}
		
		
		System.out.println("Quantos numeros par : " + par);
		System.out.println("Quantos numeros impar : " + impar);
		
	}

}
