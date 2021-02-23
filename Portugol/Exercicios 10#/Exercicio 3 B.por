programa
{
	
	funcao inicio()
	{
		/*3 Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		   b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2

*/		
		real matriz1[4][6], matriz2[4][6], diferencamatriz[4][6]
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

				diferencamatriz[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna]
			}

						
		}
		
		
		para (linha = 0; linha<4; linha ++)
		{
			
			para(coluna = 0; coluna<6; coluna ++)
			{
				
				escreva(diferencamatriz[linha][coluna], " | ")
			}
			escreva ("\n")
			
		
			}
	}
		

		/*para(coluna = 0; coluna<2; coluna ++)
		{
			para (linha = 0; linha<2; linha ++)
			{
				somamatriz[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna]
			}*/

						
		}
		
1
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 837; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz1, 11, 7, 7}-{matriz2, 11, 22, 7}-{diferencamatriz, 11, 37, 15};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */