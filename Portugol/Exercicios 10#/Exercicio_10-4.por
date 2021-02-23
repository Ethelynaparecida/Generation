programa
{
	
	funcao inicio()
	{

	
	
		/* 4 Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores 
		 *  dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/

		real matriz[3][3], somatotal = 0.0, somadiagonal = 0.0
		inteiro linha, coluna
		
		para(coluna = 0; coluna<3; coluna ++)
		{
			para (linha = 0; linha<3; linha ++)
			{
				escreva ("Digite o valor para a matriz 1: ")
				leia(matriz[linha][coluna])

				somatotal = somatotal + matriz[linha][coluna]
			

				se (linha==coluna)
				{
					somadiagonal = somadiagonal + matriz[linha][coluna]
				}
			}
		}

		escreva("Soma do total ", somatotal, "\n")
		escreva("Soma do diagonal ", somadiagonal, "\n")

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 772; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 12, 7, 6}-{somatotal, 12, 21, 9}-{somadiagonal, 12, 38, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */