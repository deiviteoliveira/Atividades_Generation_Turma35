          //Introduao aos Algoritimos

         //Questão 1 

         programa {
	
	    funcao inicio() {


            inteiro diaAtual, mesAtual, anoAtual 

            inteiro diaNascimento, mesNascimento, anoNascimento 

            inteiro total 

            

            escreva("Informe seu dia de aniversário :") 

            leia(diaNascimento) 

            escreva("\nInforme o número do mês do seu aniversário :") 

            leia(mesNascimento) 

            escreva("\nInforme o ano do seu aniversário :") 

            leia(anoNascimento) 

             

            escreva("\nInforme o dia atual") 

            leia(diaAtual) 

            escreva("\nInforme o mês atual") 

            leia(mesAtual) 

            escreva("\nInforme o ano atual") 

            leia(anoAtual) 

    		 

    		total = (anoAtual - anoNascimento) * 365 + (mesAtual * 30 + diaAtual) - (mesNascimento * 30 + diaNascimento) 

    		 

    		escreva("Sua idade em dias é :" + total) 

    				 

	} 

} 

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 7; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */