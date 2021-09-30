// Questão 2

      programa {

      inclua biblioteca Matematica --> mat
	
      funcao inicio(){
		
      real num1, num2, num3, num4

      escreva("Escreva o primeiro número")
      leia(num1)

      escreva("Escreva o segundo número")
      leia(num2)

      escreva("Escreva o terceiro número")
      leia(num3)

      escreva("Escreva o quarto número")
      leia(num4)

      num1 = mat.potencia(num1, 2.0)
      num2 = mat.potencia(num2, 2.0)
      num3 = mat.potencia(num3, 2.0)
      num4 = mat.potencia(num4, 2.0)
	 
      
      se (num3 >= 1000){
      escreva("Seu resultado é:\n", + num3)	
	 	}
	 	
      senao
      escreva("Os números informados são :" + num1 +"," + num2 + "," + num3 + "," + num4)
	
      }

      }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */