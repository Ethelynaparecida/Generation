programa
{
	
	funcao inicio()
	{
		/*Crie um programa utilizando laços de repetição aninhados que exiba na 
		tela a tabuada de multiplicação dos números de 1 a 2. Imprima somente a tabuada de
		valores pares e multiplique eles somente por palores pares*/ 

		inteiro i, mult, x 
		real imp
		
		para(i=1; i<10; i++)
		{
			imp = i % 2

			se(imp == 0)
			{
					
				para (x=1;x<11; x++)
				{
					imp = x % 2
					se(imp == 0)
					{
					escreva (i, " x ", x, " = ", i*x, "\n")	
					}
				}
			}
			
		escreva("\n")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */