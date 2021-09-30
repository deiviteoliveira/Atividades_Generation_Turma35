   programa {
     	
	  // --> Exercicio de n°3
	 //Autor: Deivite Oliveira :D
	// Data: 27/09/2021
	
	funcao inicio() {	
		
	inteiro controle = 0
	real media, numero = 0.0, soma = 0.0

	enquanto (numero >= 0) {
	
	escreva("Porfavor, informe um valor: ")
	leia(numero)

	se(numero > 0) {

	controle++

	soma += numero
		}
			
	}

	escreva("\nO total do Somatório: \n", soma)

	media = soma / controle
	escreva("\nA média dos valores: \n", media)

	escreva("\nForam lidos ", controle, " valores\n")

		
	     }
       }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */