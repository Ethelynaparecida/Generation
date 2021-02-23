programa
{
	
	funcao inicio()
	{


		/* 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
		 *  e se é positivo ou negativo.*/


		inteiro n, resto


		
		escreva("Digite o valor: ")
		leia (n)

		resto = n % 2

		se( resto == 0){
			escreva("O numero ", n, " é  par")
		
		}senao{
			escreva("O numero ", n, " é  impar")
		}
		
		se (n>=0){
		escreva(" e positivo")
		}senao{
		escreva(" e negativo")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 450; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */