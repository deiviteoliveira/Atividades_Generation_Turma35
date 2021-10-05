package AtividadesLaçodeRepetição;

import java.util.Scanner;

public class CorreçãoRepetiçãoExercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, contador21 = 0, contador50 = 0;
		System.out.println("DIGITE A IDADE: ");
        idade = entrada.nextInt();
        
        while (idade != -99) {
        	
        	if (idade<=21) {
        		contador21++;	
        		
        	}
        
        	if(idade >= 50) {
        	contador50++;
        	
        	
        	
        }
      
        System.out.println("\nDIGITE A IDADE ---> (PARA ENCERRAR DIGITE -99): ");
        idade = entrada.nextInt();
        
        }
        
        System.out.println("TOTAL DE PESSOAS COM MENOS DE 21 ANOS: " + contador21);
        System.out.println("TOTAL DE PESSOAS COM MAIS DE 50 ANOS: " + contador50);
		
		entrada.close();
	}

}
