//QUESTÃO 1
programa
{
	
	funcao inicio()
 {

     inteiro pontuacao[5], maiorPontuacao = 0, contagem 
     

     para (contagem = 0; contagem <5; contagem ++) {

     escreva("Digite a ",contagem +1,"ª pontuação: ")
     leia(pontuacao[contagem])

     se (pontuacao[contagem] > maiorPontuacao){
     	maiorPontuacao = pontuacao[contagem]
     	
     }

     }
     escreva("\nAs pontuações são:->")

     para (contagem = 0; contagem <5; contagem ++) {
     escreva(pontuacao[contagem], ",") 
     }

     escreva ("\n\nEstá é a maior pontuação: ", maiorPontuacao)
     	escreva("\n")
     }

     
     
     
     }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 22; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */