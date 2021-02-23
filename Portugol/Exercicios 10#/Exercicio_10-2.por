programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		/*2 Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, 
		escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas
		foram as ocorrências da maior pontuação.*/

		inteiro lancamento[10], x, soma =0, cont = 0

		para (x=0;x<10;x++)
		{
			lancamento[x] = u.sorteia(1, 6)

			soma = soma + lancamento[x]

			escreva (x+1, "º valor = ", lancamento[x], "\n")

			se (lancamento[x] == 6)
			{
				cont++
			}
		}
		soma = soma/10
		escreva("\nMedia igual a ", soma)
		escreva("\nO valor 6 foi sorteado ", cont, " vez(es)")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {lancamento, 11, 10, 10}-{soma, 11, 29, 4}-{cont, 11, 38, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */