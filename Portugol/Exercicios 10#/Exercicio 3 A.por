programa
{
	
	funcao inicio()
	{
		/*3 Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
*/		
		real matriz1[4][6], matriz2[4][6], somamatriz[4][6]
		inteiro coluna, linha

		para(coluna = 0; coluna<6; coluna ++)
		{
			para (linha = 0; linha<4; linha ++)
			{
				escreva ("Digite o valor para a matriz 1: ")
				leia(matriz1[linha][coluna])
			}

						
		}
		para(coluna = 0; coluna<6; coluna ++)
		{
			para (linha = 0; linha<4; linha ++)
			{
				escreva ("Digite o valor para a matriz 2: ")
				leia(matriz2[linha][coluna])

				somamatriz[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna]

				

			}

						
		}

		escreva("A a soma das matrizes é igual a: \n")

		para (linha = 0; linha<4; linha ++)
		{
			
			para(coluna = 0; coluna<6; coluna ++)
			{
				
				escreva(somamatriz[linha][coluna], " | ")
			}
			escreva ("\n")
			
		
		}
			
			
			
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */