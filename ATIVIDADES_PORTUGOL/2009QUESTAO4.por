//QUESTÃO 4 (FEITA COM O ESTRUTOR EM SALA)

programa
{
	
	funcao inicio()
	{

  inteiro matriz [3][3], linha, coluna, sGeral = 0, sDiagonal = 0, soma

     para (linha = 0; linha < 3; linha ++) {

     	para (coluna = 0; coluna < 3; coluna ++) {

     		escreva("Digite o valor da posição: [", linha +1, ".", coluna +1, " ]: ")
     		leia (matriz[linha][coluna])
     			
     	}
 
      soma = matriz[1][1] + matriz [2][2] + matriz [3][3] 
      
     	para (linha = 0; linha < 3; linha ++) {
     		para (coluna = 0; coluna < 3; coluna ++){

     			sGeral += matriz [linha][coluna]

     			se (linha == coluna) {


     				sDiagonal += matriz [linha][coluna]
     			}
     			
     			
     		}
     	}
     }
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */