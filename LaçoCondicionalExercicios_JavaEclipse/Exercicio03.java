package La�oCondicionalExercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);  
	     
	     //vamos solicitar a idade da pessoa
	    System.out.print("Informe sua idade: ");
	    int idade = Integer.parseInt(entrada.nextLine());
	      
	    // vamos verificar a categoria da pessoa
	    if((idade >= 10) && (idade <= 14)) {
	      System.out.println("Sua categoria � Infantil");  
	    }
	    else if((idade >= 15) && (idade <= 17)) {
	      System.out.println("Sua categoria � Juvenil");  
	    }
	    else if((idade >= 18) && (idade <= 25)) {
	      System.out.println("Sua categoria � Infantil");  
	    }
	    
	    else {
	      System.out.println("N�o pertence a nenhuma categoria.");  
	    }
	     
	    System.out.println("\n");
	    
	    entrada.close();
	  }
	
	}


