programa
{
	
	funcao inicio()
	{
		/*(fácil) Escreva um programa que leia um número do usuário e desenhe o 
		 * número no terminal utilizando asteriscos. Ex:
		*** (se num ==3)
			********** (se num ==10)
		(moderado) Seguindo a ideia do exercício anterior, escreva um programa
		que leia um número e imprima o seguinte padrão:
		Se número == 5

		2  *
		   **
		   
		4  *
		   ** 
		   ***
		   ****
		   
 			*/

		//inicio 1 * final = num digitado

		inteiro num, i, x, cont1 = 0

		escreva("Digita um valor ai: ")
		leia(num)
		
		//esse prineiro para limita a quantidade de linhas
		para(i=1;i<=num;i++)
		{
			/*Esse Para vai contabilizar a quantidade de asteristicos
			a cada vez que ele terminar o cont1++ ira almentar a quantidade
			de *  que ira exibir na proxima linha*/
			para(x=0; x<=cont1 ;x++)
			{
			escreva("*")
				
			}
			
			x=0
			cont1++
		 escreva("\n")	
		}
 			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 839; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 26, 10, 3}-{i, 26, 15, 1}-{x, 26, 18, 1}-{cont1, 26, 21, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */