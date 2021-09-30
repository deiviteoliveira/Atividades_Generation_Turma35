 // Questão 1

    programa {

    funcao inicio() {

    inteiro peso, excesso, multa

    escreva("Informe o peso dos tomates:")
    leia(peso)

    excesso =  peso - 50

    se (excesso <= 0){

    escreva("Você não tem multa a pagar")
                      }
    senao se ( excesso > 0){
     
    multa = excesso * 4
    escreva ("O seu excesso foi de: "+ excesso + " E sua multa é de:" + multa +",00 Reais")

    }


    }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */