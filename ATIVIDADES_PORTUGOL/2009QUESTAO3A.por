//QUESTÃO 3A

programa{
	funcao inicio(){
		inteiro N1[4][6] , N2[4][6], linha, coluna, M1[4][6]

		para (linha = 0; linha < 4; linha++) {
			para (coluna = 0; coluna < 6; coluna++) {
				escreva("Escreva o valor da posição [ " , linha+1 , " ][ " , coluna+1 , " ] da primeira matriz: " )
				leia(N1[linha][coluna])	
				}			
		}
		para (linha = 0; linha < 4; linha++) {
			para (coluna = 0; coluna < 6; coluna++) {
				escreva("Escreva o valor da posição [ " , linha+1 , " ][ " , coluna+1 , " ] da segunda matriz: " )
				leia(N2[linha][coluna])							
			}			
		}
		para (linha = 0; linha < 4; linha++) {
			para (coluna = 0; coluna < 6; coluna++) {
				M1[linha][coluna] = (N1[linha][coluna] + N2[linha][coluna])		
			}			
		}
		para (linha = 0; linha < 4; linha++) {
			para (coluna = 0; coluna < 6; coluna++){
				escreva("[ ", M1[linha][coluna] , " ]")
			}
			escreva("\n")
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