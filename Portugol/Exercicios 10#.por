programa
{
	
	funcao inicio()
	{
		/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
		Encontre após a maior pontuação e a apresente.*/


		inteiro vetor[5], num=0, x

		para (x=0;x<5;x++)
		{
			escreva("digite um a valor: ")
			leia(vetor[x])

			se (vetor[x]> num)
			{
				num = vetor[x]
			}
			

			
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = 19;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 10, 10, 5}-{num, 10, 20, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */