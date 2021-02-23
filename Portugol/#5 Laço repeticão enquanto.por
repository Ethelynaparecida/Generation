programa
{
	
	funcao inicio()
	{
		
		inteiro somapar=0, somaimpar=0, x,num
		
		escreva("entre com numero: ")
		leia(num)

		enquanto(num!=0)
		{

			se(num%2==0)
			{
				somapar = somapar+ num
			}
			senao
			{
				somaimpar = somaimpar + num
			}
			escreva("entre com numero: ")
			leia(num)
		}
		escreva("\nSoma par: ")
		escreva ("\nSoma impar: ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */