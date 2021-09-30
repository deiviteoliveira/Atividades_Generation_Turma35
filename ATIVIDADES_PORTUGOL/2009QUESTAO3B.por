//QUESTÃO 3B

programa
 {
	//Atividade 3 SEGUNDA PARTE: Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
  
  funcao inicio () {
  
  
inteiro N1 [4][6], N2 [4][6], M2[4][6], linha = 0, coluna = 0
      
   // Aqui a matriz N1:
       
       para(linha = 0; linha < 4; linha ++) {

       para(coluna = 0; coluna <6; coluna ++) {

       escreva("POSIÇÃO :[ ", linha +1 , " ][ " , coluna +1 ,  " ] da 1ª matriz: ") 
       leia(N1[linha][coluna])
     	
       }
       
   // Aqui a matriz N2:

       
       }
       para(linha = 0; linha < 4; linha ++) {

       para(coluna = 0; coluna < 6; coluna ++) {

       escreva("POSIÇÃO :[ ", linha +1 , " ][ " , coluna +1 ,  " ] da 2ª matriz: ") 
       leia(N2[linha][coluna])
       
       }

       }
    //Uma matriz M2, cujos elementos serão as DIFERENÇAS dos elementos de mesma posição
   //das matrizes N1 e N2:
       
      para(linha = 0; linha < 4; linha ++) {
      para(coluna = 0; coluna < 6; coluna ++) {
      M2[linha][coluna] = (N1 [linha][coluna] - N2 [linha][coluna]) 
      	
       }
}

    // aqui a DIFERENÇA da matriz N1 E N2 dentro da matriz M2:
    
     para(linha = 0; linha < 4; linha ++) {
  	para(coluna = 0; coluna < 6; coluna ++) {
     escreva("[" , M2[linha][coluna], "]")

     	
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