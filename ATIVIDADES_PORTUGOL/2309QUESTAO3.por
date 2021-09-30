
       programa { 

 			 

       inclua biblioteca Matematica --> math 

        

	  funcao inicio()  { 

  

      real x1, x2, y1, y2, d 

  

      escreva("Escreva x1 : ") 

      leia(x1) 

      escreva("Escreva x2 : ") 

      leia(x2) 

      escreva("Escreva y1 : ") 

      leia(y1) 

      escreva("Escreva y2 : ") 

      leia(y2) 

  

      d = math.raiz(math.potencia((x2 - x1), 2.0) + math.potencia((y2 - y1), 2.0), 2.0) 

  

      escreva(d) 

     
	} 

} 


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 105; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */