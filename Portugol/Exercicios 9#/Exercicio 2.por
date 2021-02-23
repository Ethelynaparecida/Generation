programa
{
	
	funcao inicio()
	{

		/* 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram 
		no conjunto dos números de 1 até 500.*/

		inteiro x, soma=0 
		real imp=0, mul=0
		para(x=1;x<=500;x++)
		{
			imp = x % 2
			mul = x % 3

			se(imp!=0 e mul ==0)
			{
				 
				escreva(" ", x)
				soma = soma + x
				
			}
			
		}
		escreva ("\nA soma total é de ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */