      // Questão 4


        programa {

        funcao inicio() {

        real numero
        caracter letra

        escreva("Digite o índice de poluição: ")
        leia(numero) 

        se(numero<0){
        escreva("Número inválido digite um número positivo.")
        }
        senao se (numero>= 0 e numero <=0.25  ){
        escreva("Índice de poluição aceitável.")
        }

        senao se(numero>=0.3){
        escreva("Suspender atividades das indústrias do 1° Grupo!")
        }

        senao se(numero>=0.4){
        escreva("Suspender atividades das indústrias do 1° e 2° Grupo!")
        }

        senao se (numero>=0.5){
        escreva("Suspender atividades de todos os grupos!!")
        }


        }
        }


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 18; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */