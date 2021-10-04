    package LaçoCondicionalExercicios;

    import java.util.Scanner;

    public class Exercicio01 {

	public static void main(String[] args) {
		

	
	Scanner ler = new Scanner(System.in);
	
	int num1, num2, num3, numMaior;
	
	System.out.println("Tecle o primeiro número : ");
	num1 = ler.nextInt();
	
	System.out.println("Tecle o segundo número : ");
	num2 = ler.nextInt();
	
	System.out.println("Tecle o terceiro número : ");
	num3 = ler.nextInt();
	
    if(num1 > num2) {
    if(num1 > num3)
    numMaior = num1;
    else
    numMaior = num3;
    }
    
    
    else {
    if(num2 > num3)
    numMaior = num2;
    else
     numMaior = num3;
    }

    System.out.println("Este é o maio número" + numMaior);
    
	}
    
}