package generatixExercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner leia = new Scanner(System.in);
	  
	  int horas, minutos, segundos, restoHoras, tempo;
	  
	 System.out.println("Escreva o tempo em formato de segundos: ");
	 tempo = leia.nextInt();
	 
	 horas = (tempo / 3600);
	 
	 restoHoras = (tempo % 3600);
	 
	 minutos = (restoHoras / 60);
	 
	 segundos = (restoHoras % 60);
	 
	 System.out.println("Seu tempo em horas é : " + horas + "hora" + minutos + "minutos" + segundos + "segundos");
	 
	 
	  
	  leia.close();
	  
	
	
	}
	

}
